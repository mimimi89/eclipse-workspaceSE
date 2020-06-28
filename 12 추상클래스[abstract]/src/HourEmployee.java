public class HourEmployee extends Employee {
	
	private int worksHour;		//번호, 이름, 급여에 일한 시간
	private int payPerHour;		//시간당 급여 추가
	
	public HourEmployee() {	//기본(디폴트) 생성자
		
	}
	
	

	public HourEmployee(int no, String name, int worksHour, int payPerHour) {	//번호, 이름, 일한시간, 시급 포함하는 생성자 메쏘드
		super(no, name);
		this.worksHour=worksHour;
		this.payPerHour=payPerHour;
	}



	@Override
	public void calculatePay() {	//추상클래스에 있는 급여 계산 메쏘드 재정의
		
		this.setPay(worksHour*payPerHour);
		
		
	}
	
	@Override
	public void print() {
		
		super.print();		//번호, 이름, 급여(한달치) 출력
		System.out.println(worksHour+"\t"+payPerHour); //일한 시간과 시급까지 출력
		
		
	}



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
