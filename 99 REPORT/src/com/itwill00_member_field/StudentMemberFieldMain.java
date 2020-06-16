package com.itwill00_member_field;

public class StudentMemberFieldMain {

	public static void main(String[] args) {
		Student student1, student2=null;
		
		student1=new Student();
		student2=new Student();
		
		
		student1.num = 1;
		student1.name = "TOM";
		student1.kor = 45;
		student1.eng = 56;
		student1.math = 78;
		
		
		student2.num = 2;
		student2.name = "ALEX";
		student2.kor = 54;
		student2.eng = 65;
		student2.math = 87;
		
		
		student1.tot = student1.kor+student1.eng+student1.math;
		student1.avg = student1.tot/3;
		student1.grade = ' ';
		if(student1.avg>90&&student1.avg<=100) {
			student1.grade='A';
		}else if(student1.avg>80&&student1.avg<=90) {
			student1.grade='B';
		}else if(student1.avg>70&&student1.avg<=80) {
			student1.grade='C';
		}else if(student1.avg>60&&student1.avg<=70) {
			student1.grade='D';
		}else {
			student1.grade='F';
		} 
		student1.rank = 2;
		 
		
		student2.tot = student2.kor+student2.eng+student2.math;
		student2.avg = student2.tot/3;
		student2.grade = ' ';
		if(student2.avg>90&&student2.avg<=100) {
			student2.grade='A';
		}else if(student2.avg>80&&student2.avg<=90) {
			student2.grade='B';
		}else if(student2.avg>70&&student2.avg<=80) {
			student2.grade='C';
		}else if(student2.avg>60&&student2.avg<=70) {
			student2.grade='D';
		}else {
			student2.grade='F';
		} 
		student2.rank = 1;
		
		System.out.println();
		System.out.println("---------------학생 성적출력------------------");
		System.out.printf("%s %s %s %s %s %s %s %s %s\n",
				"학번","이름","국어","영어","수학","총점","평균","평점","석차");
		System.out.println("----------------------------------------------");
		System.out.printf("%3d %5s %4d %4d %4d %5d %5.1f %2c %3d\n",
				student1.num, student1.name, student1.kor, student1.eng, student1.math, student1.tot, student1.avg, student1.grade, student1.rank);
		System.out.printf("%3d %5s %4d %4d %4d %5d %5.1f %2c %3d\n",
				student2.num, student2.name, student2.kor, student2.eng, student2.math, student2.tot, student2.avg, student2.grade, student2.rank);
		System.out.println("----------------------------------------------");
		
		
	}//main
	
}//class
