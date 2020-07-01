///

public class Child1 extends Parent{		
//변수 2개, 메쏘드 3개를 포함하고 있는 parent 클래스르 상속받는 child1 클래스
	
	
	/*
	public int member1;
	public int member2;
	
	public void method1() {
		System.out.println("Parent.method1()");
	}
	public void method2() {
		System.out.println("Parent.method2()");
	}
	
	public void parentPrint() {
		System.out.print(member1+"\t"+member2+"\t");
	}
	*/
	
	public int member3;		//상속받은 것까지 변수 3개
	
	public void method3() {
		System.out.println("Child1.method3()");
	}
	
	public void childPrint() {
		this.parentPrint();
		System.out.println(this.member3);
	}
	
	
	
	
	
	
	
	

}
