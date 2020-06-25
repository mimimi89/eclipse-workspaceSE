///

public class MemberField {

	//멤버변수 선언
	
	
	//0. 멤버변수(필드) 생성 후 초기화
	//(초기화가 이루어지지 않았다면 자동 초기화)
	//int: 0으로 초기화되어 있음
	//double: 0.0으로 초기화되어 있음
	//char: \u0000(문자없다)으로 초기화되어 있음
	//boolean: false로 초기화되어 있음
	//참조변수: null(주소없다)로 초기화되어 있음
	
	//1. 멤버변수 생성 시 초기화도 가능
	
	public int member1;
	public double member2;
	public char member3;
	public boolean member4;
	public Account member5;
	
	public MemberField() {
		this.member1=9999;
		this.member2=9.9999;
		this.member3='A';
		this.member4=true;
		this.member5=new Account(1223,"SONG", 90000, 3.8);
		
	}//멤버필드 메소드
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//클래스
