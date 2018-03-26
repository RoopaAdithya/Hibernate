package com.beans;

import java.io.Serializable;

public class StudentBean implements Serializable{

	private int sid;
	private String studentName;
	private String address;
	private long mobileNo;
	private int sub1;
	private int sub2;
	private int sub3;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	@Override
	public String toString() {
		return "StudentBean [sid=" + sid + ", studentName=" + studentName
				+ ", address=" + address + ", mobileNo=" + mobileNo + ", sub1="
				+ sub1 + ", sub2=" + sub2 + ", sub3=" + sub3 + "]";
	}
	
	
	
	
}
