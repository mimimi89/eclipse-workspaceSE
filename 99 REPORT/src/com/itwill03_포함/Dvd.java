package com.itwill03_포함;

public class Dvd {
	
	private int no;
	private String title;
	private String genre;
	
	
	public Dvd() {
		super();
	}


	public Dvd(int no, String title, String genre) {
		super();
		this.no = no;
		this.title = title;
		this.genre = genre;
	}
	
	
	public void print() {
		System.out.println(this.no+" / "+this.title+" / "+this.genre);
	}


	public int getNo() {
		return no;
	}


	public String getTitle() {
		return title;
	}


	public String getGenre() {
		return genre;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void setDvd(int no, String title, String genre) {
		this.no=no;
		this.title=title;
		this.genre=genre;
	}
	
	
	
	
	
	

}
