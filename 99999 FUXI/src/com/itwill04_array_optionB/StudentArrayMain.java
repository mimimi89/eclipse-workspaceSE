package com.itwill04_array_optionB;


public class StudentArrayMain {

	public static void main(String[] args) {
		Student[] students={
				new Student(1,"KIM",89,93,94),
				new Student(2,"HIM",88,77,98),
				new Student(3,"AIM",65,87,99),
				new Student(4,"BIM",75,97,60),
				new Student(5,"XIM",85,98,90),
				new Student(6,"TIM",95,88,77),
				new Student(7,"ZIM",99,93,95),
				new Student(8,"LIM",83,80,99),
				new Student(9,"QIM",73,90,80),
				
		};
		
		//Student 배열 객체 생성 
		
		
		System.out.println();
		System.out.println("1. 전체학생 총점,평균,평점계산");
		for (int i = 0; i < students.length; i++) {
			students[i].calculateTotal();
			students[i].calculateAvg();
			students[i].calculateGrade();
		}
		System.out.println();

		//??????????
		System.out.println("2. 전체학생 총점으로 석차계산");
		for (int i = 0; i < students.length; i++) {
			int rank=0;
			for (int j = 0; j < students.length; j++) {
				if(students[j].getTot()<students[j+1].getTot()) {
					rank++;
				}
				students[i].setRank(rank);
			
			}
			students[i].print();
			
		}
		
		
		System.out.println();
		
		
		System.out.println("3. 전체학생출력 ");
		System.out.println();
		Student.headerPrint();
		for (int i = 0; i < students.length; i++) {
			students[i].print();
			
		}
		System.out.println("-------------------------------------------------------");
		System.out.println();
		
		
		System.out.println("4.번호 3번 학생 한 명 출력  ");
		System.out.println("-------------------------------------------------------");
		for (int i = 0; i < students.length; i++) {
			if(students[i].getNo()==3) {
				students[i].print();
				break;
			}
		}
		
		System.out.println("-------------------------------------------------------");
		System.out.println();


		System.out.println("5. 학점 A인 학생들 출력");
		System.out.println("-------------------------------------------------------");
		for (int i = 0; i < students.length; i++) {
			if(students[i].getGrade()=='A') {
				students[i].print();
			}
		}
		System.out.println("-------------------------------------------------------");
		System.out.println();

		//////??????
		System.out.println("6. 학생총점으로 오름차순정렬");
		Student.headerPrint();
		for (int i = 0; i < students.length-1; i++) {
			for (int j = 0; j < students.length-1; j++) {
				if(students[j].getTot()<students[j+1].getTot()) {
					Student tempStudent=students[j];
					students[j]=students[j+1];
					students[j+1]=tempStudent;
				}
			}
			students[i].print();
		}
		System.out.println("-------------------------------------------------------");
		System.out.println();
		
	
		/*
		 8. 학생이름순으로 오름차순정렬(과제아닙니다..)
		 */
		System.out.println("8.학생이름순으로 오름차순정렬");
		
		Student.headerPrint();
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
	}
	

		
}
