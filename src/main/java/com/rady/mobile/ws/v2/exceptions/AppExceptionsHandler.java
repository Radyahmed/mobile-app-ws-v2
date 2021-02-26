package com.rady.mobile.ws.v2.exceptions;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.rady.mobile.ws.v2.ui.model.response.ErrorMessage;

@ControllerAdvice
public class AppExceptionsHandler {
	@ExceptionHandler(value = { UserServiceException.class })
	public ResponseEntity<Object> handlerUserServiceException(UserServiceException exception, WebRequest request) {
		ErrorMessage message = new ErrorMessage(new Date(), exception.getMessage());
		return new ResponseEntity<Object>(message, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(value = { Exception.class })
	public ResponseEntity<Object> handlerOtherException(Exception exception, WebRequest request) {
		ErrorMessage message = new ErrorMessage(new Date(), exception.getMessage());
		return new ResponseEntity<Object>(message, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
