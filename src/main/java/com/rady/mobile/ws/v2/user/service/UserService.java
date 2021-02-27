package com.rady.mobile.ws.v2.user.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.rady.mobile.ws.v2.shared.dto.UserDto;

public interface UserService extends UserDetailsService {
	UserDto createUser(UserDto user);

	UserDto getUser(String email);

	UserDto getUserByUserId(String id);

	UserDto updateUser(String id, UserDto userDto);

	void deleteUser(String id);

	List<UserDto> getUsers(int page, int limit);

}
