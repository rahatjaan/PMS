package com.pms.domain;

import java.io.Serializable;

public class OptionalModifier implements Serializable{
	
	private static final long serialVersionUID = -4670729213519172888L;
	String ID, Name, Price;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}
}
