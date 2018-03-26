package com.beans;

public class BankBean {

	private int bankId;
	private String bankName;
	private String address;
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "BankBean [bankId=" + bankId + ", bankName=" + bankName
				+ ", address=" + address + "]";
	}
	
	
	
	
}
