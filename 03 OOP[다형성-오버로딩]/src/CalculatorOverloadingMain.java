///
public class CalculatorOverloadingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal=new Calculator();
		//Calculator 타입의 객체 생성, 객체 이름 cal
		cal.add(); 	
		//4 반환
		cal.add(1);
		//3 반환
		cal.add(1, 2);
		//3 반환
		cal.add(1, 2, 3);
		//6 반환
		

	}

}
