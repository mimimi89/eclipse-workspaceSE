package com.itwill03.포함;


public class BookMember {
	//회원번호
	private int no;
	//회원이름
	private String name;
	//전화번호
	private String phoneNumber;
	//빌린책들
	private Book book;
	public BookMember() {
		
	}
	


	public BookMember(int no, String name, String phoneNumber, Book book) {
		super();
		this.no = no;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.book = book;
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public Book getBook() {
		return book;
	}



	public void setBook(Book book) {
		this.book = book;
	}



	public void print() {
		System.out.print(no+"\t"+name+"\t"+phoneNumber+"\t");
		if(book!=null) {
			book.print();
		}
	}
	
	
	
	
}
