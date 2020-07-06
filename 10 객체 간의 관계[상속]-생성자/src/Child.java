
public class Child extends Parent {		
	//Parent 클래스를 상속받는 Child 클래스
	
	
	/*
	 * Parent class로부터 상속받은 내용
	
	public int member1;
	public int member2;		
	
	public void method1() {
		System.out.println("Parent.method1()");
	}
	public void method2() {
		System.out.println("Parent.method2()");
	} 
	 */
	
	//멤버필드
	public int member3;
	
	//생성자 메쏘드
	public Child() {		
		/*
		- 부모 클래스의 생성자를 호출하지 않을 시, 
		부모의 기본 생성자가 자동으로 호출된다. --> super(); 생략가능
		*/
		System.out.println("Child()디폴트생성자");
	}
	
	public Child(int member1, int member2, int member3) {	
		super(member1, member2);
		this.member3 = member3;
		System.out.println("public Child(int member1, int member2, int member3)호출");
	}

	//인스턴스 메쏘드
	public void method3() { 
		System.out.println("Parent.method3()");
	}
	
	

}
