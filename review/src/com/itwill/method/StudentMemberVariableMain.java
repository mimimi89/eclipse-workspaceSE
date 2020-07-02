/*
 source> java ReviewMain 
 */

package com.itwill.method;

public class StudentMemberVariableMain {
	//접근제한 키워드 식별자
	//class: 틀, 설계도
	
	public static void main(String[] args) {
		//템플릿으로 등록되어서 main 입력하고 ctrl+space 누르면 나옴
		//main method는 프로그램의 시작점이자 끝점
		
		int a=1;
		double b=0.1;
		char c='a';
		//변수 선언과 초기화
		//변수선언: 타입+식별자
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		//출력
		
		//쓰레드의 흐름 
		
		
		Student st1=new Student();
		//식별자+도트연산자
		
		st1.no=111;
		st1.name="김경호";
		st1.kor=98;
		st1.eng=89;
		st1.math=76;
		st1.tot=st1.kor+st1.eng+st1.math;
		st1.grade='A';
		
		System.out.println(st1.no+"\t"+st1.name+"\t"+st1.kor+"\t"+st1.eng+"\t"+st1.math+"\t"+st1.tot+"\t"+st1.grade);
		
		
		
		
		
		
		
	}
	

}
