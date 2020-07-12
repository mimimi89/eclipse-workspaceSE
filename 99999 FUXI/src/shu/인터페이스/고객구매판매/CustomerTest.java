package shu.인터페이스.고객구매판매;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer=new Customer();
		
		Buy buyer=customer;
		buyer.buy();
		
		Sell seller=customer;
		seller.sell();
		
		if(seller instanceof Customer) {
			Customer customer2=(Customer)seller;
			customer2.buy();
			customer2.sell();
			
			
			
		}
		

	}

}
