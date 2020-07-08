package com.itwill03.포함;


public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember m1=new DvdMember(1,"KIM","123-4567",null);
		
		/*
		 * Dvd객체생성
		 */
		Dvd dvd1=new Dvd(123,"영화1","전쟁");
		
		/*
		 * 회원이Dvd을 대여
		 * 
		 * Dvd객체참조변수를 회원의 멤버변수에대입
		 */
		m1.setDvd(dvd1);
		
		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */
		m1.print();
		
	}

}
