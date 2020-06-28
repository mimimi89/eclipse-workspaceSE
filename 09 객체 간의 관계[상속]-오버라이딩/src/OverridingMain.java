
public class OverridingMain {

	public static void main(String[] args) {
		
		OverridingChild oc=new OverridingChild();		//OverridingChild(자식 클래스)로 찍어낸 객체 oc
		System.out.println("부모클래쓰로부터 상속받은 메쏘드:");	
		oc.method1();	//부모 클래스 그대로							
		System.out.println("재정의/오버라이딩한 메쏘드:");		
		oc.method2();	//오버라이딩된 메쏘드
		System.out.println("자식클래쓰에서 선언한 메쏘드:");
		oc.method3();	//자식 클래스에서  선언한 메쏘드
		
		


		
		
		
		
		
	}

}
