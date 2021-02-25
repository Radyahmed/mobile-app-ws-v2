package com.rady.mobile.ws.v2.ui.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rady.mobile.ws.v2.shared.dto.UserDto;
import com.rady.mobile.ws.v2.ui.model.request.UserDetailsRequestModel;
import com.rady.mobile.ws.v2.ui.model.response.UserRest;
import com.rady.mobile.ws.v2.user.service.UserService;

@RestController
@RequestMapping("users")
public class UserController {
	@Autowired
	UserService UseruserService;

	@GetMapping(path = "/{id}")
	public UserRest getUser(@PathVariable String id) {
		UserRest returnValue = new UserRest();
		UserDto  userDto=UseruserService.getUserByUserId(id);
		BeanUtils.copyProperties(userDto, returnValue);
		return returnValue;

	}

	@PostMapping
	public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {
		UserRest returnValue = new UserRest();
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(userDetails, userDto);
		UserDto createdUser = UseruserService.createUser(userDto);
		BeanUtils.copyProperties(createdUser, returnValue);
		return returnValue;

	}

	@PutMapping
	public String updateUser() {
		return "update user was called";
	}

	@DeleteMapping
	public String deleteUser() {
		return "delete user was called";
	}
}
