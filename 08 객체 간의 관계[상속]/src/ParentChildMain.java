
public class ParentChildMain {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("-------------child 1----------------");
		System.out.println();
		
		Child1 c1=new Child1();		//자식1 클래스로 찍어낸 객체 c1
		c1.member1=1;	//부모
		c1.member2=2;	//부모	
		c1.member3=3;	//자식1
		c1.method1();	//부모 
		c1.method2();	//부모
		c1.method3();	//자식1
		//c1.parentPrint();
		c1.childPrint();	//1 2 3 출력될 것
		System.out.println();
		
		System.out.println("--------------child 2----------------");
		System.out.println();
		
		Child2 c2=new Child2();
		c2.member1=1;
		c2.member2=2;
		c2.member4=4;	//자식2
		c2.method1();
		c2.method2();
		c2.method4();	//자식2
		//c2.parentPrint();
		c2.childPrint();	//1 2 4  출력될 것
		System.out.println();
		
		System.out.println("---------------Parent----------------");
		System.out.println();
		
		Parent p=new Parent();
		p.member1=1;
		p.member2=2;
		p.method1();
		p.method2();
		p.parentPrint();	//1 2 출력될 것
		
		
		
				
		
		

	}

}
