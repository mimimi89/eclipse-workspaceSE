package polymorphism;

public class GoldCustomer  extends Customer {
	double saleRatio;
	//GoldCustomer객체는 고객아이디, 고객이름, 고객등급, 포인트, 적립율에 할인율을 가지고 있음
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade="Gold";
		bonusRatio=0.02;
		saleRatio=0.1;
		
	}
	//아이디와 이름을 매개변수로 받는 생성자에 고객등급, 적립율, 할인율 포함
	
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price - (int)(price * saleRatio);
	}
	//계산 메서드 오버라이드
	
	
	
	
}
