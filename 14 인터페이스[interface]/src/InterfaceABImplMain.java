
public class InterfaceABImplMain {

	public static void main(String[] args) {
		System.out.println("------------------------InterfaceABImpl---------------------------");
		
		InterfaceABImpl abImpl=new InterfaceABImpl();
		
		abImpl.method1();
		abImpl.method2();
		abImpl.method3();
		abImpl.method4();
		
		System.out.println("------------------------InterfaceA---------------------------");
		
		InterfaceA ia=abImpl;
		//추상클래스나 인터페이스는 객체 만들 수 없음, 상위클래스로 캐스팅
		
		ia.method1();
		ia.method2();
		
		System.out.println("------------------------InterfaceB---------------------------");
		
		InterfaceB ib=abImpl;
		
		ib.method3();
		ib.method4();
		
		
		
		
		
		
		

	}

}
