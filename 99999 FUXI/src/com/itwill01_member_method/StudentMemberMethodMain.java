package com.itwill01_member_method;

public class StudentMemberMethodMain {

	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		Student st1=new Student();
		Student st2=new Student();
		Student st3=new Student();
		
		/*
		 학생객체데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		st1.dataSet(1, "김가영", 98, 86, 55);
		st2.dataSet(2, "김나영", 89, 68, 74);
		st3.dataSet(3, "김다영", 76, 96, 88);
		
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		st1.totScore();
		st2.totScore();
		st3.totScore();
		
		st1.avgScore();
		st2.avgScore();
		st3.avgScore();
		
		st1.gradeScore();
		st2.gradeScore();
		st3.gradeScore();
		
		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		st1.print();
		st2.print();
		st3.print();
		
		
		
	}

}
