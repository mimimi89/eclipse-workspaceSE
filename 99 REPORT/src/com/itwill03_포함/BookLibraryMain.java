package com.itwill03_포함;


public class BookLibraryMain {

	public static void main(String[] args) {
		
		
		
				//회원 객체 생성
				BookMember m1=new BookMember(520, "김미영", 142364672);
	
				//책 객체 생성
				Book b1=new Book();
				Book b2=new Book();
				
				//회원이 책 대여
				b1.setNo(1);
				b1.setTitle("기억1");
				b1.setCategory("소설");
				b1.setExplain("베르나르 베르베르의 신작 장편소설");
				
				
				//책 객체 참조 변수를 회원의 멤버 변수에 대입
				m1.setBook(b1);
				
				
				
				//회원 정보 출력
				
				m1.print();
	}

}
