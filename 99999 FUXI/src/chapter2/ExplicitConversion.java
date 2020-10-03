package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		
		double dNum1=1.2;
		float fNum2=0.9F;
		
		int iNum3=(int)dNum1+(int)fNum2;//1
		int iNum4=(int)(dNum1+fNum2);//2
		
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		int no1=10;
		double no2=2.0;
		
		int no3=no1+(int)no2;
		System.out.println(no3);
		

	}

}
