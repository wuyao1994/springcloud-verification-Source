package com.aaxiscommerce.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GeographicalAddress {

	private String country;

	private String state;

	private String city;

	/**
	 * Name of street/avenue
	 */
	private String street;

	private String streetNumber;

	private String apartmentNumber;

	/**
	 * Complement of the address. Block, condominium, etc.
	 */
	private String additionalAddressInfo;

	private String zipCode;

	private boolean validateIndicator;
}
