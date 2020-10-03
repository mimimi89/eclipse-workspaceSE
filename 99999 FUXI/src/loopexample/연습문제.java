package loopexample;

public class 연습문제 {

	public static void main(String[] args) {
		int dan;
		int times;
		
		System.out.println("2. 구구단을 짝수단만 출력-->continue문 사용");
		System.out.println();
		for (dan = 2; dan <= 9; dan++) {
			if(dan%2!=0)
				continue;
			for (times = 1; times <= 9; times++) {
				System.out.println(dan+"*"+times+"="+dan*times);
			}
			System.out.println();
		}

		System.out.println("3. 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력-->break문 사용");
		System.out.println();
		for (dan = 2; dan <= 9; dan++) {
			for (times = 1; times <= 9; times++) {
				if(times>dan)
					break;
				System.out.println(dan+"*"+times+"="+dan*times);
			}
			System.out.println();
		}
		
	}

}
