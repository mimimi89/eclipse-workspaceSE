
/*
		논리연산자
		   - 형태:   ||(Logical OR) , && (Logical AND) ( |,& )
		   - 좌우측의항이 논리형데이타이다.
           - 결과도 논리형데이타이다.
		    ex> true || false, false && false

		*/

public class LogicalOperator {
	public static void main(String[] args) {
		
		boolean a1 = false;
		boolean a2 = false;
		boolean a3 = true;
		boolean a4 = true;
		boolean result;
	
		/*
		 * Logical Or(논리합 ||)
		 		-false || false --> false
		 		:거짓이고 거짓인 경우에만 거짓
		 		모두 거짓인 경우에만 거짓, 나머지는 모두 참
		 */
		
		result = a1 || a2;
		System.out.println("false||false==>"+result);
		
		
		/* 		
		 * Logical And(논리곱 &&)
		  		-true && true --> true
		  		:참이고 참인 경우에만 참
		  		모두 참인 경우에만 참, 나머지는 모두 거짓
		  		
		  예) 취업조건: 연봉 3000이상, 출퇴근 1시간 이내
		  모두 충족시며야 갈 경우, *****논리곱***** 이용
		  		
		 */
		
		result = a3 && a4;
		System.out.println("true||true==>"+result);
		
		System.out.println("-------점수의 유효성 체크-------");
		//0점 이상~100점 이하
		
		int kor = 90;
		int math = 78;
		
		boolean isValidkor = (kor>=0) && (kor<=100)  ;
		System.out.println("isValidkor : "+isValidkor);
		//valid 유효한
		
		boolean isValidmath = (math>=0) && (math<=100)  ;
		System.out.println("isValidmath : "+isValidmath);
		
		boolean isValidAll = isValidkor && isValidmath;
		System.out.println("모든 점수가 유효한가요?  "+isValidAll);
		
		System.out.println("-------합격여부-------");
		int eng = 67;
		int spain = 56;
		int chn = 78;
		
		boolean pass = false;
		
		pass = (eng>=90) || (spain>=90) || (chn>=90);
		System.out.println("합격여부:  "+pass);
		
		
		System.out.println("---------윤년여부----------");
		/*
		 퀴즈: 윤년 여부 판다
		 1. 4의 배수면 윤년
		 2. 100의 배수면 윤년이 아님
		 3. 400의 배수면 윤년
		*/
		
		
		boolean isLeapYear = false;
		
		int year = 2020;
			
		int result1, result2, result3;
		
		result1 = year%4;
		result2 = year%100;
		result3 = year%400;
		
		isLeapYear = (result1==0 && result2!=0) || result3==0;
	
		System.out.println(year+"의 윤년 여부: "+isLeapYear);
		
		
		
		
		
		
		
		
		
	}

}
