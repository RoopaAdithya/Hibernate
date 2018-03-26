
package com.roopa;
public class College {

	private int collegeId;
	private String collegeName;
	private String addrss;
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getAddrss() {
		return addrss;
	}
	public void setAddrss(String addrss) {
		this.addrss = addrss;
	}
	
	public College() {
		super();
	}
	@Override
	public String toString() {
		return  collegeId+" "+collegeName+" "+addrss;
	}
	
	
}
