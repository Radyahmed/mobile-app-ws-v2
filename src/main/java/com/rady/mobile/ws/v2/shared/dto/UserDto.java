package com.rady.mobile.ws.v2.shared.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserDto implements Serializable {

	private static final long serialVersionUID = 7371418411301330837L;
	private String id;
	private String userId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String encryptedPassword;
	private String emailVerificationToken;
	private Boolean emailVerificationStatus = false;

}
