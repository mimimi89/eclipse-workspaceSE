
public class Child2 extends Parent {	//부모 클래스를 상속받는 자식2 클래스
	public int member4;		//상속 받은 2개 포함, 3개
	public void method4() {
		System.out.println("Child2.method4()");
	}
	public void childPrint() {		//상속 받은 3개 포함 5개
		this.parentPrint();
		System.out.println(this.member4);
		
	}

}
