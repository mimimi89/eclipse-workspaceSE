package com.itwill.account;

import java.util.ArrayList;

/*
Dao(Data Access Object)
 - 계좌객체들의 데이터를 저장하고있는 파일(테이블)에
   CRUD(Create, Read, Update, Delete) 작업을 할수있는
   단위메쏘드를 가지고있는 클래스

 - AccountService객체 의 요청(메쏘드호출)을 받아서 
   Data Access(File, DB)에 관련된 단위기능(CRUD)을
   수행하는 객체
 */
public class AccountDao {
	
	/*
	 * Account 데이타 소스(파일, 테이블, 메모리)
	 */
	
	private ArrayList<Account> accounts;

	public AccountDao() {
		accounts=new ArrayList<Account>();
		//생성자에서 초기화 작업
		accounts.add(new Account(1111, "KIM", 89000, 1.3));
		accounts.add(new Account(2222, "AIM", 45000, 2.7));
		accounts.add(new Account(3333, "FIM", 23000, 4.7));
		accounts.add(new Account(4444, "XIM", 34000, 6.7));
		accounts.add(new Account(5555, "HIM", 78000, 3.7));
		accounts.add(new Account(6666, "AIM", 99000, 5.7));
		accounts.add(new Account(7777, "PIM", 89000, 4.7));
		accounts.add(new Account(8888, "QIM", 91000, 1.7));
		accounts.add(new Account(9999, "MIM", 12000, 0.7));
		
	}
	
	/*
	 * Create
	 */
	
	
	
	/*
	 * ReadOne * 
	 * ReadMany *
	 */
	public void readAll() {
		
	}
	
	
	/*
	 * Update
	 */
	
	
	
	/*
	 * Delete
	 */
	
	
	
	

	

	
}
