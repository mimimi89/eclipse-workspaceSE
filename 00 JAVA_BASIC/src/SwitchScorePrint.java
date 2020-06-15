
public class SwitchScorePrint {

	public static void main(String[] args) {
		/*
		 * 학생2명 데이타를 담을변수선언
		 */
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
		
		/*
		 * 학생2명 기본데이타대입
		 *   학번,이름,국어,영어,수학
		 */
		
		no1 = 1;
		name1 = "김경호";
		kor1 = 49;
		eng1 = 56;
		math1 = 78;
		
		no2 = 2;
		name2 = "김경수";
		kor2 = 67;
		eng2 = 58;
		math2 = 70;
		
		/*
		 * 국어,영어,수학점수의 유효성체크
		 *  - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하세요
		 *  - 유효하지않은 데이타가 입력되면 프로그램종료
		 */
		
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
		
		/*
		 * 학생2명 기본데이타를 사용해서
		 *   총점 평균 평점계산후 대입
		 *   << 평점(A,B,C,D,E)계산시 switch 문을사용하세요 >>
		 *   
		 */
		
		tot1 = kor1+eng1+math1;
		avg1 = tot1/3;
		grade1 = 61;
		String msg1 = "";
		switch (grade1) {
		case 100:
		case 99:
		case 98:
		case 97:
		case 96:
		case 95:
		case 94:
		case 93:
		case 92:
		case 91:
			msg1="A";
			break;
		case 90:
		case 89:
		case 88:
		case 87:
		case 86:
		case 85:
		case 84:
		case 83:
		case 82:
		case 81:
			msg1="B";
			break;
		case 80:
		case 79:
		case 78:
		case 77:
		case 76:
		case 75:
		case 74:
		case 73:
		case 72:
		case 71:
			msg1="C";
			break;
		case 70:
		case 69:
		case 68:
		case 67:
		case 66:
		case 65:
		case 64:
		case 63:
		case 62:
		case 61:
			msg1="D";
			break;
		default:
			msg1="F";
			break;
		}
		
		
		rank1 = 3;
		tot2 = kor2+eng2+math2;
		avg2 = tot2/3;
		grade2 = 65;
		String msg2 = "";
		switch (grade2) {
		case 100:
		case 99:
		case 98:
		case 97:
		case 96:
		case 95:
		case 94:
		case 93:
		case 92:
		case 91:
			msg2="A";
			break;
		case 90:
		case 89:
		case 88:
		case 87:
		case 86:
		case 85:
		case 84:
		case 83:
		case 82:
		case 81:
			msg2="B";
			break;
		case 80:
		case 79:
		case 78:
		case 77:
		case 76:
		case 75:
		case 74:
		case 73:
		case 72:
		case 71:
			msg2="C";
			break;
		case 70:
		case 69:
		case 68:
		case 67:
		case 66:
		case 65:
		case 64:
		case 63:
		case 62:
		case 61:
			msg2="D";
			break;
		default:
			msg2="F";
			break;
		}
		
		
		rank2 = 2;
		
		/*
           	 - 평균은 소수점이하 1자리수까지만 출력하세요(2째자리에서반올림)
           	 
        */
		
		
		System.out.println("----------------학생 성적출력----------------");
		
		System.out.printf("%s %s %s %s %s %s %s %s %s\n",
				"학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.println("---------------------------------------------");
		System.out.printf("%2d %4s %2d %4d %4d %4d %5.1f %3s %3d\n", no1,name1, kor1, eng1, math1, tot1, avg1, msg1, rank1);
		System.out.printf("%2d %4s %2d %4d %4d %4d %5.1f %3s %3d\n", no2,name2, kor2, eng2, math2, tot2, avg2, msg2, rank2);
		System.out.println("---------------------------------------------");
		

	}

}
