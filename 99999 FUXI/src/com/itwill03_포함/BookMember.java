package com.itwill03_포함;


public class BookMember {
	
	private int no;
	private String name;
	private String phoneNumber;
	private Book book;
	
	public BookMember() {
		super();
	}

	public BookMember(int no, String name, String phoneNumber) {
		super();
		this.no = no;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}//빌린 책을 포함하지 않는 생성자 메쏘드, 기본정보만
	
	public void bmPrint() {
		System.out.print(this.no+"\t"+this.name+"\t"+this.phoneNumber+"\n");
		System.out.println("----------------------------------------------------------------------");
		book.print();
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

	public Book getBook() {
		return book;
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

	public void setBook(Book book) {
		this.book = book;
	}
	
	
	
	
	
	
	
	
}
