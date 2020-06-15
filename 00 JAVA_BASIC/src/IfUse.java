/**
 * 흐름제어문 1. if 문 -형식 : stmt0;
 * 
 * if(조건문 ){ //조건문 --> 논리형데이타가 반환되는 연산 // 혹은 논리형리터럴, 논리형변수 stmt1; }
 * 
 * else{ stmt2; }
 * 
 * stmt3;
 * 
 * 조건데이타가 true인경우 stmt0-->stmt1-->stmt3; 조건데이타가 false인경우 stmt0-->stmt2-->stmt3;
 */

public class IfUse {

	public static void main(String[] args) {
		System.out.println("stmt0");
		
		if (true) {
			System.out.println("stmt1-1");

		} else {
			System.out.println("stmt1-2");

		}
		boolean condition = false;
		if (condition) {
			System.out.println("stmt2-1");

		} else {
			System.out.println("stmt2-2");

		}

		int x = 21;
		int y = 30;

		if (x > y) {
			System.out.println("stmt3-1 : x > y ");

		} else {
			System.out.println("stmt3-2 : x <= y ");

		}

		if (x < y) {
			System.out.println("stmt4 : x < y ");

		}

		if (x == y) {
			System.out.println("stmt5 : x == y ");

		}

		if (x != y) {
			System.out.println("stmt6 : x != y ");

		}

		if (x > 20)
			System.out.println("stmt7-1");

		else
			System.out.println("stmt7-2");
		System.out.println("stmt8:if문 범위 밖 항상 실행!!");

		//들여쓰기 단축키; ctrl+shift+f

		
			
		System.out.println("----------지역 변수의 범위----------");
		int a = 90;
		if(true) {
			int b = 80;
			System.out.println("a="+a);
			System.out.println("b="+b);
		}

		System.out.println("a="+a);
		//System.out.println("b="+b);
		
		System.out.println("stmt99");
		return;
		//실행흐름(쓰레드 문맥)을 호출한 곳으로 되돌려 줌
		
		//System.out.println("after return");
		//unreachable code 실행될 수 없는 코드 
		//위에 return을 입력했기 때문
	}

}
