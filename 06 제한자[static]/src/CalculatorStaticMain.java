
public class CalculatorStaticMain {
	public static void main(String[] args) {
		
		/*
		Calculator calculator=new Calculator();
		int r=calculator.add(1, 2);
		System.out.println(r);
		
		r=calculator.sub(1, 2);
		System.out.println(r);
		
		r=calculator.div(1, 2);
		System.out.println(r);
		
		r=calculator.mul(1, 2);
		System.out.println(r);
		*/
		
		
		
		System.out.println();
		System.out.println("----------------static way-------------------");
		System.out.println(Calculator.add(1, 2));
		System.out.println(Calculator.sub(1, 2));
		System.out.println(Calculator.div(1, 2));
		System.out.println(Calculator.mul(1, 2));
		
		
		System.out.println();
		System.out.println("----------------Math class-------------------");
		/*
		<<The constructor Math() is not visible>>
		Math m=new Math();
		private이기 대문
		*/
		System.out.println(Math.round(3.15487));
		System.out.println(Math.max(2, 3));
		
		
	}

}
