package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class IntArrayTest {

	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4, 5};
		
		int sumVal=Arrays.stream(arr).sum();
		int count=(int)Arrays.stream(arr).count();
		OptionalInt max=Arrays.stream(arr).max();
		OptionalInt min=Arrays.stream(arr).min();
		OptionalDouble avg=Arrays.stream(arr).average();
		
		System.out.println(sumVal);
		System.out.println(count);
		System.out.println(max);
		System.out.println(min);
		System.out.println(avg);
		
		
		
		

	}

}
