
/*
단항연산자
1. 산술연산자
	- 증가,감소연산자
		ex> i++ , i-- , ++i , --i 
	- 자기 자신의 값을 정수 1만큼 증가시키거나 감소시키는 연산자

2. 논리연산자
	- true-->false, false-->true
		ex> !(true) --> false
		!(논리 or not 연산자)
		
3. 부호연산자
	-부호를 결정함
		ex> +4, +no, -9, -no

*/

public class UnaryOperator {
//unary 단항의, 1진법의
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = -1;
		int b = 2;
		//선언 및 초기화(대입) 끝
		
		a = -a;
		b = -b;
		System.out.println(a);
		System.out.println(b);
		
		//반복문 사용할 때, 증가, 감소 연산자 자주 사용
		int i = 5;
		int j = 5;
		
		i++;
		//i++, ++i의 의미는 i=i+1;
		j++;
		//j++, ++j의 의미는 j=j+1;
		//플플을 앞에 붙이던 뒤에 붙이던 값이 달라지지 않음
		//통상 뒤쪽에 붙임
		
		System.out.println("----------<++i, ++j>---------");
		System.out.println("i --> "+i);
		System.out.println("j --> "+j);
		
		System.out.println("----------<--i, --j>---------");
		i=5;
		j=5;
		
		--i;//i=i-1
		--j;//j=j-1
		
		System.out.println("--i --> "+i);
		System.out.println("--j --> "+j);
		
		System.out.println("****************************");
		
		i=5;
		j=5;
		
		int ir;
		int jr;
		
		ir = ++i;
		jr = j++;
		
		System.out.println("++i ==> "+i);
		System.out.println("j++ ==> "+j);
		
		System.out.println("++i ==> "+ir);
		System.out.println("j++ ==> "+jr);
		
		System.out.println("****************************");
		
		int count1 = 0;
		int count2 = 0;
		
		System.out.println(++count1 +" 번째 방문입니다.");
		System.out.println(count2++ +" 번째 방문입니다.");
		
		System.out.println("count1 --> "+count1);
		System.out.println("count2 --> "+count2);
		
		
	}

}
