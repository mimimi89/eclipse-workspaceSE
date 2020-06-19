package zuoye1_oop_basic_200619;

public class CarMemberMethodMain {

	public static void main(String[] args) {
		
		
		//객체 생성 후 주소값 대입(초기화)
		Car car1=new Car();
		Car car2=new Car();
		
		//멤버메쏘드에 접근하기 위해서는 "참조변수.멤버메쏘드의 이름(인자)"
		//입차 메쏘드에 차량번호와 입차시간 대입
		//두 개의 차 객체 1234/12, 5678/13
		
		car1.intime("1234", 12);
		car2.intime("5678", 13);
		
		
		//출차 메쏘드에 출차시간 대입, 주차요금 계산 메쏘드
		
		car1.setOuttime(14);
		car1.calculateFee();
		
		car2.setOuttime(18);
		car2.calculateFee();
		
		
		//출력 메쏘드
		car1.print();
		car2.print();
		
				
				

	}

}
