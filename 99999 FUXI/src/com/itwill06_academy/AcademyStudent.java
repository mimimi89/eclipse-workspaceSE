package com.itwill06_academy;

public class AcademyStudent extends AcademyMember {
	//AcademyMember를 상속받는 AcademyStudent
	
	/*
	상속받은 멤버 필드 
	private int no;
	private String name;
	*/
	
	private String ban;
	
	//기본(디폴트) 생성자와 번호, 이름, 반을 포함하는 생성자
	public AcademyStudent() {
	
	}
	
	public AcademyStudent(int no,String name,String ban) {
		/*
		this.setNo(no);
		this.setName(name);
		*/
		super(no,name);
		//부모클래스로부터 상속받은 번호와 이름
		this.ban=ban;
	}
	
	@Override
	public void print() {
		super.print();
		//기존의 부모클래스로부터 상속받은 print 메쏘드를 재정의(오버라이딩)
		System.out.println(this.ban);
	}
	
	
	//getter, setter 메쏘드
	public String getBan() {
		return ban;
	}
	public void setBan(String ban) {
		this.ban = ban;
	}
	
}
