
public class MemberMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MemberMethod mm=new MemberMethod();
		
		//멤버필드접근: 참조변수.멤버필드 이름
		
		mm.member1=456789;
		
	
		System.out.println("main흐름 start");
	
		System.out.println("main흐름 1");
		
		//멤버메쏘드 실행(호출): 참조변수.메쏘드이름()
		//mm객체의 method1 메쏘드 블록을 실행하기 위해 main 실행흐름을 method1블록으로 보낸다.
		

		mm.method1();		//이름과 괄호까지, 이름만 쓰면 에러 발생

		System.out.println("main흐름 2");
		
		mm.method2(3);

		System.out.println("main흐름 3");

		mm.method3("김경호는 잘생겼다", 10);

		mm.method3("김경호는 못생겼다", 3);
		

		System.out.println("main흐름 4");

		
		mm.method4("김경호", "안녕하세요", 2);
		mm.method4("김태희", "뭐하세요?", 2);
	

		System.out.println("main흐름 5");

		
		System.out.println("main흐름 end");
		
		return;
		
		
		

	}

}
