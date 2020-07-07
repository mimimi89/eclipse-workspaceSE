
public class FinalClassMain {

	public static void main(String[] args) {

		FinalClass fc1=new FinalClass();
		System.out.println("--------------------------------------");
		
		System.out.println(fc1.INCENTIVE_RATE);
		System.out.println(fc1.PORT_NUMBER);
		System.out.println("--------------------------------------");
		
		FinalClass fc2=new FinalClass();
		System.out.println("--------------------------------------");
		
		System.out.println(fc2.INCENTIVE_RATE);
		System.out.println(fc2.PORT_NUMBER);
		System.out.println("--------------------------------------");
		
		System.out.println(FinalClass.EAST);
		System.out.println(FinalClass.WEST);
		System.out.println(FinalClass.NORTH);
		System.out.println(FinalClass.SOUTH);
		System.out.println("--------------------------------------");
		
		fc1.move(FinalClass.NORTH);
		fc1.move(FinalClass.SOUTH);
		fc1.move(FinalClass.EAST);
		fc1.move(FinalClass.WEST);
		System.out.println();
		
		System.out.println("-----------FinalClassChild------------");
		FinalClassChild fcc1=new FinalClassChild();
		System.out.println("--------------------------------------");
		
		fcc1.method1();
		fcc1.method2();
		System.out.println("--------------------------------------");
		
		System.out.println(fcc1.INCENTIVE_RATE);
		System.out.println(fcc1.PORT_NUMBER);
		System.out.println();
		
		System.out.println("---------Parent static member----------");
		System.out.println(FinalClass.EAST);
		System.out.println(FinalClass.WEST);
		System.out.println(FinalClass.NORTH);
		System.out.println(FinalClass.SOUTH);
		
		System.out.println("---------Parent static member----------");
		/*
		System.out.println(FinalClassChild.EAST);
		System.out.println(FinalClassChild.WEST);
		System.out.println(FinalClassChild.NORTH);
		System.out.println(FinalClassChild.SOUTH);
		*/
		
		//상속은 객체 생성 시 이루어짐
		
		
		
	}

}
