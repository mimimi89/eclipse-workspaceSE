
public class IfScorePrint {

	public static void main(String[] args) {
		// 성적관리에서 학생 2명의 데이타를 담을 변수 선언
		//		-번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점, 석차
		
		int no1;
		String name1;
		int kor1;
		int eng1;
		int math1;
		int tot1;
		double avg1;
		char grade1;
		int rank1;
		

		int no2;
		String name2;
		int kor2;
		int eng2;
		int math2;
		int tot2;
		double avg2;
		char grade2;
		int rank2;
		
		//학생 2명의 기본 데이타(번호, 이름, 국어, 영어, 수학) 입력
		
		no1 = 1;
		name1 = "김경호";
		kor1 = 42;
		eng1 = 56;
		math1 = 78;
		
		no2 = 2;
		name2 = "김경수";
		kor2 = 43;
		eng2 = 53;
		math2 = 76;
		
		//국어, 영어, 수학 점수의 유효성 체크
		//100점이 넘는 수나 음수가 입력되면 메세지를 출력하세요
		//유효하지 않은 데이타가 입력되면 프로그램 종료
		
		if(kor1>=0 && kor1<=100) {
			
		}else {
			System.out.printf("%d점은 유효한 점수가 아닙니다\n", kor1);
			return;
			
		}
		
		if(kor2>=0 && kor2<=100) {
			
		}else {
			System.out.printf("%d점은 유효한 점수가 아닙니다\n", kor2);
			return;
			
		}
		
		if(eng1>=0 && eng1<=100) {
			
		}else {
			System.out.printf("%d점은 유효한 점수가 아닙니다\n", eng1);
			return;
			
		}
		
		if(eng2>=0 && eng2<=100) {
			
		}else {
			System.out.printf("%d점은 유효한 점수가 아닙니다\n", eng2);
			return;
			
		}
		
		if(math1>=0 && math1<=100) {
			
		}else {
			System.out.printf("%d점은 유효한 점수가 아닙니다\n", math1);
			return;
			
		}
		
		if(math2>=0 && math2<=100) {
			
		}else {
			System.out.printf("%d점은 유효한 점수가 아닙니다\n", math2);
			return;
			
		}
		
		//기본 데이타를 이용해서 총점, 평균, 평점 계산 후 대입
		
		tot1 = kor1+eng1+math1;
		avg1 = tot1/3;
		grade1 = ' ';
		if(avg1>90&&avg1<=100) {
			grade1='A';
		}else if(avg1>80&&avg1<=90) {
			grade1='B';
		}else if(avg1>70&&avg1<=80) {
			grade1='C';
		}else if(avg1>60&&avg1<=70) {
			grade1='D';
		}else {
			grade1='F';
		}
		rank1 = 2;
		
		tot2 = kor2+eng2+math2;
		avg2 = tot2/3;
		grade2 = ' ';
		if(avg2>90&&avg2<=100) {
			grade2='A';
		}else if(avg2>80&&avg2<=90) {
			grade2='B';
		}else if(avg2>70&&avg2<=80) {
			grade2='C';
		}else if(avg2>60&&avg2<=70) {
			grade2='D';
		}else {
			grade2='F';
		}
		rank2 = 3;
		
		//학생 2명의 성적을 출력
		

		System.out.println("----------------학생 성적출력----------------");
		System.out.printf("%s %s %s %s %s %s %s %s %s\n",
				"학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.println("---------------------------------------------");
		System.out.printf("%2d %4s %2d %4d %4d %4d %5.1f %3s %3d\n", no1,name1, kor1, eng1, math1, tot1, avg1, grade1, rank1);
		System.out.printf("%2d %4s %2d %4d %4d %4d %5.1f %3s %3d\n", no2,name2, kor2, eng2, math2, tot2, avg2, grade2, rank2);
		System.out.println("---------------------------------------------");
		
		
	}

}
