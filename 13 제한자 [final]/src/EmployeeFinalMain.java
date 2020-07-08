///
public class EmployeeFinalMain {

	public static void main(String[] args) {
		SalaryEmployee emp1=new SalaryEmployee(1, "kim", 30000000);
		//SalaryEmployee class로 생성한 객체 emp1
		emp1.calculatePay();
		
		HourEmployee emp2=new HourEmployee(2, "jim", 100, 20000);
		//HourEmployee class로 생성한 객체 emp2
		emp2.calculatePay();
	
		//Employee 배열 객체로 묶기 위한 과정
		Employee e1=emp1;
		Employee e2=emp2;
		
		
		Employee[] emps=new Employee[5];
		emps[0]=e1;
		emps[1]=e2;
		emps[2]=new SalaryEmployee(3, "dim", 35000000);
		emps[3]=new SalaryEmployee(4, "sim", 28000000);
		emps[4]=new HourEmployee(5, "fim", 120, 15000);
		
		for (int i = 0; i < emps.length; i++) {
			emps[i].calculatePay();
			System.out.println("----------"+emps[i].getName()+"님 급여 명세표----------");
			emps[i].print();
			double incentive=emps[i].calculateIncentive();
			System.out.println("인센티브: "+incentive);
			System.out.println("-------------------------------------");
			System.out.println();
			System.out.println();
		}
		System.out.println("우리 회사 사원 모두의 공통 인센티브율: "+Employee.INCENTIVE_RATE);
		System.out.println("우리 회사 사원 모두의 공통 인센티브율: "+SalaryEmployee.INCENTIVE_RATE);
		//공통의 개념은 상위 클래스 이용, 하위 클래스도 동일한 값을 출력하기는 함, static이니까
		


	}

}
