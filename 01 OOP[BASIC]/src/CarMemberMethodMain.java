
public class CarMemberMethodMain {

	public static void main(String[] args) {
		//입차
		Car car1=new Car();
		car1.no="1234";
		car1.inTime=12;
		
		//출차
		car1.outTime=14;
		car1.fee=(car1.outTime-car1.inTime)*1000;
		
		//영수증 출력
		car1.print();
		

	}

}
