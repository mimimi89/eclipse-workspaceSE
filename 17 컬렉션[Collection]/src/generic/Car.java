package generic;
///

//주차장 프로그램에서 차 객체(instance)를 생성하기 위한 클래스(틀, 설계도)

public class Car {
	//<<<<속성>>>>>
	//멤버필드(변수)
	//인스턴스 변수
	
	//class 안에 member를 넣을 것 예>차량번호, 입차시간, 출차시간, 주차요금
	//member 변수 선언(이전에는 로컬 변수)
	
	private String no;//차량번호
	private int inTime;//입차시간
	private int outTime;//출차시간
	private int fee;//주차요금
	
	//생성자
	
	public Car(String no, int inTime) {
		super();
		this.no = no;
		this.inTime = inTime;
	}
	
	
	public Car(String no, int inTime, int outTime, int fee) {
		super();
		this.no = no;
		this.inTime = inTime;
		this.outTime = outTime;
		this.fee = fee;
	}



	//<<<<<행위>>>>>>
	//멤버 메쏘드
	//인스턴스 메쏘드
	
	//입차
	public void ipCha(String no, int inTime) {
		this.no=no;
		this.inTime=inTime;
	}
	
	//출차시간 set
	public void setOutTime(int outTime) {
		this.outTime=outTime;
	}
	
	//요금계산
	public void calculateFee(){
		this.fee=(this.outTime-this.inTime)*1000;
				
	}
	
	public static void headerPrint() {
		System.out.println("-----*-----*-----*-----*-----*-----*-----*-----*----*-----*");
		System.out.printf("  %4s\t %4s\t %4s\t %4s\t", "차량번호", "입차시간", "출차시간", "주차요금");
		System.out.println();
		System.out.println("-----*-----*-----*-----*-----*-----*-----*-----*----*-----*");
		
	}
	/*
	@Override
	public String toString() {
		return "Car [no=" + no + ", inTime=" + inTime + ", outTime=" + outTime + ", fee=" + fee + "]";
	}
	*/

	
	//영수증 출력
	public void print() {
		
		System.out.printf("%8s\t %4d시\t %12d시\t %13d원\t", this.no, this.inTime, this.outTime, this.fee);
		System.out.println();
		System.out.println("-----*-----*-----*-----*-----*-----*-----*-----*----*-----*");

	}

	public String getNo() {
		return no;
	}

	public int getInTime() {
		return inTime;
	}

	public int getOutTime() {
		return outTime;
	}

	public int getFee() {
		return fee;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public void setInTime(int inTime) {
		this.inTime = inTime;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}


	
	
	
}//class
