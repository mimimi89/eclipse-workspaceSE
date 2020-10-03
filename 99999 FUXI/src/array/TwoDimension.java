package array;

public class TwoDimension {

	public static void main(String[] args) {
		int[][] arr= {{1, 2, 3}, {4, 5, 6}};
		//integer 타입의 다차원 배열
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}

	}

}
