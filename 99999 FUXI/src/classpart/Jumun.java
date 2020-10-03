package classpart;

public class Jumun {
	
	long no;
	String id;
	String date;
	String name;
	String productNo;
	String address;
	
	
	@Override
	public String toString() {
		return "Jumun1 [주문번호: " + no + ", 주문자 아이디: " + id + ", 주문 날짜: " + date + ", 주문자 이름: " + name + ", 주문 상품 번호: " + productNo
				+ ", 배송 주소: " + address + "]";
	}
	
	public static void main(String[] args) {
		Jumun jumun1=new Jumun();
		
		jumun1.no=201803120001l;
		jumun1.id="abc123";
		jumun1.date="2018년 3월 12일";
		jumun1.name="홍길순";
		jumun1.productNo="PD0345-12";
		jumun1.address="서울시 영등포구 여의도동 20번지";
		
		System.out.println(jumun1.toString());
		
		
		
	}
	

}
