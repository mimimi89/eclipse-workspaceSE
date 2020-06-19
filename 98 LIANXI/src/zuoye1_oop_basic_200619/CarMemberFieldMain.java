package zuoye1_oop_basic_200619;

public class CarMemberFieldMain {

	public static void main(String[] args) {


		/*
		 * 1.입차 1234번 차량 12시  
		 *   - 차객체생성
		 */
		
		//차 객체를 생성 후 주소 없음으로 초기화
		Car car1=null;
		
		//참조변수 car1에 주소값 대입
		car1=new Car();
		
		//print하면 car1의 주소값을 알 수 있음
		System.out.println(car1);
		
		//차 객체의 멤버변수에 차량번호와 입차시간을 대입
		//멤버변수에 접근하기 위해서는 "참조변수.식별자(멤버변수의 이름)"
		car1.no="1234"; 	//car1이라는 객체의 멤버변수 no에 차량번호 "1234"를 대입
		car1.intime=12; 	//car1이라는 객체의 멤버변수 intime에 입차시간 12시를 대입
								
		/*
		 * 2. 14시에 1234번차량 출차
		 */
		
		//차 객체의 멤버 변수에  출차시간, 주차요금(시간당 천 원)을 대입 
		car1.outtime=14;
		car1.fee=(car1.outtime-car1.intime)*1000;
		
		//출력 메쏘드 입력 전이라고 가정 하에 영수증 출력(printf 이용) 
		System.out.println();
		System.out.printf("\t\t     주차요금 영수증\n");
		System.out.println("-----------------------------------------------------------");
		System.out.printf("%s\t %s\t %s\t %s\n", "차량번호", "입차시간", "출차시간", "주차요금");
		System.out.println("-----------------------------------------------------------");
		System.out.printf("%6s\t %13d\t %12d\t %14d\n", "1234", 12, 14, car1.fee);
		System.out.println("-----------------------------------------------------------");
		
		

	}

}
