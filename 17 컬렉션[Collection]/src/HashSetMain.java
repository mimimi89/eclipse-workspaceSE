import java.util.HashSet;


public class HashSetMain {

	public static void main(String[] args) {
		
		System.out.println();
		Account acc1=new Account(1111, "KING", 33000, 0.05);
		Account acc2=new Account(2222, "KING", 23000, 0.1);
		Account acc3=new Account(3333, "YONG", 89000, 0.2);
		Account acc4=new Account(4444, "SANG", 12000, 0.5);
		Account acc5=new Account(5555, "KING", 99000, 0.8);
		
		HashSet accountSet=new HashSet();
		System.out.println("#size: "+accountSet.size());
		System.out.println();
		
		System.out.println("******************* 1.add *********************");
		accountSet.add(acc1);
		accountSet.add(acc2);
		accountSet.add(acc3);
		accountSet.add(acc4);
		accountSet.add(acc5);
		
		System.out.println("#size: "+accountSet.size());
		System.out.println(accountSet);
		boolean isAdd=accountSet.add(acc5);
		//acc5가 들어오면 기존의 객체와 equals 사용해서 주소값 비교
		//string class에서는 값 비교
		System.out.println("추가여부: "+isAdd);
		System.out.println("#size: "+accountSet.size());
		System.out.println();
		
		System.out.println("******************* 2.remove *********************");
		boolean isRemove=accountSet.remove(acc5);
		System.out.println("삭제여부: "+isRemove);
		System.out.println("#size: "+accountSet.size());
		
		
		
		
		
		
		
		
		

	}

}
