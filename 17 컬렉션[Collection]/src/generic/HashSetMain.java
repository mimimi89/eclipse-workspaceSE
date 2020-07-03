package generic;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetMain {

	public static void main(String[] args) {
		
		System.out.println();
		Account acc1=new Account(1111, "KING", 33000, 0.05);
		Account acc2=new Account(2222, "KING", 23000, 0.1);
		Account acc3=new Account(3333, "YONG", 89000, 0.2);
		Account acc4=new Account(4444, "SANG", 12000, 0.5);
		Account acc5=new Account(5555, "KING", 99000, 0.8);
		
		HashSet<Account> accountSet=new HashSet<Account>();
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
		System.out.println(accountSet);
		System.out.println();
		
		System.out.println("******************* 3.contains *********************");
		if(!accountSet.contains(acc5)) {
			System.out.println("["+acc5.hashCode()+"] 객체 존재 안함");
		}
		System.out.println();
		
		System.out.println("***************** 전체출력 *********************");
		Object[] oa=accountSet.toArray();
		for (int i = 0; i < oa.length; i++) {
			Account tempAccount=(Account)oa[i];
			tempAccount.print();
			
		}
		System.out.println();
		
		System.out.println("******************* 4.clear *********************");
		//accountSet.clear();
		if(accountSet.isEmpty()) {
			System.out.println("isEmpty()-->"+accountSet.size());
		}
		
		
		System.out.println("**************** iteration ******************");
		System.out.println("************ iteration의 사용법 *************");
		Iterator<Account> accountIter=accountSet.iterator();
		while(accountIter.hasNext()) {
			Account tempAccount=accountIter.next();
			tempAccount.print();
		}
		
		System.out.println("-----------------HashSet[Wrapper]---------------------");
		HashSet<Integer> lottoSet =new HashSet<Integer>();
		System.out.println("size: "+lottoSet.size());
		
		System.out.println("******************* add *********************");
		lottoSet.add(34);
		lottoSet.add(40);
		lottoSet.add(5);
		lottoSet.add(6);
		System.out.println("size:"+lottoSet.size());
		System.out.println(lottoSet);
		isAdd=lottoSet.add(new Integer(40));
		System.out.println("isAdd: "+isAdd);
		System.out.println("size:"+lottoSet.size());
		System.out.println(lottoSet);
		
		System.out.println("******************* remove *********************");
		if(lottoSet.contains(40)) {
			lottoSet.remove(40);
			
		}
		
		
		System.out.println("******************* clear *********************");
		lottoSet.clear();
		System.out.println(lottoSet);
		while(lottoSet.size()<6) {
			lottoSet.add((int)(Math.random()*45)+1);
		}
		System.out.println();
		
		System.out.println("***************** 전체출력[Iteration] *********************");
		Iterator<Integer> lottoIter=lottoSet.iterator();
		while(lottoIter.hasNext()) {
			int temNo=lottoIter.next();
			System.out.println(temNo+" ");
		}
			
		
		System.out.println("-----------------HashSet[String]---------------------");
		Set<String> nameSet =new HashSet<String>();
		nameSet.add("kim");
		nameSet.add("jim");
		nameSet.add("gim");
		nameSet.add("sim");
		System.out.println("add: "+nameSet);
		nameSet.add("kim");
		System.out.println("add: "+nameSet);
		if(nameSet.contains(new String("kim"))) {
			System.out.println("kim문자열을가진 String객체가 존재..");
			
		}
		
		
		
		
		

	}

}
