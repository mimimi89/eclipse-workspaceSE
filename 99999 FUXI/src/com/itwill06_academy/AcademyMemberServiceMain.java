package com.itwill06_academy;

public class AcademyMemberServiceMain {

	public static void main(String[] args) {
		
		
		
		AcademyMemberService academyMemberService=new AcademyMemberService();

		
		System.out.println("1.AcademyMember 전체출력");
		academyMemberService.print();
		System.out.println("---------------------------------------------");
	
		
		System.out.println("2-1.AcademyMember[] 객체 번호 1번 참조변수 반환해줘");
		AcademyMember m1=
				academyMemberService.findAcademyMemberByNo(1);
		System.out.println("---------------------------------------------");
		
		
		System.out.println("2-2.번호 2 번 AcademyMember 객체 참조변수반환해줘");
		AcademyMember m2=
				academyMemberService.findAcademyMemberByNo(2);
		System.out.println("---------------------------------------------");
		
		
		System.out.println("2-3.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘");
		AcademyMember[] m3=
				academyMemberService.findAcademyMemberByName("KIM");
		System.out.println("---------------------------------------------");
				
		
		System.out.println("3-1.AcademyMember 중에서 AcademyStudent객체배열 참조변수반환해줘");
		AcademyMember[] student=
				academyMemberService.findAcademyStudents();
		System.out.println("---------------------------------------------");
			
		
		System.out.println("3-2.AcademyMember 중에서 AcademyStaff객체배열 참조변수반환해줘");
		AcademyMember[] staff=
				academyMemberService.findAcademyStaff();
		System.out.println("---------------------------------------------");
		
		
		System.out.println("3-3.AcademyMember 중에서 AcademyGangsa객체배열 참조변수반환해줘");
		AcademyMember[] gangsa=
				academyMemberService.findAcademyGangsa();
		System.out.println("---------------------------------------------");

		
		System.out.println(
				"4-1.AcademyMember 중에서 자바반인 AcademyStudent객체들배열 참조변수반환해줘");
		AcademyMember[] javaStudent=
				academyMemberService.findAcademyJavaStudents();
		System.out.println("---------------------------------------------");

		
		System.out.println(
				"4-2.AcademyMember 중에서 영업부서인 AcademyStaff 객체들배열 참조변수반환해줘");
		AcademyMember[] salesStaff=
				academyMemberService.findAcademySalesStaff();
		System.out.println("---------------------------------------------");
		
		
		System.out.println(
				"4-3.AcademyMember 중에서 프로그래밍 과목인 AcademyGangsa 객체들 배열참조변수반환해줘");
		AcademyMember[] programingGangsa=
				academyMemberService.findAcademyProgramingGangsa();
		System.out.println("---------------------------------------------");
		
		
		
		
	}

}
