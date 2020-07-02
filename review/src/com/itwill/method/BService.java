package com.itwill.method;

public class BService {
	
	
	private int member1;
	private int member2;
	private int member3;
	private int member4;
	
	public void a() {
		//아무것도 반환하지 않는 메쏘드
		System.out.println("a()메쏘드호출");
	}
	
	public int b() {
		System.out.println("public int b()메쏘드실행후 int 반환");
		int i=9090;
		return i;
	}
	public String c(String name) {
		System.out.println("public int c(String name)메쏘드실행후 String 반환");
		String msg = name+" 님 안녕하세용";
		return msg;
	}
	
	public Student d(Student st) {
		st.tot=st.kor+st.eng+st.math;
		return st;
	}
	
	public Student e() {
		Student st=new Student();
		st.no=99999;
		st.name="구구구구";
		st.kor=99;
		st.eng=98;
		st.math=78;
		return st;
	}
	
	
	
	

}
