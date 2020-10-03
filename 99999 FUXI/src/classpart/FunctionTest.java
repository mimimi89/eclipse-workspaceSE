package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		
		
		int a=add(num1, num2);
		System.out.println(num1+"+"+num2+"="+a+"입니다.");
		
		a=subtraction(num1, num2);
		System.out.println(num1+"-"+num2+"="+a+"입니다.");
		
		a=multiplication(num1, num2);
		System.out.println(num1+"*"+num2+"="+a+"입니다.");
		
		double b=division(num1, num2);
		System.out.println(num1+"/"+num2+"="+b+"입니다.");
		
		
	}

	public static int add(int n1, int n2) {
		int result=n1+n2;
		return result;
	}

	public static int subtraction(int n1, int n2) {
		int result=n1-n2;
		return result;
	}
	
	public static int multiplication(int n1, int n2) {
		int result=n1*n2;
		return result;
	}
	
	public static double division(int n1, int n2) {
		double result=n1/n2;
		return result;
	}
	
}
