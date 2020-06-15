
public class ArithmaticOperator {
//operator 조작, 연산
	public static void main(String[] args) {
		int a =1;
		int b =2;
		char ca='A';
		char cz='Z';
		
		int result;
		/*
		 * 1.산술연산
		 */
		result = a+b;
		System.out.println("a+b="+result);
		result = a-b;
		System.out.println("a-b="+result);
		result = a*b;
		System.out.println("a*b="+result);
		result = a/b;
		System.out.println("a/b="+result);
		double dresult=(double)a/b;
		System.out.println("double 1/2="+dresult);
		//왜 0.5가 아니라 0이 나오는지?
		
		result = a%b;
		System.out.println("a%b="+result);
		int year = 2020;
		result = year%4;
		System.out.println("year%4="+result);
		result = year%100;
		System.out.println("year%100="+result);
		result = year%400;
		System.out.println("year%400="+result);
		
		System.out.println("-------문자연산-------");
		result= ca+1;
		System.out.println("ca+1-->"+result);
		char cb = (char)result;
		System.out.println("cb-->"+cb);
		
		char hanFirst = '가';
		char hanLast = '힣';
		int letterCount = hanLast-hanFirst+1;
		System.out.println("한글의 글자수 : "+letterCount);
		
		
		System.out.println("--비트산술연산--");
		int c = 1;
		/*
		  
		  00000000:00000000:00000000:00000001=1
		  00000000:00000000:00000000:00000010=2
		  00000000:00000000:00000000:00000100=4
		  00000000:00000000:00000000:00001000=8
		 
		 * */
		
		result = c<<1;
		System.out.println("c<<1-->"+result);
		result = c<<2;
		System.out.println("c<<2-->"+result);
		result = c<<8;
		System.out.println("c<<8-->"+result);
		
		/*
		00000000:00000000:00000000:10000000=128
		00000000:00000000:00000000:01000000=64
		00000000:00000000:00000000:00100000=32
		00000000:00000000:00000000:00001000=16
		 */
		
		int d=128;
		result = d >>1;
		System.out.println("d>>1 -->" +result);
		result = d >>2;
		System.out.println("d>>2 -->" +result);
		result = d >>3;
		System.out.println("d>>3 -->" +result);
		result = d >>4;
		System.out.println("d>>4 -->" +result);
	
		/*
		비트연산자
		  -형태: | , & ,~

		*/
		
		//Bit or 연산( | )-->양쪽비트가 모두 0인경우에만 0을반환
		
		int intmax1 =2147483647;
		int intmax2 = 0B01111111111111111111111111111111;
		//1이 31개
		System.out.println(intmax1);
		System.out.println(intmax2);
		Integer.toBinaryString(intmax1);
		System.out.println(Integer.toBinaryString(intmax1));
		
		
		int result1 = ~intmax1+1;
		int result2 = ~intmax2;
		System.out.println(~intmax1);
		System.out.println(~intmax2);
		
		//~ : 반전을 의미
		
		Integer.toBinaryString(result1);
		//2진의 형태로 보고 싶을 때
		System.out.println(Integer.toBinaryString(result1));
		//10000000000000000000000000000001는 -2147483648
		//맨 앞이 1이면 음수, 맨 앞이 0이면 양수
		
		
		/*
		 *자주 발생하는 오류 
		 1.
		 name cannot be resolved to a variable
		 name을 변수로 처리할 수 없음: 변수선언이 안 됨
		 2.
		 duplicate local variable number
		 local의 변수 number가 중복됨: 변수선언이 중복됨
		 3.
		 string cannot be resolved to a type
		 String은 식별자, class의 이름이므로 꼭 대문자로 입력
		 4.
		 syntax error, insert ";" to complete LocalVariableDeclaration~
		 ";" 세미콜론 부호가 없는 경우
		 혹은
		 {} 괄호가 제대로 열고 닫히지 않았을 경우, 구조적 오류
		 */
		
		
	}

}
