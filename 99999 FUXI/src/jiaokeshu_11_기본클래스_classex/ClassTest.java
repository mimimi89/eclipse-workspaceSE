package jiaokeshu_11_기본클래스_classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

		
		/*
		 * Class.forName("클래스이름")
		 * 클래스 이름을 스트링으로 가져서 메모리에 올리는(동적로딩) 메쏘드
		 */
		
		Person person=new Person();
		//person 객체 생성
		
		/*
		 * Class class를 가지고 오는 세 가지 방법 
		 * 1. 인스턴스가 생성되어 있으면 getClass(Object의 메쏘드) 사용
		 * 2. 클래스 이름.class 사용
		 * 3. forName 사용
		 */
		Class pClass1=person.getClass();
		System.out.println(pClass1.getName());
		
		Class pClass2=Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3=Class.forName("jiaokeshu_11_기본클래스_classex.Person");
		System.out.println(pClass3.getName());
		//38:40
		
		
		
		
		
	}

}
