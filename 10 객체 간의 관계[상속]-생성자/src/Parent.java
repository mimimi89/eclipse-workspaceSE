
public class Parent extends Object{	
	//최상위 클래스 Object를 상속받는 Parent 클래스
	
	//멤버필드
	public int member1;
	public int member2;		
	
	
	//생성자 메쏘드
	public Parent() {		
		super();
		System.out.println("Parent() 기본(디폴트) 생성자");
	}
	
	//출력내용을 포함하는 생성자 메쏘드
	public Parent(int member1, int member2) {		
		super();
		this.member1 = member1;
		this.member2 = member2;
		System.out.println("public Parent(int member1, int member2)");
	}

	//인스턴스 메쏘드
	public void method1() {			
		System.out.println("Parent.method1()");
	}
	public void method2() {			
		System.out.println("Parent.method2()");
	}
	
	

}
