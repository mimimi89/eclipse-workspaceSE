package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList=new MemberArrayList();
		
		Member memberLee=new Member(1001, "이지원");
		Member memberSon=new Member(1002, "손민국");
		Member memberPark=new Member(1003, "박서훤");
		Member memberHong=new Member(1004, "홍길동");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();
		/*
		이지원 회원님의 아이디는 1001입니다.
		손민국 회원님의 아이디는 1002입니다.
		박서훤 회원님의 아이디는 1003입니다.
		홍길동 회원님의 아이디는 1004입니다.
		 */
		memberArrayList.removeMember(1003);
		memberArrayList.showAllMember();
		/*
		이지원 회원님의 아이디는 1001입니다.
		손민국 회원님의 아이디는 1002입니다.
		홍길동 회원님의 아이디는 1004입니다.
		 */
		memberArrayList.removeMember(memberSon.getMemberId());
		memberArrayList.showAllMember();
		/*
		이지원 회원님의 아이디는 1001입니다.
		홍길동 회원님의 아이디는 1004입니다.
		 */
		
		
		
		
		

	}

}
