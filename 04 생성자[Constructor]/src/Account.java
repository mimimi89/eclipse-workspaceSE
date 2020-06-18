
public class Account {
	
	//멤버필드, 멤버변수, 인스턴스변수
	
	private int no;			//계좌번호
	private String owner; 	//계좌주
	private int balance; 	//잔고
	private double iyul;	//이율
	
	//멤버 메쏘드, 인스턴스 메쏘드
	
	//계좌 데이타를 set
	public void setAccountData(int no, String owner, int balance, double iyul) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
	}
	
	//입금
	public void deposit(int m) {
		this.balance=this.balance+m;
	}
	
	//출금
	public void withdraw(int m) {
		this.balance=this.balance-m;
	}
	
	//계좌 정보 출력
	public void print() {
		System.out.println();
		System.out.printf("%8s %5s %5s %5s %n", "계좌번호", "계좌주", "잔고", "이율");
		System.out.println("-------------------------------------------");
		System.out.printf("%10d %8s %9d원 %5.1f %n", this.no, this.owner, this.balance, this.iyul);
		System.out.println();
	}

	//getter, setter 메쏘드
	public int getNo() {
		return no;
	}

	public String getOwner() {
		return owner;
	}

	public int getBalance() {
		return balance;
	}

	public double getIyul() {
		return iyul;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setIyul(double iyul) {
		this.iyul = iyul;
	}



	
	
	
}
