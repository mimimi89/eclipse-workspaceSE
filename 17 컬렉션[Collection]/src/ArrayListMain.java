import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMain {
	
	
	public static void main(String[] args) {
		
		System.out.println("---------Object[]-----------");
		Object[] anyTypeArray=new Object[5];
		Account acc1=new Account(1111, "KING", 33000, 0.05);
		Account acc2=new Account(2222, "KING", 23000, 0.1);
		Account acc3=new Account(3333, "YONG", 89000, 0.2);
		Account acc4=new Account(4444, "SANG", 12000, 0.5);
		Account acc5=new Account(5555, "KING", 99000, 0.8);
		anyTypeArray[0]=acc1;
		anyTypeArray[1]=acc2;
		anyTypeArray[2]=acc3;
		anyTypeArray[3]=acc4;
		anyTypeArray[4]=acc5;
		//다섯 개의 account를 담을 수 있는 Object 배열 객체 하나를 생성함
		
		
		
		for (int i = 0; i < anyTypeArray.length; i++) {
			Account tempAccount=(Account)anyTypeArray[i];
			//account 타입의 임시 공간에 캐스팅한 Object 배열 객체를 담아서
			tempAccount.print();
			//출력
			
		}
		System.out.println();
		System.out.println("---------ArrayList[참조형]-----------");
		ArrayList accountList=new ArrayList(5);
		System.out.println(accountList.toString());
		System.out.println("#.size: "+accountList.size());
		
		System.out.println();
		System.out.println("********** 1. add ***********");
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		accountList.add(acc4);
		accountList.add(acc5);
		accountList.add(new Account(6666, "SIX", 60000, 0.6));
		System.out.println("#.size: "+accountList.size());
		//accountList.add(acc3);	//중복허용
		System.out.println(accountList.toString());
		
		System.out.println();
		System.out.println("********** 2. set ***********");
		accountList.set(3, new Account(4445, "FOUR",44000, 0.4));
		System.out.println(accountList.toString());
		
		System.out.println();
		System.out.println("********** 3. get ***********");
		Object getObject=accountList.get(1);
		Account getAccount = (Account)getObject;
		getAccount.print();
		getAccount=(Account)accountList.get(4);
		getAccount.print();
		
		System.out.println();
		System.out.println("********** 4.remove ***********");
		accountList.remove(accountList.size()-1);
		System.out.println("#.size: "+accountList.size());
		System.out.println(accountList);
		
		System.out.println();
		System.out.println("********** 5.전체출력 ***********");
		for (int i = 0; i < anyTypeArray.length; i++) {
			Account tempAccount=(Account)accountList.get(i);
			tempAccount.print();
			
		}
		
		System.out.println();
		System.out.println("********** 5.전체출력[enhanced for] ***********");
		//index 없이 출력할 때 사용하는 방법
		for (Object account:accountList) {
			Account tempAccount=(Account)account;
			
			
			
		}
		
		System.out.println();
		System.out.println("********** 3333번 계좌 출력 ***********");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=(Account)accountList.get(i);
			if(tempAccount.getNo()==5555) {
				tempAccount.print();
				break;
			}
		}
		
		System.out.println();
		System.out.println("********** 계좌주 KiNG 출력 ***********");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=(Account)accountList.get(i);
			if(tempAccount.getOwner().equals("KING")) {
				tempAccount.print();
			}
			
		}
		
		System.out.println();
		System.out.println("********** 5555 계좌 삭제 ***********");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=(Account)accountList.get(i);
			if(tempAccount.getNo()==5555) {
				System.out.println("before remove size: "+accountList.size());
				accountList.remove(i);
				System.out.println("after remove size: "+accountList.size());
				break;
				
			}
			
		}
		
		System.out.println(accountList);
		
		System.out.println();
		System.out.println("********** KING 계좌주 모두 삭제 ***********");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=(Account)accountList.get(i);
			if(tempAccount.getOwner().equals("KING")) {
				accountList.remove(i);
				i--;
			}
			
		}
		System.out.println(accountList);
		
		System.out.println();
		System.out.println("**************** iteration ******************");
		System.out.println("************ iteration의 사용법 *************");
		Iterator accountIter=accountList.iterator();
		while(accountIter.hasNext()) {
			Account tempAccount=(Account)accountIter.next();
			tempAccount.print();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
