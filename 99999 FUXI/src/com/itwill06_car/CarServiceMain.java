package com.itwill06_car;

public class CarServiceMain {
	public static void main(String[] args) {
		
		CarService carService=new CarService(10);
		
		System.out.println("0.CarService.차객체인자로줄께 입차시켜줘");
		boolean isSuccess = carService.ipChar(new Car("2344",3 ));
		if(!isSuccess) {
			System.out.println("만차..");
		}
		carService.ipChar(new Car("4566",4 ));
		
		
		
		
		
		
		
		
		
		
		System.out.println("1.CarService.전체차량출력해줘");
		
		
		System.out.println("2.CarService.전체주차구획수반환해줘");
		
		
		System.out.println("3.CarService.주차가능주차구획수반환해줘");
		
		
		System.out.println("5.CarService.차량번호(4567번) 인자로줄께 "
				+ "차객체한대 참조변수반환해줘");
		
		
		System.out.println("6.CarService.입차시간(8시이후) 인자로줄께 "
				+ "차객체배열 참조변수반환해줘");
		
		
		System.out.println("7.CarService.차량번호(7891번) 출차시간(12시)인자로줄께"
				+ " 출차시켜줘");
		
	}

}
