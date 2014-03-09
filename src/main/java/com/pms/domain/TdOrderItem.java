package com.pms.domain;

public class TdOrderItem {
	String ItemID;
	String ItemName;
	String Quantity;
	String ItemPrice;
	String Size;
	OptionalModifier[] OptionalModifier;

	public OptionalModifier[] getOptionalModifier() {
		return OptionalModifier;
	}

	public void setOptionalModifier(OptionalModifier[] optionalModifier) {
		OptionalModifier = optionalModifier;
	}

	public String getItemID() {
		return ItemID;
	}

	public void setItemID(String itemID) {
		ItemID = itemID;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public String getQuantity() {
		return Quantity;
	}

	public void setQuantity(String quantity) {
		Quantity = quantity;
	}

	public String getItemPrice() {
		return ItemPrice;
	}

	public void setItemPrice(String itemPrice) {
		ItemPrice = itemPrice;
	}

	public String getSize() {
		return Size;
	}

	public void setSize(String size) {
		Size = size;
	}

}
