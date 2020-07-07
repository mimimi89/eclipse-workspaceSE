///
public class EmployeeAbstractMain {

	public static void main(String[] args) {
		System.out.println();
		SalaryEmployee emp1=new SalaryEmployee(1, "kim", 30000000);	
		//연봉 받는 근로자 객체 하나 생성
		emp1.calculatePay();
		//급여 계산 
		emp1.print();
		
		HourEmployee emp2=new HourEmployee(2, "jim", 100, 20000);
		//시급 받는 근로자 객체 하나 생성
		emp2.calculatePay();
		//급여 계산
		emp2.print();
		System.out.println();
	
		
		Employee e1=emp1;
		Employee e2=emp2;	
		//Employee class 추상클래스라서 객체 생성은 안 되지만 변수 선언은 가능
		//배열 객체의 일원으로 포함시키기 위한 변수 선언 작업
		
		
		Employee[] emps=new Employee[5];	
		//5명의 근로자가 하나의 배열 객체로 
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
