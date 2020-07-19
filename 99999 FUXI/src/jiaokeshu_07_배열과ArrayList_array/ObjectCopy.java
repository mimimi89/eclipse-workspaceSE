package jiaokeshu_07_배열과ArrayList_array;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] bookArray1=new Book[3];
		Book[] bookArray2=new Book[3];
		
		bookArray1[0]=new Book("태백산맥1", "조정래");
		bookArray1[1]=new Book("태백산맥2", "조정래");
		bookArray1[2]=new Book("태백산맥3", "조정래");
		
		bookArray2[0]=new Book();
		bookArray2[1]=new Book();
		bookArray2[2]=new Book();
		
		/*
		 System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		 1의 첫번째 인덱스부터 3개를 2에 복사
		 
		 for (int i = 0; i < bookArray2.length; i++) {
			System.out.println(bookArray2[i]);
			bookArray2[i].showBookInf();
		}
		
		값이 복사된 것이 아니라 주소만 복사된 것-->얕은 복사
			
		 */
		for (int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		//깊은 복사를 하는 방법 이해 안 되무ㅠㅠㅠ
		
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		for (int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInf();
			
		}
		
		System.out.println("////////////////////////////////////");
		
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInf();
			
		}
		
		System.out.println("////////////////////////////////////");
		
		String[] strArr= {"Java", "Android", "C"};
		
		for (String string : strArr) {
			System.out.println(string);
		}
		//향상된 for문
		
		/*
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		*/
		
	}

}
