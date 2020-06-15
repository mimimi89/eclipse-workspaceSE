
public class IfUseExe {

	public static void main(String[] args) {
		/*
		 * 윤년여부출력
		 */
		
		//4의 배수이거나 400의 배수: ()로 묶기
		//100의 배수를 어떻게 제외시킬 것인가: 100으로 나눈 나머지가 0보다 큰 경우
		int year = 2020;
		if (year%4==0 && year%100!=0 || year%400==0) {
			System.out.printf("%d 는 윤년\n", year);
		} else {
			System.out.printf("%d 는 평년\n", year);
		}
		
		/*
		 * 문자판단 
		 	1.한글여부 
			2.알파벳대문자 
			3.소문자 
			4.숫자형태의문자
		 */
	
	/*
	 char c1='가';
	 System.out.println("'가' 숫자 -->"+(int)c1);
	*/
		
	char han1 = '가';
	System.out.println("'가' 숫자 -->"+(int)han1);
	char han9 = '힣';
	System.out.println("'힣' 숫자 -->"+(int)han9);
	
	char al1 = 'A';
	System.out.println("'A' 숫자 -->"+(int)al1);
	char al9 = 'Z';
	System.out.println("'Z' 숫자 -->"+(int)al9);
	
	char al_1 = 'a';
	System.out.println("'a' 숫자 -->"+(int)al_1);
	char al_9 = 'z';
	System.out.println("'z' 숫자 -->"+(int)al_9);
	
	char no_1 = '0';
	System.out.println("'0' 숫자 -->"+(int)no_1);
	char no_9 = '9';
	System.out.println("'9' 숫자 -->"+(int)no_9);
	
	//char cNo = '김';
	//System.out.println("'김' 숫자 -->"+(int)cNo);
	
	//
	
	char c = '김';
	int cNo = 44608;
	
	if(cNo>='가' && cNo<='힣') {
		System.out.println((char)cNo + " 은/는 한글입니다.");
	}
	
	if(cNo>='A' && cNo<='Z') {
	
		System.out.println((char)cNo + " 은/는 알파벳대문자입니다.");
	}
	 
	if (cNo>='a' && cNo<='z') {
		System.out.println((char)cNo + " 은/는 알파벳소문자입니다.");
	}
	
	if (cNo>='0' && cNo<='9') {
		System.out.println((char)cNo + " 은/는 숫자형 문자입니다.");
	}
	
	//
	
	char idFirstLetter = '김';
	int id = 44608;
//대문자이거나(or) 소문자로 다시
	if(id>='A' && id<='Z') {
		System.out.println("아이디로 적합");
	} 
	if (id>='a' && id<='z') {
		System.out.println("아이디로 적합");
	} else {
		System.out.println("아이디로 부적합");
	}


	
	
	}

}
