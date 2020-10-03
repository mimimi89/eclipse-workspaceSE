package operator;

public class OperationEx3 {

	public static void main(String[] args) {
		int num1=10;
		int i=2;
		
		boolean value=((num1=num1+10)<10)&&((i=i+2)<10);
		System.out.println(value);//거짓
		System.out.println(num1);//20
		System.out.println(i);//4가 아니고 2인 이유, 논리 곱에서 앞 항이 거짓이면 뒷 항이 실행되지 않아 i 값이 그대로 2

		value=((num1=num1+10)>10)||((i=i+2)<10);
		System.out.println(value);//참
		System.out.println(num1);//30
		System.out.println(i);//6가 아니고 2인 이유, 논리 합에서 앞 항이 참이면 뒷 항이 실행되지 않아 i 값이 그대로 2
	}

}
