package com.itwill03_포함;

public class Book {
	
	private int bookNo;
	private String title;
	private String category;
	private String explanation;
	
	public Book() {
		super();
	}

	public Book(int bookNo, String title, String category, String explanation) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.category = category;
		this.explanation = explanation;
	}
	
	public void print() {
		System.out.println("대출한 책: "+this.bookNo+" /  "+this.title+" /  "+this.category+" /  "+this.explanation);
	}
	
	
	public int getBookNo() {
		return bookNo;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	
	
	
	
	
	
	
}
