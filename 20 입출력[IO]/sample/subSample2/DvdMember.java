package com.itwill03.포함;


public class DvdMember {
	private int no;//회원번호
	private String name;//회원이름
	private String tel;//전화번호
	private Dvd dvd;//dvd
	public DvdMember() {
		// TODO Auto-generated constructor stub
	}
	public DvdMember(int no, String name, String tel, Dvd dvd) {
		super();
		this.no = no;
		this.name = name;
		this.tel = tel;
		this.dvd = dvd;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Dvd getDvd() {
		return dvd;
	}
	public void setDvd(Dvd dvd) {
		this.dvd = dvd;
	}
	public void print() {
		System.out.print(no+"\t"+name+"\t"+tel+"\t");
		if(dvd!=null) {
			dvd.print();
		}
	}

	
}
