package com.itwill13_포함;

public class BookMember {
	
	//멤버필드
		int memNo;		 	//회원번호
		String memName;		//회원이름
		int phoneNumber;	//연락처
		String bookTitle;		//빌린 책
		Book book;		//빌린 책의 내역(클래스 Book)
		
		//생성자
		public BookMember() {
			super();
		}
		
		

		public BookMember(int memNo, String memName, int phoneNumber) {
			super();
			this.memNo = memNo;
			this.memName = memName;
			this.phoneNumber = phoneNumber;
		}



		public BookMember(int memNo, String memName, int phoneNumber, String bookTitle, Book book) {
			super();
			this.memNo = memNo;
			this.memName = memName;
			this.phoneNumber = phoneNumber;
			this.bookTitle = bookTitle;
			this.book = book;
		}
		
		
		//출력메쏘드
		public void print() {
			System.out.println(this.memNo+"--"+this.memName+"--"+this.phoneNumber+"--"+this.bookTitle);
			this.book.print();
		}

		//getter, setter

		public int getMemNo() {
			return memNo;
		}



		public String getMemName() {
			return memName;
		}



		public int getPhoneNumber() {
			return phoneNumber;
		}



		public String getBookTitle() {
			return bookTitle;
		}



		public Book getBook() {
			return book;
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



		public void setBookTitle(String bookTitle) {
			this.bookTitle = bookTitle;
		}



		public void setBook(Book book) {
			this.book = book;
		}


		
		public void setBookMember(int memNo, String memName, int phoneNumber, String bookTitle, Book book) {
			this.memNo = memNo;
			this.memName = memName;
			this.phoneNumber = phoneNumber;
			this.bookTitle = bookTitle;
			this.book = book;
		}
	
	

}
