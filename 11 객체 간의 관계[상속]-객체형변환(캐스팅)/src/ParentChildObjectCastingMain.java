///

/*
 객체의 형변환(캐스팅)
   1. 부모-자식 관계에 있는 클래스들에서만 가능하다.
   
   2. 자식 객체를 부모 클래스 타입으로 묵시적 형변환
       Child c = new Child();
       Parent pppp = c; 
       
   3. 부모 객체를 자식 클래스 타입으로 형변환은 원칙적으로 불가능
       Parent p=new Parent();
       Child cccc = p;(X)
       
    public class Parent{}
    public class Child extends Parent{}
 */
public class ParentChildObjectCastingMain {

	public static void main(String[] args) {

		System.out.println("---------------Child 객체----------------");
		Child c1=new Child();		
		c1.method1();
		c1.method2();
		c1.method3();
		c1.method4();
		c1.method5();
		
	
		System.out.println("--------------Child -->> Parent-----------");
		Parent p1=c1;
		p1.method1();
		p1.method2();
		//재정의된 메소드는 Parent Type으로도 자식의 메쏘드 호출 가능
		p1.method3();
		p1.method4();
		
		p1.method5();
	
		
		System.out.println("--------------Parent-->>Child----------");
		Parent p2=new Parent();			
		//실행시 ClassCastException 발생
		//Child c2=(Child)p2;
		
		
		Parent p3=new Child();
		Child c3=(Child)p3;
		c3.method1();
		c3.method2();
		c3.method3();
		c3.method4();
		c3.method5();
		



		
		
		
		
		
		
		
		
		
	}

}
