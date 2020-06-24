
public class Child extends Parent {
	
	/*
	public int member1;
	public int member2;
	
	public void method1() {
		System.out.println("Parent.method1()");
	}
	public void method2() {
		System.out.println("Parent.method2()");
	} 
	 */
	
	public Child() {
		//클래스의 생성자 첫번째 라인에서는 어떤 일이 발생?
		//부모 클래스의 기본(디폴트)생성자가 호출된다
		super();	//생략가능
		System.out.println("Child()디폴트생성자");
		
		
		
		
		
	}
	
	
	
	public int member3;
	public void method3() {
		System.out.println("Parent.method3()");
	}
	
	

}
