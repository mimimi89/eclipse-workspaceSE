///
package korea.prince;

import korea.president.Ys;

public class YsChild extends Ys{
	
	/*
	 Ys로부터 상속받은 내용
	
	public int a; 		
	protected int b;	
	(Package) int c;	
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
	
	 */
	
	public void access2() {
		this.a=1;
		this.b=2;
		//this.c=3;
		//this.d=4;
		
		this.method1();
		this.method2();
		//this.method3();
		//this.method4();
		 
		
		
	}
	
	
	
	
	
	

}
