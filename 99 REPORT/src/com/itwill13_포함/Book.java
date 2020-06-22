package com.itwill13_포함;

public class Book {
	
	//멤버필드
		private int no;				//책 번호
		private String title;		//책 제목
		private String category;	//책 분류
		private String explain;		//책 설명
		
		//생성자
		public Book() {
			super();
		}

		public Book(int no, String title, String category, String explain) {
			super();
			this.no = no;
			this.title = title;
			this.category = category;
			this.explain = explain;
		}
		
		//출력메쏘드
		public void print() {
			System.out.println(this.no+" / "+this.title+" / "+this.category+" / "+this.explain);
		}
		
		//getter, setter

		public int getNo() {
			return no;
		}

		public void setNo(int no) {
			this.no = no;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getExplain() {
			return explain;
		}

		public void setExplain(String explain) {
			this.explain = explain;
		}
		
		public void setBook(int no, String title, String category, String explain) {
			this.no = no;
			this.title = title;
			this.category = category;
			this.explain = explain;
		}
		

}
