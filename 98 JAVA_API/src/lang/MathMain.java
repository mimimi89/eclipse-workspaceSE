package lang;

public class MathMain {

	public static void main(String[] args) {
		/*
		 Math 클래스
		 -수학 함수를 가지고 있는 클래스
		 -모든 메소드가 정적(static)메소드이다.
		 -객체 생성이 불가능(생성자의 접근제한자가 private)
		 */
		
		//Math m=new Math();
		
		int r=Math.abs(-3468732);
		System.out.println(r);
		System.out.println(Math.max(56, 89));
		System.out.println(Math.min(56, 89));
		System.out.println(Math.round(33.5555));	//반올림
		System.out.println(Math.round(33.5555*10)/10.0);	//반올림
		System.out.println(Math.pow(2, 10));	//2의 10승
		System.out.println(Math.sqrt(2));	//루트
		
		/*
		public static double random()
		-Returns a double value with a positive sign, 
		greater than or equal to 0.0 and less than 1.0. 
		*/
		
		System.out.println(Math.random());
		System.out.println("1~10 사이의 정수 랜덤 생성");
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		
		System.out.println("1~45 사이의 정수 랜덤 생성");
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		
		
		

	}

}
