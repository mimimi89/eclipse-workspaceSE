package com.itwill06_academy;


public abstract class AcademyMember {
	public static final int STUDENT_TYPE=0; 
	//final: 더이상 변경 못함
	//기울임꼴은 상수를 의미함
	public static final int GANGSA_TYPE=1; 
	public static final int STAFF_TYPE=2; 
	
	
	//academy class 멤버 변수, 멤버 필드(번호, 이름)
	private int no;
	private String name;
	
	//기본(디폴드)생성자 메쏘드, 번호와 이름을 set한 생성자 메쏘드
	public AcademyMember() {
	}

	public AcademyMember(int no, String name) {
		
		this.no = no;
		this.name = name;
	}
	
	//getter, setter 메쏘드
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
	public void print() {
		System.out.print(no+"\t"+name+"\t");
	}
	
	
	
	
	
	
	
	
	
	
	
}
