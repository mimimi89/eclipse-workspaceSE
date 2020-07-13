package com.itwill.account;
import java.util.ArrayList;
/* 
 	은행업무를 실행할 클래스
 		- 계좌관리 업무를 수행하는 클래스
 		- Account객체를 사용(의존성관계)
 		- AccountServiceMain에서 사용
  		- 업무 처리시 데이타 접근(data access)이 필요하면 AccountDao객체를 이용해서 업무를 실행
  		- AccountDao객체를 포함하고있다.[멤버변수]
 */

public class AccountService {
	private AccountDao accountDao;

	public AccountService() {
		accountDao=new AccountDao();
		
	}
	
	public void a() {
		System.out.println("AccountService.a()");
		
	}
		
	
	
	
}















