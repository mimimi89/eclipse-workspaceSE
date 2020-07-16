package jiaokeshu_7_배열과ArrayList_array;

public class BookArray {

	public static void main(String[] args) {
		
		//한 권이 아니라 여러 권의 책을 관리하기 위해 배열 객체 생성
		Book[] library=new Book[5];
		
		/*
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
			//초기화 하지 않았기 때문에 null이 출력
		}
		*/
		
		int[] arr=new int[5];
		/*기본 자료형과 객체 자료형 배열의 차이
		 기본형의 경우, int 4byte 총 20byte가 할당되지만 객체로 이루어진 배열은 다름 
		 책 5권이 아니라 5개의 주소를 만든 것이라고 생각해야 함
		 */
		
		//초기화 작업
		library[0]=new Book("태백산맥", "조정래");
		library[1]=new Book("데미안", "헤르만 헤세");
		library[2]=new Book("어떻게 살 것인가", "유시민");
		library[3]=new Book("토지", "박경리");
		library[4]=new Book("어린왕자", "생텍쥐페리");
		
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
			//주소값을 출력, toString 재정의하거나 Book에서 만든 책정보를 보여주는 메쏘드 사용
			library[i].showBookInf();
			//return 값이 void임으로 sysout으로 출력할 수 없음
		}
		
		/*배열 복사하기
		 System.arraycopy(src, srcPos, dest, destPos, length);
							src: 복사할 배열
							srcPos: 복사할 첫위치
							dest: 대상 배열
							destPos: 붙여 넣을 첫 위치
							length: 복사할 요소 개수
		 */
		int[] array1= {10, 20, 30, 40, 50};
		int[] array2= {1, 2, 3, 4, 5};
		
		System.arraycopy(array1, 0, array2, 1, 4);
		//array1의 첫번째 인덱스부터 4개를 array2의 두번째 인덱스부터 붙여 넣기
		//1, 10, 20, 30, 40?
		System.out.println(array2);
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		
		
		

	}

}
