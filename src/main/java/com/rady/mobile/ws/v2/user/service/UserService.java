package com.rady.mobile.ws.v2.user.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.rady.mobile.ws.v2.shared.dto.UserDto;

public interface UserService extends UserDetailsService {
	UserDto createUser(UserDto user);
}
