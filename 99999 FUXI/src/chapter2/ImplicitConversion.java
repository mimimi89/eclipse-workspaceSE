package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		
		byte bNum=10;
		int iNum=bNum;
		//작은 자료형의 값을 큰 자료형의 변수에 대입시킬 때는 묵시적(자동) 형 변환이 이루어진다.
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2=20;
		float fNum=iNum2;
		
		System.out.println(iNum2);
		System.out.println(fNum);
		//float는 실수형 자료형이기 때문에 20.0 출력

		double dNum;
		dNum=fNum+iNum2;
		System.out.println(dNum);
	}

}
