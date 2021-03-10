package com.rady.mobile.ws.v2.shared.dto;

import lombok.Data;

@Data
public class AddressDTO {
	private long id;
	private String addressid;
	private String city;
	private String country;
	private String streetName;
	private String postalCode;
	private String type;
	private UserDto userDetails;

}
