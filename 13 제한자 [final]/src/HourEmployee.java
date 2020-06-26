public class HourEmployee extends Employee {
	
	private int worksHour;		//일한 시간
	private int payPerHour;		//시간당 급여
	
	public HourEmployee() {
		
	}
	
	

	public HourEmployee(int no, String name, int worksHour, int payPerHour) {
		super(no, name);
		this.worksHour=worksHour;
		this.payPerHour=payPerHour;
	}



	@Override
	public void calculatePay() {
		
		this.setPay(worksHour*payPerHour);
		
		
	}
	
	@Override
	public void print() {
		
		super.print();
		System.out.println(worksHour+"\t"+payPerHour);
		
		
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
