package com.itwill04_array;


/*
 * 로또번호 6개 1set 를 가지고 있는 객체
 */
public class Lotto {
	private int[] noArray;
	//int 배열 객체 noArray
	
	public Lotto() {
		//Lotto 생성자 메쏘드는
		//6개를 담을 수 있는 배열 객체도 있고, 
		//45개 중 무작위로 고를 수 있는 메쏘드도 있음
		noArray=new int[6];
		this.generateNumber();
		
	}
	
	
	private void generateNumber() {
		//인스턴스 메쏘드
		for (int i = 0; i < noArray.length; i++) {
			noArray[i] = (int)(Math.random()*45)+1;
			
			//noArray[i]에는 정수형 리터럴이 담겨 있고
			//1부터 45까지의 수에서 하나, Math class에 있는 random 메쏘드 사용
			//random은 리턴타입이 double. 그래서 int로 형변환(캐스팅)
			
			/*
			public static double random() {
				return RandomNumberGeneratorHolder.randomNumberGenerator.nextDouble();
			    }
			*/
			
		}
	}
	
	public void print() {
		for (int i = 0; i < noArray.length; i++) {
			System.out.print(noArray[i]+" ");
		}
		System.out.println();
	}
}
