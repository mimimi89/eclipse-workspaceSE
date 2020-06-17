package com.itwill11_member_method;

public class StudentMemberMethodMain {
	public static void main(String[] args) {
		
	
	//학생객체생성(3명)
	Student stu1=new Student();
	Student stu2=new Student();
	Student stu3=new Student();
	
		
	//학생객체데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
	//식별자.setStudentData(int num, String name, int kor, int eng, int math);
	stu1.setStudentData(1, "TOM", 45, 56, 78);
	stu2.setStudentData(2, "ALEX", 54, 65, 87);
	stu3.setStudentData(3, "ELIN", 48, 57, 66);
	
	
	//학생총점계산 메쏘드 호출(3명)
  	//학생평균계산 메쏘드 호출(3명)
	//학생평점계산 메쏘드 호출(3명)
	//식별자.scoreTotal(int kor, int eng, int math);
	//식별자.scoreAverage(int tot);
	//식별자.scoreGrade(int avg);
	 stu1.scoreTotal(45,56,78);
	 stu1.scoreAverage(179);
	 stu1.scoreGrade(59);
	 
	 stu2.scoreTotal(54, 65, 87);
	 stu2.scoreAverage(206);
	 stu2.scoreGrade(68);
	 
	 stu3.scoreTotal(48, 57, 66);
	 stu3.scoreAverage(171);
	 stu3.scoreGrade(57);

	 
	//학생데이타 출력메쏘드 호출(3명)
	 stu1.print();
	 stu2.print();
	 stu3.print();
	 

	}
	

}
