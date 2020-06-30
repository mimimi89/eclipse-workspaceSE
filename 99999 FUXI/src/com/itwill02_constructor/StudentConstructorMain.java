package com.itwill02_constructor;



public class StudentConstructorMain {

	public static void main(String[] args) {
		//생성자메쏘드, 헤더프린트, getter/setter 추가된 클래스 사용
		
		/*
		 학생객체생성(3명)
		  -1명은 기본생성자사용
		      학생객체데이타(번호, 이름, 국어, 영어, 수학)입력메쏘드호출
		  - 2명은 인자5개 생성자사용
		 */
		Student st1=new Student();
		st1.setStudentData(1, "김가영", 98, 86, 55);
		Student st2=new Student(2, "김나영", 89, 68, 74);
		Student st3=new Student(3, "김다영", 76, 96, 88);
		//메쏘드를 따로 만드는 것보다 생성자 메쏘드를 통해 객체 생성하고 데이터 입력하는 게 편함  
		
		
		/*
		 * 학생총점계산 메쏘드 호출 
		 * 학생평균계산 메쏘드 호출 
		 * 학생평점계산 메쏘드 호출
		 */
		st1.calculateTotal();
		st1.calculateAvg();
		st1.calculateGrade();
		
		st2.calculateTotal();
		st2.calculateAvg();
		st2.calculateGrade();
		
		st3.calculateTotal();
		st3.calculateAvg();
		st3.calculateGrade();
		
		/*
		 * 학생데이타 출력메쏘드 호출
		 */
		st1.headerPrint();
		st1.print();
		st2.print();
		st3.print();
		
		/*
		 * 학생 stu1의 grade출력
		 */
		System.out.println();
		char a=st1.getGrade();
		System.out.println("첫 번째 학생의 평점은 "+a+"입니다.");
		
		

	}

}
