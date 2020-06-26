package com.itwill01_member_method;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator calculator=new Calculator();
		//Calculator 타입의 객체 생성
		
		
		int result=calculator.add(23, 34);
		System.out.println(result);
		
		result=calculator.sub(23,34);
		System.out.println(result);
		
		result=calculator.mul(23,34);
		System.out.println(result);
		
		result=calculator.div(45435,34);
		System.out.println(result);
		
		
		
		
	}

}










