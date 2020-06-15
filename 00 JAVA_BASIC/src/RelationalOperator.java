/*관계(비교)연산
형태:  >, <, >=, <=, ==, !=
관계 연산의 결과 값은 논리형 데이터(참거짓 형태, true/false) 
*/

public class RelationalOperator {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		boolean result;
		
		result = a > b;
		System.out.println("10 > 20-->"+result);
		result = a < b;
		System.out.println("10 < 20-->"+result);
		result = a >= b;
		System.out.println("10 >= 20-->"+result);
		result = a <= b;
		System.out.println("10 =< 20-->"+result);
		result = a == b;
		System.out.println("10 == 20-->"+result);
		result = a != b;
		System.out.println("10 != 20-->"+result);
		
		char c1='가';
		char c2='R';
		char c3='A';
		char c4='B';
		
		result = c1 < c2;
		System.out.println("'가' < 'R'-->"+result);
		
		System.out.println("'가' 숫자 -->"+(int)c1);
		System.out.println("'R' 숫자 -->"+(int)c2);

		result = c3 < c4;
		System.out.println("'A' < 'B'-->"+result);
		
		
		System.out.println("'A' 숫자 -->"+(int)c3);
		System.out.println("'B' 숫자 -->"+(int)c4);

		


	}

}
