package com.itwill.method;

public class AServiceMain {

	public static void main(String[] args) {
		
		AService aService=new AService();
		//자바는 참조변수(주소값)만을 통해서 객체에 접근할 수 있음
		
		aService.a();
		//객체의 인스턴스 메쏘드를 호출하는 코드
		int no=90;
		aService.b(no);
		aService.b(890790);
		aService.c(30,"김경호");
		aService.c(88,"최경녀");
		aService.d(5, "신명숙", 'F');
		aService.e(1, "KIM", 100, 45, 89);
		aService.e(2, "JIM", 67, 89, 99);
		
		Student st1=new Student();
		st1.no=9090;
		st1.name="구공탄";
		st1.kor=99;
		st1.eng=98;
		st1.math=97;
		
		aService.f(st1);
		
		
		
		

	}

}
