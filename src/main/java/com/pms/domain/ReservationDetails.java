package com.pms.domain;

import java.util.List;


public class ReservationDetails {
	
	
	private String confirmationNumber;
	private int numberOfChildren;
	private int numberOfAdults;
	private String stayFromDate;
	private String stayToDate;
	private String totalForStay;
	private String maskedCardNumber;
	private String isCheckedOut;
	private String currencyCode;
	private ResRoom room;
	private String specialRequests;
	private String loyaltyNumber;
	
		
	public String getLoyaltyNumber() {
		return loyaltyNumber;
	}
	public void setLoyaltyNumber(String loyaltyNumber) {
		this.loyaltyNumber = loyaltyNumber;
	}
	public String getIsCheckedOut() {
		return isCheckedOut;
	}
	public void setIsCheckedOut(String isCheckedOut) {
		this.isCheckedOut = isCheckedOut;
	}
	public String getSpecialRequests() {
		return specialRequests;
	}
	public void setSpecialRequests(String specialRequests) {
		this.specialRequests = specialRequests;
	}
	public ResRoom getRoom() {
		return room;
	}
	public void setRoom(ResRoom room) {
		this.room = room;
	}
	public String getConfirmationNumber() {
		return confirmationNumber;
	}
	public void setConfirmationNumber(String confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}
	public int getNumberOfChildren() {
		return numberOfChildren;
	}
	public void setNumberOfChildren(int numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}
	public int getNumberOfAdults() {
		return numberOfAdults;
	}
	public void setNumberOfAdults(int numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}
	public String getStayFromDate() {
		return stayFromDate;
	}
	public void setStayFromDate(String stayFromDate) {
		this.stayFromDate = stayFromDate;
	}
	public String getStayToDate() {
		return stayToDate;
	}
	public void setStayToDate(String stayToDate) {
		this.stayToDate = stayToDate;
	}
	public String getTotalForStay() {
		return totalForStay;
	}
	public void setTotalForStay(String totalForStay) {
		this.totalForStay = totalForStay;
	}
	public String getMaskedCardNumber() {
		return maskedCardNumber;
	}
	public void setMaskedCardNumber(String maskedCardNumber) {
		this.maskedCardNumber = maskedCardNumber;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	
}
