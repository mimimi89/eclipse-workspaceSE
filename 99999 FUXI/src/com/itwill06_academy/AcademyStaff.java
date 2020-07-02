package com.itwill06_academy;

public class AcademyStaff extends AcademyMember {
	//AcademyMember 번호, 이름, 출력 메쏘드를 상속받는 AcademyStaff
	
	
	private String depart;
	//멤버필드에 부서 추가
	
	//생성자 메쏘드
	public AcademyStaff() {
		
	}
	
	//상속받은 번호, 이름에 부서가 추가된 생성자 메쏘드
	public AcademyStaff(int no,String name,String depart) {
		super(no, name);
		this.depart = depart;
	}
	
	@Override
	public void print() {
		super.print();
		//상속받은 출력 메쏘드 재정의
		System.out.println(this.depart);
	}
	
	
	//getter, setter 메쏘드 
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
}
