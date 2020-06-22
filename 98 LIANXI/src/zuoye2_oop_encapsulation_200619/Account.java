package zuoye2_oop_encapsulation_200619;

public class Account {		//계좌관리 객체를 만들기 위한 클래쓰

	
	
	//멤버변수: 계좌번호, 계좌주, 잔고, 이율
	
	//멤버메쏘드: 계좌데이터, 입금, 출금, 계좌정보출력 
	public void deposit(int m) {
		this.balance=this.balance+m;
	}
	/*
	 * 출금
	 */
	public void withdraw(int m) {
		this.balance= this.balance-m;
	}
	/*
	 * 계좌정보출력
	 */
	public void print() {
		System.out.printf("%d %s %d %.1f %n",this.no,this.owner,this.balance,this.iyul);
	}
	
	/*
	 * 계좌데이타를 set
	 */
	public void setAccountData(int no,String owner,int balance,double iyul) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
	}
	/******getter,setter메쏘드******/
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getIyul() {
		return iyul;
	}
	public void setIyul(double iyul) {
		this.iyul = iyul;
	}
	
	
	
}
