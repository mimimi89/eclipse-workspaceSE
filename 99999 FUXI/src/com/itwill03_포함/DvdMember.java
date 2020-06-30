package com.itwill03_포함;


public class DvdMember {
	
	private int no;
	private String name;
	private String phoneNumber;
	private Dvd dvd;

	
	public DvdMember() {
		super();
	}


	public DvdMember(int no, String name, String phoneNumber) {
		super();
		this.no = no;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public void print() {
		System.out.println();
		System.out.println(this.no+" / "+this.name+" / "+this.phoneNumber);
		System.out.println("----------------------------------------------");
		dvd.print();
		System.out.println();
	}


	public int getNo() {
		return no;
	}


	public String getName() {
		return name;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public Dvd getDvd() {
		return dvd;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public void setDvd(Dvd dvd) {
		this.dvd = dvd;
	}
	
	
	
	
	
	
	
	
	
}
