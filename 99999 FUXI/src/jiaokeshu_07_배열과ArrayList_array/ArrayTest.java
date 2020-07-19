package jiaokeshu_07_배열과ArrayList_array;

public class ArrayTest {

	public static void main(String[] args) {
		/*
		 * 	선언 :
		 * 		int[] numbers =new int[10];
		 * 
		 * 	초기화 : 
		 * 		괄호 안에 숫자를 넣으면 안 된다.
		 * 
		 *  선언과 초기화를 동시에
		 *  int[] numbers=new int[] {0, 1, 2};
		 *	int[] numbers = {0, 1, 2};
		 *
		 *  int 배열 객체 numbers의 길이를 출력하는 방법
		 *	System.out.println(numbers.length);
		 */
		
		int[] numbers=new int[3];
		numbers[0]=1;
		numbers[1]=2;
		numbers[2]=3;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("////////////////////////////////////////////");
		
		int[] studentIDs=new int[10];
		
		/*
		 * studentID 객체(각 4byte)가 10개(총 40byte)가 들어가는 배열객체 생성
		 * 초기화 하지 않을 경우에는 int=0, double=0.0, 객체는 null로 초기화 됨
		 */
		
		for (int i = 0; i < studentIDs.length; i++) {
			System.out.println(studentIDs[i]);
			
		}

		System.out.println("////////////////////////////////////////////");
		
		
		
		
		
		
	}

}
