package com.itwill.shop.member;

import com.itwill.shop.order.Order;
import com.itwill.shop.product.Product;

public class MemberService {
	private Member member;
	private Order order;
	//Order cannot be resolved to a type
	//member package에 Order라는 클래스가 존재하지 않기 때문에 오류 발생
	//사용하려면 import 구문 사용
	
	private Product product;
}
