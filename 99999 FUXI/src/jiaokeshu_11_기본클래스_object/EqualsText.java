package jiaokeshu_11_기본클래스_object;

class Student{
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName){
		this.studentID=studentID;
		this.studentName=studentName;
	}
	
	@Override
	public boolean equals(Object obj) {
		//원형: 인자(객체)와 주소값을 비교해서 참/거짓을 반환
		if(obj instanceof Student) {	//참이면 괄호 안의 내용
			Student st=(Student) obj;
			if(this.studentID==st.studentID) {
				return true;
			}else {
				return false;
			}
		}
		return false;
		//거짓(인자로 들어온 객체가 Student 클래스로 생성한 것이 아니면)이면 false 반환
	}
	
	
	
	
}

public class EqualsText {

	public static void main(String[] args) {

		String str1=new String("test");
		String str2=new String("test");
		
		System.out.println(str1==str2);
		//두 개의 등호는 물리적인 상태, str1과 str2가 같은 주소인지 비교하는 것
		//두 객체의 힙메모리 어드레스가 다르기 때문에 false 출력됨
		System.out.println(str1.equals(str2));
		//논리적인 상태, str1과 str2의 문자열이 같은지 비교하는 메쏘드: equals()
		//같은 문자열을 가지고 있기 때문에 true 출력됨
		
		Student st1=new Student(10001, "Tomas");
		Student st2=new Student(10001, "Tomas");
		//두 개의 객체 생성
		
		System.out.println(st1==st2);
		//두 객체의 주소값 비교 --> false
		System.out.println(st1.equals(st2));
		//같은 내용을 가지고 있는지 비교하기 위해서는 오버라이딩이 필요
		//equals 재정의할 때, hashcode 반드시 같이 재정의
		
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		//재정의 되어 있기 때문에 같은 값이 나옴
		//원래 값을 알고 싶으면 system.identityhashcode() 사용
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		
		
		
	}

}
