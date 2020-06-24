
public class OverridingMain {

	public static void main(String[] args) {
		
		OverridingChild oc=new OverridingChild();
		System.out.println("부모클래쓰로부터 상속받은 메쏘드:");
		oc.method1();
		System.out.println("재정의/오버라이딩한 메쏘드:");
		oc.method2();
		System.out.println("자식클래쓰에서 선언한 메쏘드:");
		oc.method3();
		
		


		
		
		
		
		
	}

}
