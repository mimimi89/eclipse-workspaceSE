package com.itwill03_포함;


public class Dvd {
	private int dvdNo;
	private String title;
	private String genre;
	
	
	public Dvd() {
		super();
	}
	
	
	public Dvd(int dvdNo, String title, String genre) {
		super();
		this.dvdNo = dvdNo;
		this.title = title;
		this.genre = genre;
	}
	
	
	public void print() {
		System.out.println("대여한 dvd: "+this.dvdNo+" / "+this.title+" / "+this.genre);
	}
	
	public int getDvdNo() {
		return dvdNo;
	}
	public String getTitle() {
		return title;
	}
	public String getGenre() {
		return genre;
	}
	public void setDvdNo(int dvdNo) {
		this.dvdNo = dvdNo;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	
	
	
	
	
	
	
}
