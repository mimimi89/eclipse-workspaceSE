package jiaokeshu_7_배열과ArrayList_array;

public class ArrayTest2 {
	
	public static void main(String[] args) {
		
		double[] num=new double[5];
		
		num[0]=10.0;
		num[1]=20.0;
		num[2]=30.0;
		//5개가 담기는 배열 객체
		//3, 4번 인덱스는 초기화가 안 되어 있음으로 0.0으로 초기화 되어 있음
		
		
		double total=0.0;
		//배열 객체의 합을 구하고 싶을 때, 먼저 변수 선언과 초기화
		
		for (int i = 0; i < num.length; i++) {
			total+=num[i];
			//total 값에 오른쪽 부분을 더하고 더하고
		}
		
		System.out.println(total);
		
	}
	

}
