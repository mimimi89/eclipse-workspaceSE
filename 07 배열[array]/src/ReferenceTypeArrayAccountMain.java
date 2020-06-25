
public class ReferenceTypeArrayAccountMain {

	public static void main(String[] args) {
		
		Account acc1=new Account(1111, "KIM", 56800, 0.3);

		Account[] accounts= {
				acc1,
				new Account(2222, "LEE", 56000, 0.9),
				new Account(3333, "PARK", 1200, 1.9),
				new Account(4444, "CHOI", 89000, 4.9),
				new Account(5555, "SIM", 34000, 0.6),
				new Account(6666, "DIM", 77000, 0.1),
				new Account(7777, "YIM", 11000, 0.3),
				new Account(8888, "FIM", 21000, 2.4),
				new Account(9999, "QIM", 99000, 3.3)		//괄호 안에 들어간 것은 인자와 비슷한 개념이라 ';' 삽입하면 오류
				
				
				
				
		};
		System.out.println();
		
		System.out.println("1.은행 총 계좌수: "+accounts.length+"개");
		System.out.println();
		
		System.out.println("2.은행 전체 계좌 출력");
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		System.out.println();
		
		System.out.println("3.은행계좌들 총잔고");
		int totBalance=0;
		for (int i = 0; i < accounts.length; i++) {
			totBalance=totBalance+accounts[i].getBalance();
			
		}
		System.out.println(">>"+totBalance);
		System.out.println();
		
		System.out.println("4.은행계좌 중 계좌번호가 3333번 계좌 1개 출력");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==3333) {
				accounts[i].print();
				break;
			}
		}
		System.out.println();
		
		System.out.println("5.은행계좌 중 잔고가 50000원 이상인 계좌를 모두 출력");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getBalance()>=50000) {
				accounts[i].print();
				
			}
			
		}
		System.out.println();
		
		System.out.println("6.은행계좌 중 이율이 2.0 이상인 계좌를 모두 출력");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getIyul()>=2.0) {
				accounts[i].print();
			}
			
		}
		System.out.println();
		
		System.out.println("7.6666번 계좌 3000원 입금");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==6666) {
				accounts[i].print();
				accounts[i].deposit(3000);
				accounts[i].print();
				break;
			}
			
		}
		System.out.println();
		
		System.out.println("8.9999번 계좌 3000원 출금");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==9999) {
				accounts[i].print();
				accounts[i].withdraw(3000);
				accounts[i].print();
				break;
				
			}
			
		}
		
		System.out.println();
		
		System.out.println("9.계좌를 잔고순으로 오름차순으로 정렬");
		for (int i = 0; i < accounts.length-1; i++) {
			for (int j = 0; j < accounts.length-1; j++) {
				if(accounts[j].getBalance() >accounts[j+1].getBalance()) {
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

		System.out.println("10.계좌를 번호 오름차순으로 정렬");
		
		for (int i = 0; i < accounts.length-1; i++) {
			for (int j = 0; j < accounts.length-1; j++) {
				if(accounts[j].getNo() >accounts[j+1].getNo()) {
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
		
		
		System.out.println("10-1.계좌주 이름 오름차순으로 정렬");
		for (int i = 0; i < accounts.length-1; i++) {
			for (int j = 0; j < accounts.length-1-j; j++) {
				if(accounts[j].getOwner().compareTo(accounts[j+1].getOwner())>0) {
					Account temOwner=accounts[j];
					accounts[j]=accounts[j+1];
					accounts[j+1]=temOwner;
					
				}else if(accounts[j].getOwner().compareTo(accounts[j+1].getOwner())==0) {
					System.out.println(">>>>>>2차 정렬");
					
				}
			}
		}
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
		
		
		System.out.println();
		System.out.println("11.5555 계좌의 이율을 3.5로 변경");
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==5555) {
				accounts[i].print();
				accounts[i].setIyul(3.5);
				accounts[i].print();
			}
			
		}
		
		System.out.println();
		System.out.println("12.모든 계좌의 잔고 50원 증가");
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].deposit(50);
			accounts[i].print();
			
		}
		
		
	}

}
