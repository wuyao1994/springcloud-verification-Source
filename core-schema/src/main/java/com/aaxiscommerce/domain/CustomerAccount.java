package com.aaxiscommerce.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CustomerAccount {

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    private String maidenName;

    private String aliasName;

    /**
     *Male, Female or Unknown
     */
    private String gender;

    /**
     * Format: YYYYMMDDTHH:MM:SSTZ
     */
    @DateTimeFormat(pattern = "YYYYMMDDTHH:MM:SSTZ")
    private DateTime birthDate;

    /**
     * Flag indicating whether user accept "conditions of use"
     */
    @NotNull
    private boolean conditionsOfUseAcceptanceIndicator;

    /**
     * Lifecycle status of the account
     */
    @NotNull
    private String accountStatus;

    /**
     *Flag indicating whether the account is active or inactive
     */
    @NotNull
    private boolean accountActiveStatus;

    /**
     * e.g: Personal or Business
     */
    @NotNull
    private String accountType;

    /**
     * Last date that the client became active in webSite
     */
    @NotNull
    private DateTime activationDate;

    /**
     * Email to be sent the voucher / invoice
     */
    private String alternativeEmailAddress;

    /**
     * Cellphone number
     */
    @NotNull
    private String alternativePhoneNumber;

    /**
     * Cellphone number
     */
    private String alternativeFaxNumber;

    /**
     * Fixed-line telephone number
     */
    private String alternativeTelephoneNumber;

    /**
     * Type of customer document, e.g: RUT/RUC, DNI,Passport
     */
    @NotNull
    private String identityType;

    /**
     * Customer document number
     */
    @NotNull
    private String identityNumber;

    /**
     * Preferred method of communication, E.g: Email, Phone Call, registered letter
     */
    private String preferredContactMethod;

    /**
     * Preferred method of communication, E.g: Email, Phone Call, registered letter
     */
    private DateTime accountLastUpdateDate;
    /**
     * Flag indicating whether the client subscribe for receive promotion, campaign and so on.
     */
    private boolean emailSubscriptionStatus;

    private String socialMediaContactAccount;

    /**
     * User group which to receive different market campaign, promotion or price
     */
    private String marketSegmentGroup;

    /**
     * Flag indicating whether the user belongs to loyalty program
     */
    private boolean loyaltyProgramMember;

    /**
     * Loyalty Program identifier id
     */
    private String loyaltyProgramMemberNumber;
    private Address[] address;

}
