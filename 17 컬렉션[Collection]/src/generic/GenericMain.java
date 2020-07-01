package generic;

public class GenericMain {

	public static void main(String[] args) {

		System.out.println("------------------ NoGeneric ----------------------");
		NoGenericClass noGenericClass=new NoGenericClass();
		noGenericClass.setMember("스트링");
		String getMember=(String)noGenericClass.getMember();
		noGenericClass.setMember(new Account(1111, "FIRST", 30000, 0.4));
		Account getAccount=(Account)noGenericClass.getMember();
		getAccount.print();
		noGenericClass.setMember(new Car("1234",12));
		Car getCar=(Car)noGenericClass.getMember();
		getCar.print();
		
		
		
		
	}

}
