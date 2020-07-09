///그다지??

public class InterfaceABImplMain {

	public static void main(String[] args) {
		System.out.println("-----------------------InterfaceABImpl-----------------------");
		
		InterfaceABImpl abImpl=new InterfaceABImpl();
		//InterfaceA, InterfaceB를 구현한 InterfaceABImpl class
		//InterfaceABImpl로 생성한 abImpl 객체
		
		abImpl.method1();
		abImpl.method2();
		abImpl.method3();
		abImpl.method4();
		//참조변수+도트 연산자로 메쏘드 실행
		
		System.out.println("------------------------InterfaceA---------------------------");
		
		InterfaceA ia=abImpl;
		//추상클래스나 인터페이스는 객체 만들 수 없음, 상위클래스로 캐스팅
		
		ia.method1();
		ia.method2();
		
		System.out.println("------------------------InterfaceB---------------------------");
		
		InterfaceB ib=abImpl;
		
		ib.method3();
		ib.method4();
		
		System.out.println("--------------------------Object-----------------------------");
		Object o=abImpl;
		
		System.out.println("----------------InterfaceA<-->InterfaceB---------------------");
		InterfaceA ia2=new InterfaceABImpl();
		ia2.method1();
		ia2.method2();
		InterfaceB ib2=(InterfaceB)ia2;
		ib2.method3();
		ib2.method4();
		
		
		
		
		
		
		
		
		

	}

}
