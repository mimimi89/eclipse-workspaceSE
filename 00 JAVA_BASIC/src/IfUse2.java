
public class IfUse2 {

	public static void main(String[] args) {
		/*
		 * 짝수, 홀수 판별
		 */
		int inputNo = 11;
		if(inputNo%2==0) {
			System.out.println(inputNo+" 은/는 짝수입니다.");
		}else {
			System.out.println(inputNo+" 은/는 홀수입니다.");

		}

		/*
		 *4의 배수 판별 
		 */
		if(inputNo%4==0) {
			System.out.printf("%d 은/는 4의 배수입니다.\n",inputNo);
					
		}else {
			System.out.printf("%d 은/는 4의 배수가\t아닙니다.\n",inputNo);
			
		}
		//%d, \t, \n
		
		
		/*
		 공배수(3과 4의 최소공배수는 12)
		 */
		int number=12;
		if(number%3==0 && number%4==0) {
			System.out.printf("%d은/는 3의 배수이면서 4의 배수입니다.%n", number);
		}else {
			System.out.printf("%d은/는 3과 4의 공배수가 아닙니다.%n", number);
			
		}
		
		/*
		 * 점수의 유효성 체크
		 */
		
		int kor=90;
		if(kor>=0 && kor<=100) {
			System.out.printf("%d점은 유효한 점수입니다\n", kor);
		}else {
			System.out.printf("%d점은 유효한 점수가 아닙니다\n", kor);
			
		}
		
		
		
		
		
		
		
		
	}

}
