package com.itwill02_constructor;



public class StudentConstructorMain {

	public static void main(String[] args) {
		/*
		 학생객체생성(3명)
		  -1명은 기본생성자사용
		      학생객체데이타(번호, 이름, 국어, 영어, 수학)입력메쏘드호출
		  - 2명은 인자5개 생성자사용
		 */
		Student st1=new Student();
		st1.setStudentData(1, "KIM", 34, 56, 90);
		Student st2=new Student(2, "LEE", 89, 78, 99);
		Student st3=new Student(3, "PARK", 56, 23, 49);
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
		System.out.println("학생 stu1의 grade:"+st1.getGrade());
		

	}

}
