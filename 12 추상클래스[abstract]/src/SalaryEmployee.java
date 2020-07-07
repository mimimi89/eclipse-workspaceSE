///
public class SalaryEmployee extends Employee {
	
	
	private int annualSalary;	//부모 클래스의 번호, 이름, 급여 상속받고 연봉 추가
	
	public SalaryEmployee() {	//기본생성자
		
	}
	
	
	
	public SalaryEmployee(int no, String name, int annualSalary) {	//번호, 이름, 연봉 포함하는 생성자 메쏘드
		super(no, name);	//캡슐화 되어 있어서 부모클래스의 번호와 이름은 super로 접근
		this.annualSalary = annualSalary;
	}



	@Override
	public void calculatePay() {		//급여 계산 추상 클래스를 재정의해서 사용
		this.setPay(this.annualSalary/12);
		
		
	}
	
	public void print() {		// 출력 메쏘드
		super.print();			//상속받은 출력 메쏘드 내용(번호, 이름, 급여(한달치))
		System.out.println("연봉: "+annualSalary);	//위 내용에 연봉까지 출력
	}


	//getter, setter 메쏘드
	public int getAnnualSalary() {
		return annualSalary;
	}



	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	
	
	
	
	



}
