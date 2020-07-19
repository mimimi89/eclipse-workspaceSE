package jiaokeshu_07_배열과ArrayList_arrayList;

import java.util.ArrayList;

public class Student {
	
	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList=new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int scorePoint) {
		Subject subject=new Subject();
		subject.setName(name);
		subject.setScorePoint(scorePoint);
		subjectList.add(subject);
		
	}
	
	public void showStudentInfo() {
		int total=0;
		for (Subject subject : subjectList) {
			total+=subject.getScorePoint();
			System.out.println("학생 "+studentName+"("+studentID+")"+"의 "+
		subject.getName()+" 과목 성적은 "+subject.getScorePoint()+"점입니다.");
		}
		System.out.println("학생 "+studentName+"("+studentID+")"+"의 총점은 "+
		total+"점입니다.");
	}
	

}
