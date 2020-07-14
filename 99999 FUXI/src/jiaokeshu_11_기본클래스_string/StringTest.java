package jiaokeshu_11_기본클래스_string;

public class StringTest {

	public static void main(String[] args) {
		
		String str1=new String("abc");
		String str2=new String("abc");
		
		System.out.println(str1==str2);
		//new로 생성하면 힙메모리에 서로 다른 주소지를 받음
		
		String str3="abc";
		String str4="abc";

		System.out.println(str3==str4);
		//직접 대입하면 상수풀에 있는 동일한 문자열 "abc"를 가르킴
		
		String str5=new String("java");
		String str6=new String("android");
		
		System.out.println(System.identityHashCode(str5));
		
		str5=str5.concat(","+str6);
		//concat 문자열 연결, 합치는 메쏘드
		System.out.println(str5);
		
		System.out.println(System.identityHashCode(str5));
		
		/*
		 * 문자열을 계속 연결해서 사용하게 되면 메모리 사용에 좋지 않으므로
		 * StringBuilder(단일쓰레드일 때)나 StringBuffer(멀티쓰레드일 때)를 사용한다.
		 * String 클래스는 아니므로 반환할 때는 toString으로 반환
		 */
		
	}

}
