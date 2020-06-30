package com.itwill04_array_optionA;

public class AccountArrayMain {

	public static void main(String[] args) {
		Account acc1=new Account(1111, "MIN", 89000, 5.9);	//Account 타입의 객체를 생성자 메쏘드를 통해 생성
		
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
		};													//Account 타입의 객체를 9개 담을 수 있는 Account 배열 객체 생성
		
		System.out.println();
		System.out.print("1.은행총계좌수:	"+accounts.length+"개"+"\n");
		
		System.out.println("-------------------------");
		System.out.println();
		
		
		System.out.println("2.은행계좌전체출력");
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		
		System.out.println("-------------------------");
		System.out.println();
		
		System.out.println("3.은행계좌들 총잔고:");
		
		int totBalance=0;
		for (int i = 0; i < accounts.length; i++) {
			totBalance=accounts[i].getBalance()+totBalance;
			//totBalance+= accounts[i].getBalance();
		}
		
		System.out.println("-------------------------");
		System.out.println(totBalance+"원");//for 문 안에 기술하면 돌 때마다 출력됨
		
		System.out.println("-------------------------");
		System.out.println();
	
		System.out.println("4.은행계좌들중에서 계좌번호 3333번계좌한개찾아 출력 ");
		System.out.println("-------------------------");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==3333) {
				accounts[i].print();
				break;
			}
			
		}
		System.out.println("-------------------------");
		System.out.println();
		
		
		
		System.out.println("5.은행계좌들중에서 계좌잔고 50000원이상 계좌들찾아 출력 ");
		System.out.println("6.은행계좌들중에서 계좌이율 5.0이상 계좌들찾아 출력 ");
		
		System.out.println("7.6666번계좌 5000원 입금");
		
		System.out.println("8.8888번계좌 3000원 출금");
		
		
		System.out.println("9.계좌를 잔고순으로 오름(내림)차순정렬");
		
		
		System.out.println("10.6666계좌의 이율을 9.0로변경");
		
		
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();	
		}
		
	}

}










