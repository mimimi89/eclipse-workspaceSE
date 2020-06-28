
public class Parent extends Object{	//최상위 클래스 오브젝트를 상속받는 부모클래스
	
	public int member1;
	public int member2;		//멤버필드 2개
	
	
	
	public Parent() {		//기본생성자
		super();
		System.out.println("Parent() 기본(디폴트) 생성자");
	}
	
	
	
	public Parent(int member1, int member2) {		//member1과 member2를 포함하는 생성자 메쏘드
		super();
		this.member1 = member1;
		this.member2 = member2;
		System.out.println("public Parent(int member1, int member2)");
	}


	public void method1() {			// Parent.method1()를 출력하는 인스턴스 메쏘드
		System.out.println("Parent.method1()");
	}
	public void method2() {			// Parent.method2()를 출력하는 인스턴스 메쏘드
		System.out.println("Parent.method2()");
	}
	
	

}
