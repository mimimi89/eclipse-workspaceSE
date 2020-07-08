package com.itwill02.member;

public class StudentConstructorMain {

	public static void main(String[] args) {
		/*
		 학생객체생성(3명)
		  -1명은 기본생성자사용
		      학생객체데이타(번호, 이름, 국어, 영어, 수학)입력메쏘드호출
		  - 2명은 인자5개 생성자사용
		 */
		Student stu1 = new Student();								// 기본생성자
		stu1.setStudentData(1, "류빈", 100, 90, 80);
		Student stu2 = new Student(2, "현빈", 77, 44, 55);
		Student stu3 = new Student(3, "원빈", 88, 66, 58);
		
		
		
		/*
		 * 학생총점계산 메쏘드 호출(3명) 
		 */
		stu1.calculateTotal();
		stu2.calculateTotal();
		stu3.calculateTotal();
		
				
		 /* 학생평균계산 메쏘드 호출(3명) 
		  */
		stu1.calculateAvg();
		stu2.calculateAvg();
		stu3.calculateAvg();
		
				
		/* 학생평점계산 메쏘드 호출(3명)
		 */
		stu1.calculateGrade();
		stu2.calculateGrade();
		stu3.calculateGrade();
		
		
		/*
		 * 학생데이타3명 출력메쏘드 호출
		 */
		stu1.headerPrint();
		stu1.print();
		stu2.print();
		stu3.print();
		
		/*
		 * 학생 student1 의 이름변경
		 * 
		 * 학생 student1 의 총점데이타 반환받은후 출력
		 * 
		 * 학생 student2 의 학점데이타 반환받은후 출력
		 */
		stu1.setName("김경호");
		System.out.println(stu1.getName());
		
		stu1.getTot();
		System.out.println(stu1.getTot());
		
		stu1.getGrade();
		System.out.println(stu1.getGrade());
		
		
		

	}

}
