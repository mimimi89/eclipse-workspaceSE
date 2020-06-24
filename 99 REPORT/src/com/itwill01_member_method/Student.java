package com.itwill01_member_method;

public class Student {
	/*
	 * 성적처리를 위한 필요한 학생객체를 만들기 위한 클래스
	 *  - 캡슐화
	 */

	
		// 멤버변수 선언
		// << 속성 >> 번호 이름 국어 영어 수학 총점 평균 평점 석차
		private int num;		//번호
		private String name;	//이름
		private int kor;		//국어
		private int eng;		//영어
		private int math;		//수학
		private int tot;		//총점
		private double avg;		//평균
		private char grade;		//평점
		private int rank;		//석차
	
	
		// 멤버메쏘드 선언
		// << 기능 >> 데이타입력,총점계산,평균계산,평점계산, 출력: 5개의 메쏘드
		
		//데이타 입력 메쏘드
		public void setStudentData(int num, String name, int kor, int eng, int math) {
			this.num=num;
			this.name=name;
			this.kor=kor;
			this.eng=eng;
			this.math=math;
		}
		
		//총점 계산 메쏘드
		public void scoreTotal() {
			this.tot=this.kor+this.eng+this.math;
		}
		
		//평균 계산 메쏘드
		public void scoreAverage() {
			this.avg=this.tot/3;
		}
		
		//평점 계산 메쏘드
		public void scoreGrade() {
			
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
			
		}
		
		//출력 메쏘드
		public void print() {
			System.out.println();
			System.out.println("---------------학생 성적출력------------------");
			System.out.printf("%4s %2s %2s %2s %2s %2s %3s %4s \n",
					"학번","이름","국어","영어","수학","총점","평균","평점");
			System.out.println("----------------------------------------------");
			System.out.printf("%5d %5s %3d %4d %4d %5d %5.1f %4c \n",
					this.num, this.name, this.kor, this.eng, this.math, this.tot, this.avg, this.grade);
			System.out.println("----------------------------------------------");
			
		}
		
	
	

}
