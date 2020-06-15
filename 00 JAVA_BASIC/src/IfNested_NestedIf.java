
public class IfNested_NestedIf {
	// if문 안에 if문
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int kor = 89;
		int eng = 60;
		char grade = ' ';

		/*
		 * 점수의 유효성 체크
		 */

		/**********************************************************/

		if ((kor < 0 || kor > 100)) {
			System.out.println("점수는 0~100 사이의 정수입니다.");
		} else {
			if (kor >= 90) {
				grade = 'A';
			} else if (kor >= 80) {
				grade = 'B';
			} else if (kor >= 70) {
				grade = 'C';
			} else if (kor >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
			System.out.printf("1.학점은 %c입니다.\n", grade);
		}

		/**********************************************************/

		if ((eng < 0 || eng > 100)) {
			System.out.println("2. 점수는 0~100 사이의 정수입니다.");
		} 
		//유효한 점수인 경우
			if (eng >= 90) {
				grade = 'A';
			} else if (eng >= 80) {
				grade = 'B';
			} else if (eng >= 70) {
				grade = 'C';
			} else if (eng >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
			System.out.printf("2.학점은 %c입니다.\n", grade);
		}
}