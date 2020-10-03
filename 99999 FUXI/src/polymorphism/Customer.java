package polymorphism;

public class Customer {
	public int customerID;
	public String customerName;
	public String customerGrade;
	public int bonusPoint;
	public double bonusRatio;
	//Customer객체는 고객아이디, 고객이름, 고객등급, 포인트, 적립율을 가지고 있음
	
	public Customer() {
		initCustomer();
	}
	//디폴트 생성자를 호출하면 실버 등급과 적립율 0.01%를 적용

	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	//아이디와 이름을 매개변수로 받는 생성자도 있음
	
	private void initCustomer() {
		customerGrade="SILVER";
		bonusRatio=0.01;
		
	}
	
	public int calcPrice(int price) {
		bonusPoint +=price * bonusRatio;
		return price;
		
	}
	/*
	 * 계산 메서드
	 * 가격에 적립율 곱해서 포인트 적립시켜주고, 가격 반환
	 */
	
	public String showCustomerInfo(){
		return customerName+"님의 등급은 "+customerGrade+"이며, 보너스 포인트는 "+bonusPoint+"입니다.";
	}
	/*
	 * 고객 정보 반환 메서드
	 * 고객 이름, 고객 등급, 포인트 반환
	 */

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	
	
	

}
