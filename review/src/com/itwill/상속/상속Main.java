package com.itwill.상속;
//틀의 재사용을 위해서
//상속, 캐스팅, 재정의, 추상클래스는 함께

public class 상속Main {

	public static void main(String[] args) {
		//상위 타입으로 형변환은 유지보수, 확장성이 커짐
		Parent[] pArray= {
			new ChildA(),	
			new ChildA(),	
			new ChildA(),	
			new ChildB(),	
			new ChildB(),	
			new ChildC(),	
			new ChildC(),	
			new ChildC(),	
			new ChildD(),	
			new ChildD(),	
			new ChildD(),	
				
		};
		
		for (int i = 0; i < pArray.length; i++) {
			pArray[i].method1();
			pArray[i].method2();
			
		}
		
		
		
		
		
		

	}

}
