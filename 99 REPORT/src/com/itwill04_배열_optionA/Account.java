package com.itwill04_배열_optionA;

public class Account {
	//속성
	private int no;
	private String owner;
	private int balance;
	private double iyul;
	
	//생성자
	public Account() {
		
	}
	
	public Account(int no, String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.no+"\t"+this.owner+"\t"+this.balance+"\t"+this.iyul;
	}
	
	//

	public void setAccountData(int no,String owner,int balance,double iyul) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul = iyul;
	}
	
	//입금
	public void deposit(int m) {
		//this.balance+=m;
		this.balance=this.balance+m;
	}
	
	//출금
	public void withdraw(int m) {
		this.balance=this.balance-m;
	}
	
	//header print
	public static void headerPrint() {
		System.out.println("-------------------------");
		System.out.printf("%s %s %s %s%n","번호","계좌주","잔고","이율");
		System.out.println("-------------------------");
	}

	//출력
	public void print() {
		
		System.out.printf("%d %6s %6d %4.1f%n",this.no,this.owner,this.balance,this.iyul);
	}

	//getter, setter
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
