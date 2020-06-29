
public class InterfaceABImpl extends Object implements InterfaceA, InterfaceB{
	//InterfaceABImpl 클래스는 Object 클래스를 상속받고, InterfaceA와 InterfaceB를 구현한다.

	@Override
	public void method1() {
		System.out.println("InterfaceA.method1() 구현(재정의)");
		
	}
	
	@Override
	public void method2() {
		System.out.println("InterfaceA.method2() 구현(재정의)");
		
	}
	
	@Override
	public void method3() {
		System.out.println("InterfaceB.method3() 구현(재정의)");
		
	}

	@Override
	public void method4() {
		System.out.println("InterfaceB.method4() 구현(재정의)");
		
	}


}
