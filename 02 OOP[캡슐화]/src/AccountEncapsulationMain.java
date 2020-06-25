///

public class AccountEncapsulationMain {

	public static void main(String[] args) {
		
		Account account1=new Account();
		account1.setAccountData(1111, "KIM", 59000, 0.5);
		account1.deposit(3000);		//3000원 입금
		account1.print();
		
		Account account2=new Account();
		account2.setAccountData(2222, "LEE", 89000, 1);
		account2.withdraw(5600);	//5600원 출금
		account2.print();
		
		System.out.println();
		int account2Balance=account2.getBalance();		//account2 객체의 잔고를 출력하기 위해 잔고를 받기 위한 코드
		System.out.println(">>>>>  account2의 잔고 조회: "+account2Balance+"원");	
		System.out.println();
		
		//account2.setAccountData(2222, "SIM", 89000, 1);
		account2.setOwner("SIM");	//account2 객체의 계좌주 이름을 변경하는 코드
		account2.print();
	
		
		
		
	}

}
