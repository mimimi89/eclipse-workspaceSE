//
public class HourEmployee extends Employee {
	//Employee class를 상속받는 HourEmployee class
	
	private int worksHour;		//일한 시간
	private int payPerHour;		//시간당 급여
	
	//생성자 메쏘드
	public HourEmployee() {
		
	}
	
	
	public HourEmployee(int no, String name, int worksHour, int payPerHour) {
		super(no, name);
		this.worksHour=worksHour;
		this.payPerHour=payPerHour;
	}


	//급여 계산, 출력 메쏘드 재정의
	@Override
	public void calculatePay() {
		this.setPay(worksHour*payPerHour);
		
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(worksHour+"\t"+payPerHour);
		
	}

	//getter, setter 메쏘드
	public int getWorksHour() {
		return worksHour;
	}



	public int getPayPerHour() {
		return payPerHour;
	}



	public void setWorksHour(int worksHour) {
		this.worksHour = worksHour;
	}



	public void setPayPerHour(int payPerHour) {
		this.payPerHour = payPerHour;
	}
	
	
	
	

}
