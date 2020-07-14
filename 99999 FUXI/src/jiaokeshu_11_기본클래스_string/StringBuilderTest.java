package jiaokeshu_11_기본클래스_string;

public class StringBuilderTest {

	public static void main(String[] args) {
		/*
		 * 문자열을 계속 연결해서 사용하게 되면 메모리 사용에 좋지 않으므로
		 * StringBuilder(단일쓰레드일 때)나 StringBuffer(멀티쓰레드일 때)를 사용한다.
		 * String 클래스는 아니므로 반환할 때는 toString으로 반환
		 */
		
		String str1=new String("java");
		
		System.out.println(System.identityHashCode(str1));
		
		StringBuilder buffer=new StringBuilder(str1);
		System.out.println(System.identityHashCode(str1));
		
		buffer.append("add");
		buffer.append("android");
		System.out.println(System.identityHashCode(str1));
		//문자열을 추가해도 해시코드가 달라지지 않음
		
		String str2=buffer.toString();
		System.out.println(str2);
		
		
		/*
		 * Wrapper class
		 * autoboxing(오토박싱: 기본형을 객체로)과 unboxing(언박싱: 객체를 기본형으로)
		 */
		
		Integer i=new Integer(100);
		// new를 사용하지 않고 바로 숫자를 대입시키면 된다.
		
		
		
		
		

	}

}
