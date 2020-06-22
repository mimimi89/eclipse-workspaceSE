package com.itwill13_포함;

public class DvdMember {
	
	int memNo;		 	
	String memName;		
	int phoneNumber;	
	String dvdTitle;		
	Dvd dvd;
	
	
	public DvdMember() {
		super();
	}
	
	public DvdMember(int memNo, String memName, int phoneNumber) {
		super();
		this.memNo = memNo;
		this.memName = memName;
		this.phoneNumber = phoneNumber;
	}


	public DvdMember(int memNo, String memName, int phoneNumber, String dvdTitle, Dvd dvd) {
		super();
		this.memNo = memNo;
		this.memName = memName;
		this.phoneNumber = phoneNumber;
		this.dvdTitle = dvdTitle;
		this.dvd = dvd;
	}		
	
	
	public void print() {
		System.out.println(this.memNo+"--"+this.memName+"--"+this.phoneNumber);
		this.dvd.print();
	}

	public int getMemNo() {
		return memNo;
	}

	public String getMemName() {
		return memName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public String getDvdTitle() {
		return dvdTitle;
	}

	public Dvd getDvd() {
		return dvd;
	}

	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setDvdTitle(String dvdTitle) {
		this.dvdTitle = dvdTitle;
	}

	public void setDvd(Dvd dvd) {
		this.dvd = dvd;
	}
	
	public void setDvdMember(int memNo, String memName, int phoneNumber, String dvdTitle, Dvd dvd) {
		this.memNo = memNo;
		this.memName = memName;
		this.phoneNumber = phoneNumber;
		this.dvdTitle = dvdTitle;
		this.dvd = dvd;
	}
	
	
	

}
