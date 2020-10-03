package array;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] array1= {10, 20, 30, 40, 50};
		int[] array2= {1, 2, 3, 4, 5};
		
		//배열 복사
		System.arraycopy(array1, 0, array2, 1, 4);
		for (int i= 0;  i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		// 1, 10, 20, 30, 40 출력
		//array1의 0번째 인덱스부터 4개를 array2 1번째  인덱스부터 붙여넣기
		
		

	}

}
