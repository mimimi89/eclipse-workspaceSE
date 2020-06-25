package lang;

public class StringMain {

	public static void main(String[] args) {
		
		/*
		 String 객체의 명시적 생성
		 */

		String name1=new String("kim");
		String name2=new String("kim");
		boolean isEqual=name1==name2;
		System.out.println("name1과 name2의 주소값이 동일하지않다: "+isEqual);
		
		
		/*
		 String 객체의 암시적 생성
		 -" "(쌍따옴표)를 사용
		 */
		
		String str1="자바";
		String str2="자바";
		String str3=new String("자바");
		if(str1==str2) {
			System.out.println("str1과 str2의 주소가 동일하다.");
		}
		
		if(str1!=str3) {
			System.out.println("str1과 str3의 주소가 동일하지 않다.");
		}
		
		if("자바"=="자바") {
			System.out.println("\"자바\"와 \"자바\"의 주소가 동일하다.");
		}
		
		System.out.println("---------String 객체의 문자열 내용 비교-----------");
		
		/*
		
		<< String >>
		    public boolean equals(Object anObject)
		    	- Compares this string to the specified object. 
		    	-The result is true if and only if the argument is not null 
		    	 and is a String object that 
		    	 represents the same sequence of characters as this object.
		    	 
		    Overrides:
		    	equals in class Object
		    	 
		 */
		
		if(str1.equals(str2)) {
			System.out.println("str1, str2의 문자열이 동일하다.");
		}
		
		if(str1.equals(str3)) {
			System.out.println("str1, str3의 문자열이 동일하다.");
		}
		
		if(str1.equals("자바")) {
			System.out.println("str1, \"자바\"의 문자열이 동일하다.");
		}
		
		if("자바".equals("자바")) {
			System.out.println("\"자바\"와 \"자바\"의 문자열이 동일하다.");
		}
		
		System.out.println("-----------compareTo()----------------");
		char c1='홍';
		char c2='구';
		if(c1>c2) {
			System.out.println((int)c1+">"+(int)c2);
		}
		
		if(c1-c2>0) {
			System.out.println((int)(c1-c2)+" > 0");
		}
		
		String irum1="홍길동";
		String irum2="김길동";
		int r=irum1.compareTo(irum2);
		System.out.println("\"홍길동\".compareTo(\"김길동\"): "+r);
		//결과가 양수면 오름차순, 결과가 음수면 내림차순
		
		r=irum2.compareTo(irum1);
		System.out.println("\"김길동\".compareTo(\"홍길동\"): "+r);
		//결과가 양수면 오름차순, 결과가 음수면 내림차순
		
		
		System.out.println("KIM".compareTo("LEE"));
		
		
		
		
	}

}
