package com.itwill12_member_constructor;

public class StudentConstructorMain {

	public static void main(String[] args) {
		
		Student stu1=new Student();
		stu1.setStudentData(1, "TOM", 45, 56, 78);
		Student stu2=new Student(2, "ALEX", 54, 65, 87);
		Student stu3=new Student(3, "ERIN", 48, 57, 66);
		
		stu1.calculateTotal();
		stu2.calculateTotal();
		stu3.calculateTotal();
		
		stu1.calculateAvg();
		stu2.calculateAvg();
		stu3.calculateAvg();
		
		stu1.calculateGrade();
		stu2.calculateGrade();
		stu3.calculateGrade();
		
		stu1.headerPrint();
		
		stu1.setName("NICK");
		
		stu1.print();
		stu2.print();
		stu3.print();
		

	}

}
