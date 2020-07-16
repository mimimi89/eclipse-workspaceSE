package jiaokeshu_7_배열과ArrayList_array;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		char[] alphabets=new char[26];
		//26개의 문자를 담을 수 있는 배열 객체 'alphabets'
		//알파벳도 내부적으로는 모두 정수
		
		char ch='A';
		//문자형 변수 선언 및 초기화
		
		for (int i = 0; i < alphabets.length; i++) {
			alphabets[i]=ch;
			ch++;
			System.out.println(alphabets[i]);
		}
		
		/* 위와 동일한 값을 산출하는 코드
		for (int i = 0; i < alphabets.length; i++, ch++) {
			alphabets[i]=ch;
		}
		 */
		
		System.out.println(alphabets);
		
		//이게 불편하니까 나중에 String을 쓰게 됨
		
		
		
		

	}

}
