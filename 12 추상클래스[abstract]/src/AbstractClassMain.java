
public class AbstractClassMain {

	public static void main(String[] args) {

		//AbstractClass ac1=new AbstractClass();
		//Cannot instantiate the type AbstractClass(객체 구현 불가)
		
		AbstractClassChild acc1=new AbstractClassChild();
		acc1.method1();
		acc1.method2();
		
		AbstractClass ac2=new AbstractClassChild();
		//객체 생성은 안 되지만 변수 선언은 가능
		ac2.method1();
		ac2.method2();
		
		
		
	}

}
