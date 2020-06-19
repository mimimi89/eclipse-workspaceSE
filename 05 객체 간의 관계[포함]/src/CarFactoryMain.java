
public class CarFactoryMain {

	public static void main(String[] args) {
		
		//System.out.println("------------member field를 통한 접근----------");
		/*
		Car car1=new Car();
		car1.no=1;
		car1.model="SM7";
		
		Engine e1=new Engine();
		e1.type="A";
		e1.cc=2000;
		car1.engine=e1;
		
		System.out.println(car1.no+"\t"+car1.model+"\t"+car1.engine.type+"\t"+car1.engine.cc);
		
		**********캡슐화 이후 접근할 수 없기 때문
		*/
		System.out.println();
		
		System.out.println("-----------member method를 통한 접근----------");
		Car car2=new Car();
		car2.setNo(2);
		car2.setModel("GENESIS");
		
		Engine e2=new Engine();
		e2.setType("B");
		e2.setCc(3000);
		
		car2.setEngine(e2);
		car2.print();
		
		System.out.println();
		
		System.out.println("------------------constructor-----------------");
		Engine e3=new Engine("X", 2390);
		Car car3=new Car(3, "SM5", e3);
		car3.print();
		
		Car car4=new Car(4, "BENZ", new Engine("Z", 4800));
		car4.print();
		
		System.out.println();
		
		System.out.println("---------------------엔진검사-----------------");
		
		Engine car2Engine=car2.getEngine();
		
		car2Engine.print();
		
		
		
		
		
		
	}//main

}//class
