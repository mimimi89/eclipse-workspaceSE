///
package korea.president;

import america.president.Trump;

public class Ys  {
	
	public int a; 		
	protected int b;	
	int c;
	private int d;
	
	public void method1() {
		System.out.println("Ys.public method1");
		
	}
	
	protected void method2() {
		System.out.println("Ys.protected method2");
	}
	
	void method3() {
		System.out.println("Ys.package method3");
		
	}
	
	private void method4() {
		System.out.println("Ys.private method4");
		
	}
	
	public void access() {
		
		/************ Ys와 같은 패키지 ***************/
		//import 할 필요 없이 public, protected, package는 사용 가능
		//private은 사용 불가
		Dj dj=new Dj();
		dj.a=1;
		dj.b=2;
		dj.c=3;
		//The field Dj.d is not visible
		//dj.d=4;
		dj.method1();
		dj.method2();
		dj.method3();
		//The method method4() from the type Dj is not visible
		//dj.method4();
		
		
		
		/************ Ys와 다른 패키지 ***************/
		Trump trump=new Trump();
		trump.a=1;
		//The field Trump.b is not visible
		//***틀의 상속이기 때문에 이미 생성된 객체와는 아무런 상관관계가 없음***
		//trump.b=2;
		//trump.c=3;
		//trump.d=4;
		trump.method1();
		//The method method2() from the type Trump is not visible
		//trump.method2();
		//trump.method3();
		//trump.method4();
		
		
		
	}

}
