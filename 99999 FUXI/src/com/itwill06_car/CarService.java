package com.itwill06_car;

public class CarService {
	
	private Car[] carArray;
	
	//생성자 메쏘드
	public CarService() {
		carArray=new Car[30];
	}
	
	public CarService(int count) {
		carArray=new Car[count];
	}
	
	//0. 차객체를 인자로 받아서 입차 후 성공실패여부 반환
		//주차장이 만차이면 입차실패
	    //차량번호 중복 체크
	
	public boolean ipChar(Car inCar) {
		boolean isSuccess=false;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]==null) {
				carArray[i]=inCar;
				isSuccess=true;
				break;
				
			}
		}
		return isSuccess;
	}
	
	
	//1. 전체차량출력
	public void print() {
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null) {
				carArray[i].print();
				
			}
		}

	}
	
	
	// 2. 주차구획수반환
	public int getParkingSpot() {
		int count=0;
		for (int i = 0; i < carArray.length; i++) {
			count++;
		}
		System.out.println("총주차구획수: "+count+"개");
		return count;
	}
	
	
	// 3. 주차가능주차구획수반환
	public int getParkingSpace() {
		int count=0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]==null) {
				count++;
				
			}
		}
		System.out.println("주차가능구획수: "+count+"개");
		return count;
	}
	
	
	// 5. 차량번호(4567번) 인자받아서 차객체 한대 참조변수 반환
	public Car findCarbyNo(String no) {
		Car findCar=null;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null&&carArray[i].getNo() == no) {
				findCar=carArray[i];
				break;
			}
		}
		return findCar;
	}
	
	
	//6. 입차시간(8시이후)인자받아서 차객체배열 참조변수반환
	public Car findCarbyTime(int intime) {
		Car findCar=null;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null&&carArray[i].getInTime()>=8) {
				findCar=carArray[i];
				
			}
		}
		return findCar;
	}
	
	//7. 차량번호(7891번),출차시간(12시)인자로 받아서 출차");
	public void findCarCalFee(String no, int outTime) {
		Car findCar=null;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i].getNo()==no) {
				findCar=carArray[i];
				break;
				
			}
			
		}
		findCar.setOutTime(outTime);
		findCar.calculateFee();
		findCar.headerPrint();
		findCar.print();
		
		
	}
	
	
}
