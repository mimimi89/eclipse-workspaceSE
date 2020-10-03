package polymorphism;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	//VIPCustomer객체는 고객아이디, 고객이름, 고객등급, 포인트, 적립율에 상담원 아이디, 할인율을 가지고 있음
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
		this.agentID=agentID;
		
	}
	//아이디와 이름, 상담원 아이디를 매개변수로 받는 생성자에 고객등급, 적립율, 할인율 포함
	
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price - (int)(price * saleRatio);
	}
	//계산 메서드 오버라이드
	
	public String showCustomerInfo() {
		return super.showCustomerInfo()+"담당 상담원 번호는 "+agentID+"입니다.";
	}
	//고객 정보 보여주는 메서드 오버라이드
	
	public int getAgentID() {
		return agentID;
	}
	

}
