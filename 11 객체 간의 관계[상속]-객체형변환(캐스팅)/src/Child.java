///
public class Child extends Parent {		
	//Parent 클래스를 상속받는 Child 클래스

	//Parent.method3()이 출력되는 메쏘드를 재정의(오버라이드) 함
	@Override
	public void method3() {
		System.out.println("Parent.method3()을 Child에서 재정의");
	}
	
	//아무 내용도 출력되지 않는 메쏘드를 재정의 해서 child.method4가 출력되게 함
	@Override
	public void method4() {
		System.out.println("Child.method4()");
	}
	
	//아무 내용도 출력되지 않는 메쏘드를 재정의 해서 child.method5가 출력되게 함
	@Override
	public void method5() {
		System.out.println("Child.method5()");
	}
	
	
	
	
}
