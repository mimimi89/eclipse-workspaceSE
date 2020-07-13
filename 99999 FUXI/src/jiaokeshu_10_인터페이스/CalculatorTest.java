package jiaokeshu_10_인터페이스;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=5;
		
		CompleteCalc calc=new CompleteCalc();
		
		
		System.out.println("더한 값: "+calc.add(num1, num2));
		System.out.println("뺀 값: "+calc.substract(num1, num2));
		System.out.println("곱한 값: "+calc.times(num1, num2));
		System.out.println("나눈 값: "+calc.divide(num1, num2));
		
		calc.showInfo();
		
		calc.description();
		
		int[] arr= {1, 2, 3, 4, 5};
		System.out.println(Calc.total(arr));
	

	}

}
