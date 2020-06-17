
public class CarEncapsulationMain {

	public static void main(String[] args) {
		//입차
		Car car1=new Car();
		car1.ipCha("1234", 12);
		
		Car car2=new Car();
		car2.ipCha("5678", 13);
		
		
		//출차
		//	-출차 시간 대입
		//	-요금 계산
		car1.setOutTime(17);
		car1.calculateFee();
		
		car2.setOutTime(15);
		car2.calculateFee();
		
		
		
		//영수증 출력
		car1.print();
		car2.print();
		
		

	}

}
