package com.pms.domain;

import java.io.Serializable;
import java.util.List;

public class TdOrder implements Serializable{

	private static final long serialVersionUID = 9036914103496967258L;
	String TicketNumber;
	String TicketType;
	String TableNumber;
	List<TdOrderItem> tdItem;
	String[] specialRequest;
	
	public List<TdOrderItem> getTdItem() {
		return tdItem;
	}
	public void setTdItem(List<TdOrderItem> tdItem) {
		this.tdItem = tdItem;
	}
	
	public String getTicketNumber() {
		return TicketNumber;
	}
	public void setTicketNumber(String ticketNumber) {
		TicketNumber = ticketNumber;
	}
	public String getTicketType() {
		return TicketType;
	}
	public void setTicketType(String ticketType) {
		TicketType = ticketType;
	}
	public String getTableNumber() {
		return TableNumber;
	}
	public void setTableNumber(String tableNumber) {
		TableNumber = tableNumber;
	}
	public String[] getSpecialRequest() {
		return specialRequest;
	}
	public void setSpecialRequest(String[] specialRequests) {
		this.specialRequest = specialRequests;
	}

}
