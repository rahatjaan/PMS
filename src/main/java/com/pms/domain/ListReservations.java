package com.pms.domain;

import java.util.List;

public class ListReservations {
	private String namePrefix;
	private String requestorId;
	private String loyaltyCardNumber;
	private List<ReservationDetails> resDetails;
	private String error;
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String name) {
		this.firstName = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String name) {
		this.lastName = name;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getLoyaltyCardNumber() {
		return loyaltyCardNumber;
	}
	public void setLoyaltyCardNumber(String loyaltyCardNumber) {
		this.loyaltyCardNumber = loyaltyCardNumber;
	}
	public String getNamePrefix() {
		return namePrefix;
	}
	public void setNamePrefix(String namePrefix) {
		this.namePrefix = namePrefix;
	}
	public List<ReservationDetails> getResDetails() {
		return resDetails;
	}
	public void setResDetails(List<ReservationDetails> resDetails) {
		this.resDetails = resDetails;
	}
}
