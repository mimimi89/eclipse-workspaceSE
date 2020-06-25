///

public class Calculator {
	
	//public int add(){}
	//접근제한자, 타입, 식별자 이름까지 동일하지만 인자의 개수가 다름
	public int add() {	//인자 없음
		System.out.println("add()=");
		return 2+2;		//반환값 4
	}
	
	public int add(int a) {	//인자 하나
		System.out.println("add(a)=");
		return a+2;		//반환값 인자값+2
	
	}
	
	public int add(int a, int b) {	//인자 둘
		System.out.println("add(a, b)=");
		return a+b;		//반환값 두 인자의 합
	
	}
	
	public int add(int a, int b, int c) {  //인자 셋
		System.out.println("add(a, b, c)=");
		return a+b+c;	//반환값 세 인자의 합
		
	}
	
	

}
