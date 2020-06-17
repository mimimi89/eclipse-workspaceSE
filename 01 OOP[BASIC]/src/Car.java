
//주차장 프로그램에서 차 객체(instance)를 생성하기 위한 클래스(틀, 설계도)

public class Car {
	//<<<<속성>>>>>
	//멤버필드(변수)
	//인스턴스 변수
	
	//class 안에 member를 넣을 것 예>차량번호, 입차시간, 출차시간, 주차요금
	//member 변수 선언(이전에는 로컬 변수)
	
	String no;//차량번호
	int inTime;//입차시간
	int outTime;//출차시간
	int fee;//주차요금
	
	
	//<<<<<행위>>>>>>
	//멤버 메쏘드
	//인스턴스 메쏘드
	
	//영수증 출력
	void print() {
		System.out.println("-----*-----*-----*-----*-----*-----*-----*-----*----*-----*");
		System.out.println();
		System.out.printf("  %4s\t %4s\t %4s\t %4s\t", "차량번호", "입차시간", "출차시간", "주차요금");
		System.out.println();
		System.out.println("-----*-----*-----*-----*-----*-----*-----*-----*----*-----*");
		System.out.println();
		System.out.printf("%8s\t %4d시\t %12d시\t %13d원\t", this.no, this.inTime, this.outTime, this.fee);
		System.out.println();
		System.out.println("-----*-----*-----*-----*-----*-----*-----*-----*----*-----*");
	}

	
	
}//class
