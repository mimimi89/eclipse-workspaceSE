
public class Child extends Parent {		//부모 클래스로부터 2개의 멤버변수와 2개의 생성자 메쏘드, 2개의 멤버메쏘드를 상속받는 자식 클래스
	
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
	public int member3;
	
	public Child() {		//자식 클래스의 기본 생성자(부모 클래스의 기본 생성자 포함)
		//클래스의 생성자 첫번째 라인에서는 어떤 일이 발생?
		//반드시 부모 클래스의 기본(디폴트)생성자가 호출되어야 한다.
		//부모 클래스의 생성자를 호출하지 않을 시, 부모의 기본 생성자가 자동으로 호출된다. --> super(); 생략가능
		//부모 클래스 기본 생성자 호출은 생략가능하다.
		super();	//생략가능
		System.out.println("Child()디폴트생성자");
		
		
	}
	
	
	public Child(int member1, int member2, int member3) {	//부모 클래스로부터 상속받은  멤버변수 2개와  새로 선언된 멤버변수 포함하는 생성자 메쏘드
		super(member1, member2);
		this.member3 = member3;
		System.out.println("public Child(int member1, int member2, int member3)호출");
	}


	public void method3() {  //부모로부터 상속받은 2개의 메쏘드에 추가된 메쏘드 1개
		System.out.println("Parent.method3()");
	}
	
	

}
