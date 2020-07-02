package com.itwill.method;

public class AService {
	
	private int member1;
	private int member2;
	private int member3;
	private int member4;
	

	public void a() {
		System.out.println("a() methode 실행");
	}
	
	public void b(int no) {
		System.out.println("b("+no+") methode 실행");
		System.out.println("인자로 받은 데이타 no: "+no);
	}
	
	public void c(int no, String name) {
		System.out.println("c() methode 실행");
		System.out.println("인자로 받은 데이타 no: "+no);
		System.out.println("인자로 받은 데이타 name: "+name);
	}
	
	public void d(int no, String name, char grade) {
		System.out.println("d() methode 실행");
		System.out.println("인자로 받은 데이타 no: "+no);
		System.out.println("인자로 받은 데이타 name: "+name);
		System.out.println("인자로 받은 데이타 grade: "+grade);
	}
	
	public void e(int no, String name, int kor, int eng, int math) {
		System.out.println("e(int no, String name, int kor, int eng, int math) methode 실행"+no+", "+name+", "+kor+", "+eng+", "+math);
		
	}
	
	public void f(Student student) {
		System.out.println("f(Student student) 인자: ");
		System.out.println(student.no);
		System.out.println(student.name);
		System.out.println(student.kor);
		System.out.println(student.eng);
		System.out.println(student.math);
		
	}
	
	
}
