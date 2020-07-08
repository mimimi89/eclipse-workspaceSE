package com.itwill03.포함;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember bookMember=new BookMember(1, "KIM", "011-235-5694", null);
		/*
		 * 책객체생성
		 */
		Book book=new Book(46372, "책제목1", "문학", "좋은책1");
		
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 */
		bookMember.setBook(book);
		/*
		 * 회원정보출력(회원정보와 회원이빌린들책정보출력)
		 */
		bookMember.print();
		
	}
}
