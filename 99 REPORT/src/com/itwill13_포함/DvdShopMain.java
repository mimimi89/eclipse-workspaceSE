package com.itwill13_포함;

public class DvdShopMain {

	public static void main(String[] args) {
		
		DvdMember m1=new DvdMember(520, "김미영", 142364672);

		Dvd d1=new Dvd();
		
		d1.setNo(666);
		d1.setTitle("결백");
		d1.setGenre("드라마");
		
		m1.setDvd(d1);
		
		m1.print();

	}

}
