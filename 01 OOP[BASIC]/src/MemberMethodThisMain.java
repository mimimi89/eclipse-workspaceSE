///

public class MemberMethodThisMain {

	public static void main(String[] args) {
		
		MemberMethodThis mmt1 = new MemberMethodThis();		//MemberMethodThis 타입의 객체 생성, 객체 이름 mmt1(주소값, 참조변수)
		/*
		mmt1.memberField1=1212122;
		mmt1.memberField2='김';
		mmt1.memberField3=3.14159;
		-------------
		mmt1.setMemberMethodThis(1212122, '김', 3.14159);
		
		:동일한 작업
		*/
		mmt1.setMemberMethodThis(1212122, '김', 3.14159);	//mmt1 객체는 1212122, '김', 3.14159를 멤버변수로 갖는다
		mmt1.setMemberField1(77777);						//setter 메쏘드를 통해 1212122를 77777로 변경 가능
		System.out.println("mmt1주소-->"+mmt1);
		mmt1.print();										//mmt1 객체는 77777, '김', 3.14159를 멤버변수로 갖는다
		
		
		System.out.println();
		
		
		MemberMethodThis mmt2 = new MemberMethodThis();
		mmt2.memberField1=423;
		mmt2.memberField2='꿈';
		mmt2.memberField3=0.23584;
		
		//mmt2.setMemberMethodThis(423, '꿈', 0.23584);
		
		System.out.println("mmt2주소-->"+mmt2);
		mmt2.print();
		
		
		
		

	}

}
