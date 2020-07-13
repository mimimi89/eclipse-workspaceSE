///

public class AccountExceptionMain {

	public static void main(String[] args) {
		
		Account account=new Account(1, "KIM", 5000, 3.2);
		//Account 객체 생성
		
		boolean isSuccess = 
		//isSuccess는 
				account.withdraw1(300);
				//300을 인자로 갖는 withdraw1의 값
				//5000-300의 값이 4700
				//0보다 크므로 참 반환
		
		
		
		if(isSuccess) {
			//참이면
			System.out.println("출금성공");
		}else {
			//거짓이면
			System.out.println("출금실패");
		}
		account.print();
		System.out.println("-------------------------------");
		
		
		
		try {
			account.withdraw(50000);
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		account.print();


	}

}