package zuoye2_oop_encapsulation_200619;

public class CarEncapsulationMain {

	public static void main(String[] args) {
		
		
				Car car1=new Car();
				car1.intime("1234", 12);
				
				Car car2=new Car();
				car2.intime("5678", 13);
				
				
				car1.setOuttime(14);
				car1.calculateFee();
				
				car2.setOuttime(14);
				car2.calculateFee();
				
				car1.print();
				car2.print();
		

	}

}
