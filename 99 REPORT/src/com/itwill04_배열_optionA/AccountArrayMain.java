package com.itwill04_배열_optionA;

public class AccountArrayMain {

	public static void main(String[] args) {
		
		Account acc1=new Account(1111, "MIN", 89000, 5.9);
		//account 타입의 acc1 객체 생성
		
		Account[] accounts= {
			acc1,	
			new Account(2222, "AIM", 45000, 2.7),
			new Account(3333, "XIM", 34000, 3.7),
			new Account(4444, "ZIM", 12000, 1.7),
			new Account(5555, "SIM", 97000, 5.7),
			new Account(6666, "BIM", 88000, 3.7),
			new Account(7777, "CIM", 11000, 9.7),
			new Account(8888, "YIM", 21000, 8.7),
			new Account(9999, "QIM", 71000, 2.7)
		};
		//account 배열 타입의 주소값 8개를 가지고 있는 배열 객체 accounts 생성
		
		System.out.println();
		//은행의 총계좌수를 출력
		System.out.println("1.총계좌수: "+accounts.length+"개");
		
		System.out.println();
		//은행 계좌 전체 출력
		System.out.println("2.은행 계좌 전체 출력");
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			System.out.println(accounts[i]);
		}
		
		System.out.println();
		//은행 계좌 총잔고
		System.out.println("3.은행 계좌 총잔고");
		int totBalance=0;
		for (int i = 0; i < accounts.length; i++) {
			totBalance=totBalance+accounts[i].getBalance();
			
		}
		
		System.out.println(totBalance+"원");
		
		System.out.println();
		//3333 계좌 출력
		System.out.println("4.3333 계좌 출력");
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==3333) {
				accounts[i].print();
				break;
				
			}
		}
		
		System.out.println();
		//잔고 5000원 이상 계좌 출력
		System.out.println("5.잔고 5000원 이상 계좌 출력");
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getBalance()>=5000) {
				accounts[i].print();
			}
		}
		
		
		System.out.println();
		//이율 5.0 이상 계좌 출력
		System.out.println("6.이율 5.0 이상 계좌 출력");
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getIyul()>=5.0) {
				accounts[i].print();
			}
		}
		
		System.out.println();
		//6666 계좌에 5000원 입금
		System.out.println("7.6666계좌에 5000원 입금");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==6666) {
				accounts[i].print();
				accounts[i].deposit(5000);
				accounts[i].print();
				break;
			}
		}
		
		
		System.out.println();
		//8888 계좌에서 3000원 입금
		System.out.println("8.8888계좌에서 3000원 출금");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==8888) {
				accounts[i].print();
				accounts[i].withdraw(3000);
				accounts[i].print();
				break;
			}
		}
		
		System.out.println();
		//계좌를 잔고순으로 오름차순(큰숫자가 아래로) 정렬
		System.out.println("9. 잔고순으로 오름차순 정렬");
		for (int i = 0; i < accounts.length-1; i++) {	//4번만 돌리면 됨
			for (int j = 0; j < accounts.length-1; j++) {
				if(accounts[j].getBalance()>accounts[j+1].getBalance()) {
					Account temAccount=accounts[j];
					accounts[j]=accounts[j+1];
					accounts[j+1]=temAccount;
				}
				
			}
		}
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		
		System.out.println();
		//6666 계좌 이율을 9.0으로 변경 
		System.out.println("10. 6666 계좌 이율을 9.0으로 변경");		
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==6666) {
				accounts[i].print();
				accounts[i].setIyul(9.0);
				accounts[i].print();
			} 
		}
		
		
	}
		
		

}


