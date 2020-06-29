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
	
	// 인스턴트 메쏘드	/기본 데이타
	public void dataSet(int no, String name, int kor, int eng, int math) {
		this.no=no;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	//총점 계산시 필요한 기본데이타를 인자로 놓고, 메쏘드 내부에서 계산과 반환
	public int totScore(int kor, int eng, int math) {
		this.tot=kor+eng+math;
		return tot;
	}
	
	//평균 계산시 필요한 총점값을 인자로 놓고, 메쏘드 내부에서 계산과 반환
	public double avgScore(int tot) {
		this.avg=tot/3;
		return avg;
	}
	
	
	//평점계산, 출력
	public char grade(double avg) {
		if(this.avg>90&&this.avg<=100) {
			this.grade='A';
			
		}else if(this.avg>80&&this.avg<=90) {
			this.grade='B';
			
		}else if(this.avg>70&&this.avg<=80) {
			this.grade='C';
			
		}else if(this.avg>60&&this.avg<=70) {
			this.grade='D';
			
		}else {
			this.grade='F';
		}
		
		return grade;
	}
	
	//출력 메쏘드
	public void print() {
		System.out.println();
		System.out.println("---------------학생 성적출력------------------");
		System.out.printf("%4s %2s %2s %2s %2s %2s %3s %4s \n",
				"학번","이름","국어","영어","수학","총점","평균","평점");
		System.out.println("----------------------------------------------");
		System.out.printf("%5d %5s %3d %4d %4d %5d %5.1f %4c \n",
				this.no, this.name, this.kor, this.eng, this.math, this.tot, this.avg, this.grade);
		System.out.println("----------------------------------------------");
	}

	
	
	
	
	
	
	
	
	
	
	
}
