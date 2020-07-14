package com.itwill.account;

import java.util.ArrayList;

public interface AccountDao {

	/**********************************************/
	/*
	 * Create
	 */
	boolean create(Account account) throws Exception;

	/*
	 * ReadOne
	 * ReadAll
	 */
	Account readOne(int no) throws Exception;

	ArrayList<Account> readAll() throws Exception;
	/*
	 * Update
	 */
	/*
	public void update(Account updateAccount) throws Exception {
		ArrayList<Account> accountList=this.readFile();
		for (Account account : accountList) {
			if(account.getNo()==updateAccount.getNo()) {
				account.setOwner(updateAccount.getOwner());
				account.setBalance(updateAccount.getBalance());
				account.setIyul(updateAccount.getIyul());
				break;
			}
			
		}
		
	}
	 */

	void update(Account updateAccount) throws Exception;

	void update(int no, String owner, int balance, double iyul) throws Exception;

	/*
	 * Delete
	 */
	void delete(int no) throws Exception;

	ArrayList<Account> readByOwner(String ownerStr) throws Exception;

}