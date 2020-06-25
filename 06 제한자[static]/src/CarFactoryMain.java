//

public class CarFactoryMain {

	public static void main(String[] args) {
		
		Car.count=100;
		
		//차를 만들 때마다 객체를 하나씩 추가
		Car c1=new Car(1, "sm3", "red");
		System.out.println("차량생산대수: "+Car.count+"대");
		Car c2=new Car(2, "sm4", "green");
		System.out.println("차량생산대수: "+Car.count+"대");
		Car c3=new Car(3, "sm5", "blue");
		System.out.println("차량생산대수: "+Car.count+"대");
		
		
		
		
		
		

	}

}
