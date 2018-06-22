package com.aaxiscommerce.domain;

import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Address {

	private String addressName;

	private String addressNumber;

	private boolean primaryAddressIndicator;

	private GeographicalAddress[] geographicalAddress;

	private String civilStatus;

	@DateTimeFormat(pattern = "MMDD")
	private DateTime weddingAnniversaryDate;

	/**
	 * International call prefix eg:+56
	 */
	private String contactPhoneNumberPrefix;
}
