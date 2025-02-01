package org.adarsh.SpringDemo;

public class Address {
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", pincode=" + pincode + "]";
	}

	private String houseNo;
	private String pincode;

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
}
