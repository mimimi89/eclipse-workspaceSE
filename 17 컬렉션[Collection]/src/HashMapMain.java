import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapMain {

	public static void main(String[] args) {
		
		
		HashMap carMap=new HashMap();
		System.out.println("#size: "+carMap.size());
		System.out.println();
		
		System.out.println("******************* 1.put *********************");
		Car c1=new Car("1111", 10);
		carMap.put("1111", c1);
		carMap.put("2222", new Car("2222", 11));
		carMap.put(new String("3333"), new Car("3333", 12));
		carMap.put("4444", new Car("4444", 13));
		carMap.put("5555", new Car("5555", 13));
		System.out.println("#size: "+carMap.size());
		System.out.println(carMap);
		
		//키 객체(값, 참조변수의 값)가 동일하면 객체(값)가 바뀐다.
		
		carMap.put("5555", new Car("오오오오", 14));
		System.out.println("#size: "+carMap.size());
		System.out.println(carMap);
		System.out.println();
		
		System.out.println("******************* 2.get *********************");
		Car getCar=(Car)carMap.get("3333");
		getCar.setOutTime(17);
		getCar.calculateFee();
		getCar.print();
		
		System.out.println();
		
		System.out.println("******************* 3.remove *********************");
		Car removeCar=(Car)carMap.remove("3333");
		removeCar.print();
		System.out.println("#size: "+carMap.size());
		System.out.println(carMap);
		removeCar=(Car)carMap.remove("7878");
		System.out.println("removeCar(7878): "+removeCar);
		carMap.remove("7878");
		if(carMap.containsKey("7878")) {
			carMap.remove("7878");
		}
		System.out.println();
		
		
		System.out.println("******************* 4.clear *********************");
		//carMap.clear();	
		//쇼핑몰에서 장바구니 비우기와 같은 개념
		System.out.println("#size: "+carMap.size());
		//carMap=null;		
		//이렇게 지우면 안됨, 장바구니를 아예 없애는 것
		
		
		System.out.println("**************** iteration ******************");
		Set keySet=carMap.keySet();
		Iterator keyIter=keySet.iterator();
		while (keyIter.hasNext()) {
			String key=(String)keyIter.next();
			Car tempCar=(Car)carMap.get(key);
			tempCar.print();
		}
		
		
		
		

	}

}
