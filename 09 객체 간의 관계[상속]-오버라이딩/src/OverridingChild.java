
public class OverridingChild extends Overriding{
	
	/*
	 public void method1() {
		System.out.println("Overriding.method1()");
		
	}
	
	public void method2() {
		System.out.println("Overriding.method2()");
	}
	 */
	

	//상속받은 method2는 은폐되고 재정의된 method만 호출 가능 
	public void method2() {		//원래는 overriding.method2()를 출력하게 만들어짐
		System.out.println("-------재정의 method2() start-------");
		System.out.println("Overriding.method2()를 OverridingChild에서 재정의");
		System.out.println("this.toString()");		
		System.out.println("super.toString()");		
		super.method2();
		//super this와 같은 self 참조변수
		//		this와 같은 주소를 가리킨다.
		//		상속받은 재정의된 은폐된 메쏘드를 호출할 때 사용한다.
		
		System.out.println("--------재정의 method2() end--------");
		System.out.println();
		
		
	}
	
	public void method3() {
		System.out.println("OverridingChild.method3()");
		System.out.println();
		
		
	}
	
	

}
