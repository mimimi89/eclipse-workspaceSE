package jiaokeshu_11_기본클래스_object;

class Book{
	String title;
	String author;
	
	Book(String title, String author){
		this.title=title;
		this.author=author;
	}

	@Override
	public String toString() {
		return title+","+author;
	}
	
	
}

public class ToStringEx {

	public static void main(String[] args) {
		
		Book book=new Book("두잇자바","은종님");
		System.out.println(book);
		//객체 생성 후 출력
		//jiaokeshu_11_기본클래스_object.Book@5caf905d
		//패키지 포함 클래스명+@+16진수로 표기된 해시코드
		//책의 이름과 저자명이 나오게 하고 싶으면 재정의
		//13항에서 정의 후, 출력가능
		
		
		String str=new String("test");
		System.out.println(str);
		//객체 생성 후 출력
		//test
		//왜?
		
		
		

	}

}
