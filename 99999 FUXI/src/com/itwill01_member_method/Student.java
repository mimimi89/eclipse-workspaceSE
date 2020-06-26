package com.itwill01_member_method;

/*
 * 성적처리를 위한 필요한 학생객체를 만들기 위한 클래스
 *  - 캡슐화
 */
public class Student {

	
	// 멤버필드
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	private char grade;
	private int rank;
	
	// 인스턴트 메쏘드
	public void dataSet(int no, String name, int kor, int eng, int math) {
		this.no=no;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	public int totScore(int kor, int eng, int math) {
		this.tot=kor+eng+math;
		return tot;
	}
	
	public double avgScore(int tot) {
		this.avg=tot/3;
		return avg;
	}
	
	
	
	
	//평점계산, 출력
	
	
	
	
	
	
}
