package com.rady.mobile.ws.v2.ui.model.response;

public enum ErrorMessages {
	MISSING_REQUIRED_FIELD("Missing required field. please check documentation for required fields"),
	RECORD_ALREADY_EXISTS("Record already exists"), iNTERNAL_SERVER_ERROR("internal server error"),
	NO_RECORD_FOUND("Record with provided id is not found"), AUTHENTICATION_FAILED("Authentication failed"),
	COULD_NOT_UPDATE_RECORD("could not update record"), COULD_NOT_DELETE_RECORD("could not delete record"),
	EMAIL_ADDRESS_NOT_VERIFIED("email address could not be verified");

	private String errorMessageString;

	private ErrorMessages(String errorMessageString) {
		this.errorMessageString = errorMessageString;
	}

	public String getErrorMessageString() {
		return errorMessageString;
	}

	public void setErrorMessageString(String errorMessageString) {
		this.errorMessageString = errorMessageString;
	}

}
