package array;

public class ArrayTest {

	public static void main(String[] args) {
		int[] num=new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum=0;
		
		for (int i = 0; i < num.length; i++) {
			System.out.println("num["+i+"]="+num[i]);
			
		}
		
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		
		System.out.println("1부터 10까지의 합: "+sum);

	}

}
