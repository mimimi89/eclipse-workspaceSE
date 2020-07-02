package com.itwill06_academy;


public class AcademyGangsa extends AcademyMember {
	//AcademyMember를 상속받는 AcademyGangsa
	
		/*
		상속받은 멤버 필드 
		private int no;
		private String name;
		*/
	
	private String subject;
	
	//기본생성자
	public AcademyGangsa() {

	}
	
	public AcademyGangsa(int no,String name,String subject) {
		super(no, name);
		//상속받은 번호와 이름
		this.subject = subject;
		//추가된 변수 과목
	}
	
	@Override
	public void print() {
		super.print();
		//부모 클래스로부터 상속받은 출력 메쏘드에 과목 추가(재정의, 오버라이딩) 
		System.out.println(this.subject);
	}
	
	//getter, setter 메쏘드
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}







