///

public class MemberMethodThis {

	//멤버변수
	int memberField1;		
	char memberField2;
	double memberField3;
	
	void setMemberMethodThis(int memberField1, char memberField2, double memberField3) {
		this.memberField1=memberField1;
		this.memberField2=memberField2;
		this.memberField3=memberField3;
		
		
	}
	
	void setMemberField1(int memberField1) {
		this.memberField1=memberField1;
		
		
	}//인자 중 하나만 변경할 때
	
	void print() {
		
		//this : 
		//		self 참조변수
		//		print 메쏘드를 가지고 있는 객체의 주소값
		//		this는 생략 가능
		
		System.out.println(this.memberField1);
		System.out.println(this.memberField2);
		System.out.println(this.memberField3);
		
	}
	
	
	void setMemberField1() {
		
	}
	
	
	
}
