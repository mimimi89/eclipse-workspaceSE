///

public class Account {
	
	//멤버필드
	private int no;			
	private String owner; 	
	private int balance; 	
	private double iyul;	
	
	//생성자
	public Account(int no, String owner, int balance, double iyul) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
	}
	
	
	//인스턴스 메쏘드
	
	//계좌 data set
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
	
	//헤더 프린트
	public static void headerPrint() {		
		System.out.println("----------------------------------------");
		System.out.printf("%4s %4s %6s %8s\n", "계좌번호", "이름", "잔고", "이율");
		System.out.println("----------------------------------------");
		
	}
	
	//계좌 정보 출력
	public void print() {
		
		System.out.printf(" %d %8s %9d원 %8.1f %n", this.no, this.owner, this.balance, this.iyul);

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
