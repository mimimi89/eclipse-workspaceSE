package com.itwill14_배열;

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
					new Student(9,"QIM",73,90,80)
			}; 
			//student타입, 9개의 주소값을 가지고 있는 배열 객체 생성
			//배열 객체의 이름: students
			
			//07 배열-PrimitiveTypeArrayStudentMain 참고하기 
		
			System.out.println("1. 전체학생총점,평균,평점계산");
			for (int i = 0; i < students.length; i++) {
				
			}
			
			/*
			 * 2. 전체학생 총점으로 석차계산
			 */
			System.out.println("2. 전체학생 총점으로 석차계산");
			/*
			 * 3. 전체학생출력
			 */
			System.out.println("3. 전체학생출력 ");
			/*
			 * 4. 번호3번 학생한명 출력  
			 */
			System.out.println("4.번호3번 학생한명 출력  ");
			
			/*
			 * 5. 학점A인 학생들 출력
			 */
			
			System.out.println("5. 학점A인 학생들 출력");
			
			/*
			 * 6. 학생총점으로 오름차순정렬
			 */
			System.out.println("6. 학생총점으로 오름차순정렬");
			
			
			Student.headerPrint();
			for (int i = 0; i < students.length; i++) {
				students[i].print();
			}
			/*
			  7. 학생학점순으로 오름차순정렬
			 */
			System.out.println("6. 학생학점순으로 오름차순정렬");
			
			Student.headerPrint();
			for (int i = 0; i < students.length; i++) {
				students[i].print();
			}
			/*
			 8. 학생이름순으로 오름차순정렬(XXX)
			 */
			System.out.println("8.학생이름순으로 오름차순정렬");
			
			Student.headerPrint();
			for (int i = 0; i < students.length; i++) {
				students[i].print();
			}
			
		}

	

}
