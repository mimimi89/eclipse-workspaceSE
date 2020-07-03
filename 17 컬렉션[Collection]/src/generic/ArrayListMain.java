package generic;
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
		System.out.println("------------ArrayList[참조형]---------------");
		ArrayList<Account> accountList=new ArrayList<Account>();
		System.out.println("#size:"+accountList.size());
		System.out.println("*********** 1.add *****************");
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		accountList.add(acc4);
		accountList.add(acc5);
		accountList.add(new Account(6666,"SIX",60000,6.0));
		accountList.add(0,new Account(1000,"FIRST",100000,1.0));
		System.out.println("#size:"+accountList.size());
		//accountList.add(acc3);//중복허용
		System.out.println(accountList.toString());
		System.out.println("*********** 2.set *****************");
		accountList.set(3, new Account(4445, "FOUR", 44000, 0.4));
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList.toString());
		
		System.out.println("*********** 3.get *****************");
		Account getAccount = accountList.get(1);
		getAccount.print();
		
		getAccount = (Account)accountList.get(4);
		getAccount.print();
		System.out.println("*********** 4.remove *****************");
		accountList.remove(accountList.size()-1);
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		
		System.out.println();
		System.out.println("********** 5.전체출력 ***********");
		for (int i = 0; i < anyTypeArray.length; i++) {
			accountList.get(i).print();
		
			
		}
		
		System.out.println();
		System.out.println("********** 5.전체출력[enhanced for] ***********");
		//index 없이 출력할 때 사용하는 방법
		for (Account account:accountList) {
			account.print();
			
			
		}
		
		System.out.println();
		System.out.println("********** 5555번 계좌 출력 ***********");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=accountList.get(i);
			if(tempAccount.getNo()==5555) {
				tempAccount.print();
				break;
			}
		}
		
		System.out.println();
		System.out.println("********** 계좌주 KiNG 출력 ***********");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=accountList.get(i);
			if(tempAccount.getOwner().equals("KING")) {
				tempAccount.print();
			}
			
		}
		
		System.out.println();
		System.out.println("********** 5555 계좌 삭제 ***********");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=accountList.get(i);
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
			Account tempAccount=accountList.get(i);
			if(tempAccount.getOwner().equals("KING")) {
				accountList.remove(i);
				i--;
			}
			
		}
		System.out.println(accountList);
		
		System.out.println();
		System.out.println("**************** iteration ******************");
		System.out.println("************ iteration의 사용법 *************");
		Iterator<Account> accountIter=accountList.iterator();
		while(accountIter.hasNext()) {
			Account tempAccount=accountIter.next();
			tempAccount.print();
		}
		
		System.out.println("------------ArrayList[기본형(Wrapper, String)]---------------");
		ArrayList<Integer> scoreList=new ArrayList<Integer>();
		scoreList.add(90);
		scoreList.add(30);
		scoreList.add(45);
		scoreList.add(34);
		scoreList.add(12);
		scoreList.add(99);
		scoreList.add(62);
		scoreList.add(43);
		
		
		System.out.println("--------------add---------------");
		System.out.println(scoreList);
		System.out.println();
		
		System.out.println("--------------get---------------");
		Integer getScore0=scoreList.get(0);
		System.out.println(getScore0.intValue());
		int getScoreLast=scoreList.get(scoreList.size()-1);
		System.out.println(getScoreLast);
		System.out.println();
		
		System.out.println("--------------set---------------");
		scoreList.set(0, new Integer(100));
		scoreList.set(1, 100);
		System.out.println(scoreList);
		System.out.println();
		
		System.out.println("------remove(int index)------");
		int removeScore=scoreList.remove(0);
		System.out.println("removeScore: "+removeScore);
		System.out.println("size: "+scoreList.size());
		System.out.println();
		
		//think(볼 필요 없음)
		System.out.println("-----remove(Object o)------");
		System.out.println(scoreList);
		scoreList.remove(new Integer(100));
		System.out.println(scoreList);
		
		
		System.out.println("--------------전체 출력---------------");
		for (int i = 0; i < scoreList.size(); i++) {
			int score=scoreList.get(i);
			System.out.print(score+" ");
			
		}
		System.out.println();
		
		
		System.out.println("--------------전체 출력[Iteration]---------------");
		Iterator<Integer> scoreIter=scoreList.iterator();
		while(scoreIter.hasNext()) {
			int tempScore=scoreIter.next();
			System.out.print(tempScore+" ");
		}
		
		
		System.out.println("------------ArrayList[String]---------------");
		System.out.println("--------------add---------------");
		ArrayList<String> nameList=new ArrayList<String>();
		nameList.add("kim");
		nameList.add("sim");
		nameList.add("cim");
		nameList.add("vim");
		String str=new String("uim");
		nameList.add(str);
		nameList.add("tim");
		nameList.add("iim");
		nameList.add("bim");
		nameList.add("kim");
		nameList.add("fim");
		nameList.add("aim");
		
		System.out.println("size: "+nameList.size());
		nameList.add("hhh");
		nameList.add(0,"kkk");
		System.out.println("size: "+nameList.size());
		System.out.println(nameList);
		
		
		System.out.println("--------------set---------------");
		nameList.set(3, "THREE");
		System.out.println(nameList);
		
		
		System.out.println("------remove(int index)------");
		nameList.remove(5);
		System.out.println(nameList);
		
		System.out.println("-----remove(Object o)------");
		nameList.remove(new String("kim"));
		System.out.println(nameList);
		
		System.out.println("--------------전체 출력---------------");
		for (String name:nameList) {
			System.out.print(name+" ");
		}
		System.out.println();
		
		System.out.println("--------------전체 출력[Iteration]---------------");
		Iterator<String> nameIter=nameList.iterator();
		while(nameIter.hasNext()) {
			String name=nameIter.next();
			System.out.print(name+" ");
		}
		
		
		
		
		
		
	}
	
	

}
