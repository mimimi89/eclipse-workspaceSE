
/*
	변수의선언
		- 의미:
		JVM(자바가상머신)에게 메모리를 
		할당해달라고 요청하는 작업
		
		- 형태:
		        데이타타입 이름;
		         ex> int number;

		- 변수식별자규칙(클래스이름,변수이름,메쏘드이름)
			   - 영문이나 한글로 시작(숫자 사용 안 됨)
			   - 특수문자 사용불가(_,$는 예외)
			   - 키워드 사용금지
 */


public class VariableDeclare {
	//variable 변수 declare 선언
	public static void main(String[] args) {
		
		int score1;
		score1 = 100;
		System.out.println(score1);
		score1 = 200;
		System.out.println(score1);
		score1 = 300;
		System.out.println(score1);
		/* 
		 * int score1; 변수 선언
		 * score1 = 1; 변수 대입(초기화)
		 * int score1 = 1; 변수 선언과 동시에 대입
		*/
		
		int score2 = 400;
		System.out.println(score2);
		
		
		int 번호;
		번호=800;
		System.out.println(번호);
		
		int kor, eng, math;
		kor=89;
		eng=90;
		math=80;
		
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		
		
		/*
		행 복사하기
		ctr+alt+방향키
		
		행 이동하기
		alt+방향키
		*/
				
		
	}

}
