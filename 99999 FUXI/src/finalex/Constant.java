package finalex;

public class Constant {
	int num=10;
	final int NUM=100;
	//변수에 final 선언하면 상수
	
	public static void main(String[] args) {
		Constant cons=new Constant();
		cons.num=50;
		//cons.NUM=200;
		//상수에 값을 대입하면 오류 발생
		//The final field Constant.NUM cannot be assigned
		//final 변수 Constant.NUM는 할당될 수 없음
		
		System.out.println(cons.num);
		System.out.println(cons.NUM);
	}
	

}
