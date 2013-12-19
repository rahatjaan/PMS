package com.pms.domain;

import java.io.Serializable;

import java.lang.StringBuilder;
import java.math.BigDecimal;

import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */
public class UpdateReservationReq {

	String cardType;	
	String cardNumber;	
	String specialRequests;	
	String cvvNumber;	
	String folioNumber;
	String currencyCode;
	String cardExpiryDate;
	String numberOfChildren;
	String numberOfAdults;
	String isCheckedOut;
	//Guest Info
	String namePrefix;
	String firstName;
	String lastName;
	
	String roomId;

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getSpecialRequests() {
		return specialRequests;
	}

	public void setSpecialRequests(String specialRequests) {
		this.specialRequests = specialRequests;
	}
	/**
	 */
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	/**
	 */
	public String getCardType() {
		return this.cardType;
	}

	/**
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 */
	public String getCardNumber() {
		return this.cardNumber;
	}

	/**
	 */
	public void setCvvNumber(String cvvNumber) {
		this.cvvNumber = cvvNumber;
	}

	/**
	 */
	public String getCvvNumber() {
		return this.cvvNumber;
	}

	/**
	 */
	public void setFolioNumber(String folioNumber) {
		this.folioNumber = folioNumber;
	}

	/**
	 */
	public String getFolioNumber() {
		return this.folioNumber;
	}

	/**
	 */
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 */
	public String getCurrencyCode() {
		return this.currencyCode;
	}

	/**
	 */
	public void setCardExpiryDate(String cardExpiryDate) {
		this.cardExpiryDate = cardExpiryDate;
	}

	/**
	 */
	public String getCardExpiryDate() {
		return this.cardExpiryDate;
	}

	/**
	 */
	public void setNumberOfChildren(String numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}

	/**
	 */
	public String getNumberOfChildren() {
		return this.numberOfChildren;
	}

	/**
	 */
	public void setNumberOfAdults(String numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}

	/**
	 */
	public String getNumberOfAdults() {
		return this.numberOfAdults;
	}

	/**
	 */
	public void setIsCheckedOut(String isCheckedOut) {
		this.isCheckedOut = isCheckedOut;
	}

	/**
	 */
	public String getIsCheckedOut() {
		return this.isCheckedOut;
	}

	public String getNamePrefix() {
		return namePrefix;
	}

	public void setNamePrefix(String namePrefix) {
		this.namePrefix = namePrefix;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
