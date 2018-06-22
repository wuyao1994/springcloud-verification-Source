package com.aaxiscommerce.domain;

import javax.validation.constraints.NotNull;

import org.joda.time.DateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BillingAccount {

	/**
	 * Flag indicate user whether has a billing account
	 */
	@NotNull
	private boolean billingAccountIndicator;

	@NotNull
	private String id;

	/**
	 * id in external system
	 */
	private String externalId;

	/**
	 * Type of customer document, e.g: RUT, DNI, Passport
	 */
	@NotNull
	private String userDocumentType;

	/**
	 * Customer document numbe
	 */
	@NotNull
	private String userDocumentID;

	/**
	 * Total balance of all customer's billing account
	 */
	@NotNull
	private String totalBalance;

	@NotNull
	private String emailAddress;

	@NotNull
	private String phoneNumber;

	@NotNull
	private String clientName;

	/**
	 * Billing account expiration date
	 */
	@NotNull
	private DateTime expireDate;

	/**
	 * Billing create expiration date
	 */
	@NotNull
	private DateTime createDate;

	/**
	 * Balance of corresponding account
	 */
	@NotNull
	private String accountBalance;

	/**
	 * Same as userDocumentID
	 */
	@NotNull
	private String documentNumber;

	/**
	 * Billing Address
	 */
	@NotNull
	private String collectionAddress;

	/**
	 * Boleta or Factura, both of them are receipt but different in essence.
	 */
	@NotNull
	private String correlativeType;

	/**
	 * Related code according to correlativeType.
	 */
	@NotNull
	private String documentTypeCode;

	/**
	 * Always as same as document id
	 */
	private String taxDocumentID;

	/**
	 * Always as same as document type
	 */
	private String taxDocumentType;

	/**
	 * Tax Condition
	 */
	private String taxStatus;

	/**
	 * Type of Proof (Email or paper)
	 */
	private String billSentBy;
}
