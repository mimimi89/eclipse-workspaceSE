
public class EmployeeAbstractMain {

	public static void main(String[] args) {
		SalaryEmployee emp1=new SalaryEmployee(1, "kim", 30000000);	//1번, kim, 연봉 3000만원
		emp1.calculatePay();
		//emp1.print();
		HourEmployee emp2=new HourEmployee(2, "jim", 100, 20000);	//2번, jim, 일한시간 100시간, 시급 20000원
		emp2.calculatePay();
		//emp2.print();
		
		//연봉 받는 근로자 객체 하나, 시급 받는 근로자 객체 하나 생성하고, 급여 계산
		
		Employee e1=emp1;
		Employee e2=emp2;	//배열 객체의 일원으로 포함시키기 위한 작업
		
		
		Employee[] emps=new Employee[5];	//5명의 근로자가 하나의 배열 객체로 
		emps[0]=e1;
		emps[1]=e2;
		emps[2]=new SalaryEmployee(3, "dim", 35000000);
		emps[3]=new SalaryEmployee(4, "sim", 28000000);
		emps[4]=new HourEmployee(5, "fim", 120, 15000);
		
		for (int i = 0; i < emps.length; i++) {		//배열 객체로 묶었으니까 for문 사용
			emps[i].calculatePay();		//급여계산
			System.out.println("----------"+emps[i].getName()+"님 급여 명세표----------");
			emps[i].print();
			System.out.println("-------------------------------------");
			System.out.println();
			System.out.println();
		}
		
		

		
		
		
		
		

	}

}
