package jiaokeshu_11_기본클래스_classex;

public class Person {
	
	/*
	 * Class.forName("클래스이름")
	 * 클래스 이름을 스트링으로 가져서 메모리에 올리는(동적로딩) 메쏘드
	 */
	
	String name;
	int age;
	
	public Person(){
		
	}
	
	public Person(String name) {
		this.name=name;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
	

}
