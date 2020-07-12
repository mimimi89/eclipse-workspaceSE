package shu.인터페이스.계산기;

public class CompleteCalc extends Calculator{
	
	static int total(int[] arr) {
		int total=0;
		
		for(int i:arr) {
			total +=i;
		}
		return total;
	}
	
	@Override
	public int times(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2!=0)
			return num1/num2;
		else
			return Calc.ERROR;
			
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}
	

}
