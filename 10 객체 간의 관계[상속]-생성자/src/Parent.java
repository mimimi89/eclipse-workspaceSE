
public class Parent extends Object{
	
	public int member1;
	public int member2;
	
	
	
	public Parent() {
		super();
		System.out.println("Parent() 기본(디폴트) 생성자");
	}
	
	
	
	public Parent(int member1, int member2) {
		super();
		this.member1 = member1;
		this.member2 = member2;
		System.out.println("public Parent(int member1, int member2)");
	}



	public void method1() {
		System.out.println("Parent.method1()");
	}
	public void method2() {
		System.out.println("Parent.method2()");
	}
	
	

}
