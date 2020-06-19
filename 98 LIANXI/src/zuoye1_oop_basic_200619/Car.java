package zuoye1_oop_basic_200619;

public class Car {
	//car 객체를 만들기 위한 클래쓰, car main에서 사용될 예정   
	
	//멤버필드, 멤버변수, 인스턴스 변수
	//속성!!!!
	//변수를 선언(타입+식별자)하는 과정
	//번호, 입차시간, 출차시간, 주차요금
	String no;
	int intime;
	int outtime;
	int fee;
	
	
		
	//멤버메쏘드, 인스턴스 메쏘드
	//행위!!!!
	//입차, 출차, 주차요금 계산, 출력 메쏘드
	//제한 없고, 반환값 없고, 차량번호와 입차시간 인자 두 개를 갖는 입차 메쏘드
	
	void intime(String no, int intime) {
		this.no=no;
		this.intime=intime;
		
	}
	
	void setOuttime(int outtime) {
		this.outtime=outtime;
	}
	
	void calculateFee() {
		this.fee=(this.outtime-this.intime)*1000;
	}
	
	void print() {
		System.out.println();
		System.out.printf("\t\t     주차요금 영수증\n");
		System.out.println("-----------------------------------------------------------");
		System.out.printf("%s\t %s\t %s\t %s\n", "차량번호", "입차시간", "출차시간", "주차요금");
		System.out.println("-----------------------------------------------------------");
		System.out.printf("%6s\t %13d\t %12d\t %14d\n", this.no, this.intime, this.outtime, this.fee);
		System.out.println("-----------------------------------------------------------");
	}
	
	
	
	
	
	

}
