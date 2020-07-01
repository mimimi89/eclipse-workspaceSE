import java.util.HashSet;


public class HashSetMain {

	public static void main(String[] args) {
		
		Account acc1=new Account(1111, "KING", 33000, 0.05);
		Account acc2=new Account(2222, "KING", 23000, 0.1);
		Account acc3=new Account(3333, "YONG", 89000, 0.2);
		Account acc4=new Account(4444, "SANG", 12000, 0.5);
		Account acc5=new Account(5555, "KING", 99000, 0.8);
		
		HashSet accountSet=new HashSet();
		System.out.println("#size: "+accountSet.size());
		
		System.out.println("******************* 1.add *********************");
		accountSet.add(acc1);
		accountSet.add(acc2);
		accountSet.add(acc3);
		accountSet.add(acc4);
		accountSet.add(acc5);
		
		System.out.println("#size: "+accountSet.size());
		System.out.println(accountSet);
		
		
		
		
		
		
		
		
		
		
		

	}

}
