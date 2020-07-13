package jiaokeshu_10_인터페이스;

public class Customer implements Buy, Sell {
	
	
	@Override
	public void buy() {
		System.out.println("구매하기");
		
	}
	
	@Override
	public void sell() {
		System.out.println("판매하기");
		
	}

}
