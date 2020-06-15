
public class VariableTypes {

	public static void main(String[] args) {
		/*
		 논리형
		 */
		boolean bool1, bool2, bool3;
		bool1 = true;
		bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);
		//bool3 = 'A';
				
		/*
		 문자형
		 */
		char munja1, munja2,munja3, munja4, munja5, munja6;
		munja1 = 'A';
		munja2 = '힣';
		munja3 = 65;
		/*정수형 리터럴일 경우, 
		데이터의 소실이 발생하지 않는 범위 안에서
		알아서 처리해 줌*/  
		
		int intany = 65;
		/* char char65 = intany
		 변수의 값이 변할 수 있으므로 처리해주지 않음
		 */
		
		int munja33 = 65;
		munja4 = 44032;
		munja5 = '\u0041';
		munja6 = '\uac00';
				
		System.out.println(munja1);
		System.out.println(munja2);
		System.out.println(munja3);
		System.out.println(munja33);
		System.out.println(munja4);
		System.out.println(munja5);
		System.out.println(munja6);
		
		/*
		 숫자 : 정수형
		 */
		byte b;
		short s;
		int i;
		long l;
		
		b = 127;
		s = 32767;
		i = 2147483647;
		l = 2147483648l;
		
		/*
		 * 숫자 : 실수형
		 */
		float f;
		double d;
		
		f = 3.14159f;
		d = 3.14159;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
		System.out.println("-------문자열형-------");
		String strl1;
		strl1 = "오늘은";
		String strl2 = "수요일";
		String strl3 = "변수를 공부합니다.";
		int month = 6;
		int day = 10;
		
		System.out.println(strl1);
		System.out.println(strl2);
		System.out.println(strl3);
		
		String message = strl1+" "+month+"월 "+day+"일 "+strl2+" "+strl3;
		
		System.out.println(message);
		
		
		
		

	}

}
