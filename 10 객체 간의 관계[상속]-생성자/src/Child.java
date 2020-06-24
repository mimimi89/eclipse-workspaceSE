
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
		//반드시 부모 클래스의 기본(디폴트)생성자가 호출되어야 한다.
		//부모 클래스의 생성자를 호출하지 않을 시, 부모의 기본 생성자가 자동으로 호출된다. --> super(); 생략가능
		//부모 클래스 기본 생성자 호출은 생략가능하다.
		super();	//생략가능
		System.out.println("Child()디폴트생성자");
		
		
	}
	
	
	public Child(int member1, int member2, int member3) {
		super(member1, member2);
		this.member3 = member3;
		System.out.println("public Child(int member1, int member2, int member3)호출");
	}


	public int member3;
	public void method3() {
		System.out.println("Parent.method3()");
	}
	
	

}
