package com.itwill11_member_method;

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
		public void scoreTotal(int kor, int eng, int math) {
			this.tot=kor+eng+math;
			System.out.println(this.tot);
		}
		
		//평균 계산 메쏘드
		public void scoreAverage(int tot) {
			this.avg=tot/3;
			System.out.println(this.avg);
			
		}
		
		//평점 계산 메쏘드
		public void scoreGrade(int avg) {
			this.grade=' ';
			if(avg>90&&avg<=100) {
				grade='A';
			}else if(avg>80&&avg<=90) {
				grade='B';
			}else if(avg>70&&avg<=80) {
				grade='C';
			}else if(avg>60&&avg<=70) {
				grade='D';
			}else {
				grade='F';
			}
			System.out.println(this.grade);
		}
		
		//출력 메쏘드
		public void print() {
			System.out.println();
			System.out.println("---------------학생 성적출력------------------");
			System.out.printf("%s %s %s %s %s %s %s %s %s\n",
					"학번","이름","국어","영어","수학","총점","평균","평점","석차");
			System.out.println("----------------------------------------------");
			System.out.printf("%3d %5s %4d %4d %4d %5d %5.1f %2c %3d\n",
					this.num, this.name, this.kor, this.eng, this.math, this.tot, this.avg, this.grade, this.rank);
			System.out.println("----------------------------------------------");
			
		}
		
	
	

}
