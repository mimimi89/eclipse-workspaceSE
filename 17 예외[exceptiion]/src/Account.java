///

public class Account {


	
	private int no;      	
	private String owner;	
	private int balance;	
	private double iyul;	

	
	
	public Account() {
	}
	/**
	 * 인자로초기화된 계좌객체생성
	 * @param no  계좌번호
	 * @param owner 계좌주
	 * @param balance 계좌잔고
	 * @param iyul 계좌이율
	 */
	public Account(int no,String owner,int balance,double iyul) {
		this.setAccountData(no, owner, balance, iyul);
	}
	


	public void deposit(int m) {
		//정수형 인자를 넣고, deposit 메쏘드 사용하면
		this.balance=this.balance+m;
		//잔고가 늘어나는 
	}


	
	public boolean withdraw1(int m) {
		//참거짓을 반환하는 출금메쏘드
		//정수형 인자를 넣고, withdraw1 메쏘드를 사용하면 
		boolean isSuccess=false;
		//isSuccess 변수를 거짓으로 초기화하고
		if(this.balance - m < 0) {
			//잔고가 0보다 적으면
			isSuccess=false;
			//거짓 반환
		}else {
			//아니라면(0과 같거나 많다면)
			isSuccess=true;
			//참 반환하고
			this.balance= this.balance-m;
			//잔고가 줄어드는
		}
		return isSuccess;
		//isSuccess 반환
	}
	
	
	public void withdraw(int m) throws InsufficientBalanceException{
		if(this.balance - m < 0) {
			throw new InsufficientBalanceException(this.owner+" 님 잔고가 부족해요");
		}
		this.balance=this.balance-m;
	}


	
	public static void headerPrint() {
		System.out.println("-------------------");
		System.out.printf("%s %s %s %s %n","번호","이름","잔고","이율");
		System.out.println("-------------------");
	}


	
	public void print() {
		System.out.printf("%d %s %d %.1f %n",this.no,this.owner,this.balance,this.iyul);
	}


	
	public void setAccountData(int no,String owner,int balance,double iyul) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
	}


	
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












