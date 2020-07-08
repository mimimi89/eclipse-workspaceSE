//
public class SalaryEmployee extends Employee {
	//Employee class를 상속 받는 SalaryEmployee class
	
	
	private int annualSalary;	//연봉
	
	//생성자 메쏘드
	public SalaryEmployee() {
		
	}
	
	public SalaryEmployee(int no, String name, int annualSalary) {
		super(no, name);
		this.annualSalary = annualSalary;
	}

	//급여 계산, 출력 메쏘드 재정의
	@Override
	public void calculatePay() {
		this.setPay(this.annualSalary/12);
		
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(annualSalary);
	}


	//getter, setter 메쏘드
	public int getAnnualSalary() {
		return annualSalary;
	}



	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	
	
	
	
	



}
