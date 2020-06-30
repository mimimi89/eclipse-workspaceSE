package com.itwill03_포함;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember mb1=new BookMember(1, "김가영", "010-5279-0000");
		BookMember mb2=new BookMember(2, "김나영", "010-5202-0000");
		BookMember mb3=new BookMember(3, "김다영", "010-3705-0000");
		
		
		/*
		 * 책객체생성
		 */
		Book b1=new Book(1111, "페스트", "소설", "알베르 카뮈 대표작");
		Book b2=new Book(2222, "코스모스", "과학", "천문학");
		Book b3=new Book(3333, "아내를 모자로 착각한 남자", "인문학", "정신질환 환자");
		Book b4=new Book(4444, "당신이 옳다", "인문학", "적정심리학");
		Book b5=new Book(5555, "지리의 힘", "사회과학", "지리적 특성");
		Book b6=new Book(6666, "하버드 상위 1퍼센트의 비밀", "자기계발", "부정적 신호 차단");
		
		
		/*
		 * 회원이 책 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 */
		mb1.setBook(b2);
		mb2.setBook(b5);
		mb3.setBook(b3);
		
		
		/*
		 * 회원정보출력(회원정보와 회원이빌린들책정보출력)
		 */
		mb1.bmPrint();
		mb2.bmPrint();
		mb3.bmPrint();
		
		
	}
}
