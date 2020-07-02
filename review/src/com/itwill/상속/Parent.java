package com.itwill.상속;

public abstract class Parent{
	//객체 만들어봤자 의미 없으니까 abstract 추상메쏘드

	public int member1;
	public int member2;

	public Parent() {
		super();
	}

	public void method1() {
		System.out.println("Parent methode1()");
		
		

	}

	public abstract void method2();
	//자식 클래스에서 다른 기능을 수행할 때, abstract(추상클래스) 추가
	//중괄호 필요 없고, 자식 클래스에서 재정의(오버라이딩) 해성 사용
		
}
	
	
	
	
