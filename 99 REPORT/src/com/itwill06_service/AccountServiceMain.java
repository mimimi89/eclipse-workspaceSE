package com.itwill06_service;


public class AccountServiceMain {

	public static void main(String[] args) {
		//AccountService 타입의 객체 생성
		AccountService accountService=new AccountService();
		
		System.out.println("0.AccountService야 Account객체데이타여러개 인자로줄께 Account추가해줘(번호중복체크,배열사이즈증가)");
		accountService.addAccount(1000,"THOU",85000,0.3);
		accountService.print();
		System.out.println();
		
		System.out.println("0.AccountService야 Account객체한개 인자로줄께 Account추가해줘(번호중복체크,배열사이즈증가)");
		Account newAccount=new Account(3000, "THREE", 33000, 3.3);
		
		accountService.addAccount(newAccount);
		accountService.print();
		System.out.println();
		
		
		System.out.println("1.AccountService야 은행계좌들 총계좌수출력해줘");
		accountService.totAccountNumberPrint();	//
		System.out.println();
		
		
		System.out.println("2.AccountService야 은행계좌들 전체출력해줘");
		accountService.print();	//
		System.out.println();
		
		
		System.out.println("3.AccountService야은행계좌들 총잔고 출력해줘");
		accountService.totBalancePrint();	//
		System.out.println();
		
		
		System.out.println("4.AccountService야 계좌번호줄께 계좌 한 개 출력해줘");
		accountService.findByNoPrint(1111);
		accountService.findByNoPrint(2222);
		accountService.findByNoPrint(9999);	//
		System.out.println();
		
		
		System.out.println("5.AccountService야 계좌잔고줄께 잔고 이상인 계좌들 출력해줘");
		accountService.findByBalancePrint(90000);	//
		System.out.println();
		
		
		System.out.println("6.AccountService야 계좌이율 인자로줄께 이율 이상인 계좌들 출력해줘");
		accountService.findByIyulPrint(3.0);	//
		System.out.println();
		
		
		System.out.println("7.AccountService야 계좌주이름 인자로줄께 계좌주 이름과 일치하는 계좌들(?) 출력해줘");
		accountService.findByNamePrint("AIMDDF");	//
		System.out.println();
		
		
		System.out.println(" 8.AccountService야 계좌번호,입금할돈 인자로줄께 입금해줘");
		accountService.ipGum(1111, 5600);
		System.out.println();
		
		
		System.out.println("9.AccountService야 계좌번호,출금할돈 인자로줄께 출금해줘");
		accountService.chulGum(2222, 3500);
		System.out.println();
		
		
		System.out.println("10.AccountService야 계좌를 잔고순으로 오름차순정렬");
		accountService.sortByBalanceAscending();
		System.out.println();


		System.out.println("11.AccountService야 계좌를 잔고순으로 내림차순정렬");
		accountService.sortByBalanceDescending();
		System.out.println();
		
		
		System.out.println("12.AccountService야 계좌객체데이타줄께 이름,잔고,이율 수정(update)해줘");
		accountService.updateAccount(6666, "YANG", 57000, 1.2);
		//데이터를 트랜스퍼 하기 위한 객체: DTO
		//accountService.updateAccount(updateAccount);
		
		System.out.println();
		
		Account updateAccount=new Account(8888, "qIMGG", 91000, 1.7);
		accountService.updateAccount(updateAccount);
		
		System.out.println();
		
		
		
	}

}
