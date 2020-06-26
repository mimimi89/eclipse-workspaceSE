/*
제한자(final)

	1. 클래스 앞에 붙일 경우,	상속금지 
       ex> public final class Test{}
       
    2. 멤버메쏘드 앞에 붙일 경우, 	오버라이딩(재정의) 금지
       ex> public final void print(){}
       
    3. 멤버변수 앞에 붙일 경우--> 상수		//대부분의 경우, static과 같이 쓴다
       ex> public final int PORT_NUMBER=80;
       상수화됨(변경금지)
*/
public class FinalClass {
	
	public final int PORT_NUMBER=80;		//사용은 가능하지만 대입은 불가
	//public final int PORT_NUMBER;			//초기화 안 되면 변수와 같으니까 초기화가 꼭 필요함
	public final int INCENTIVE_RATE;
	
	
	public final static int NORTH=0;
	public final static int SOUTH=1;
	public final static int	EAST=2;
	public final static int WEST=3;
	
	
	public FinalClass() {
		this.INCENTIVE_RATE=10;				//초기화 방법 1 바로 혹은 2 생성자 메쏘드에서
		//this.INCENTIVE_RATE=15;				//두번째 대입 불가능
		System.out.println(this.INCENTIVE_RATE);
		System.out.println(this.PORT_NUMBER);
		
		System.out.println(FinalClass.EAST);
		System.out.println(FinalClass.WEST);
		System.out.println(FinalClass.NORTH);
		System.out.println(FinalClass.SOUTH);
		
		
		
	}
	
	
	public void method1() {
		System.out.println("FinalClass.method1()");
		
	}
	
	public final void method2() {
		System.out.println("FinalClass.method2() 난 final 메쏘드 재정의 금지");
		
	}
	
	
	
	public void move(int direction) {
		switch(direction) {
		case FinalClass.NORTH:
			System.out.println("move north");
		
			break;
			
		case FinalClass.EAST:
			System.out.println("move east");
		
			break;
		
		case FinalClass.WEST:
			System.out.println("move west");
			break;
			
		case FinalClass.SOUTH:
			System.out.println("move south");
			break;
		}
		
	}
	
	
	
	
	

}
