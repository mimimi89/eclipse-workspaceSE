package jiaokeshu_07_배열과ArrayList_array;

public class Book {
	
	/*
	 * 멤버필드
	 */
	private String bookName;
	private String author;
	//외부에서 접근불가
	
	/*
	 * 생성자메쏘드
	 */
	public Book() {}	//디폴트생성자
	public Book(String bookName, String author) {
		super();
		this.bookName = bookName;
		this.author = author;
	}
	
	/*
	 * 책의 정보를 보여주는 메쏘드
	 */
	public void showBookInf() {
		System.out.println(bookName+", "+author);
	}
	
	/*
	 * getter, setter메쏘드
	 */
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	
	
	
	

}
