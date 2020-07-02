package com.itwill04_array;



public class CarArrayMain {
	public static void main(String[] args) {
		/*
		 * NullPointerException
		 */
		Car[] carArray= {
			null,null,new Car("2133", 12),null,null,	
			null,null,new Car("1890", 11),null,null,
			null,null,null,null,null,
			null,new Car("4234", 9),null,null,null,
			null,null,null,new Car("4567", 11),null,
			new Car("6777", 10),null,null,null,null
		};
		
		//30개의 car 객체를 담을 수 있는 car 배열 객체 carArray 생성됨
		//비어 있는 공간도 있으니까 for문에서 null 여부 먼저 확인
		
		
		System.out.println();
		System.out.println("1.전체차량출력");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null) {
				carArray[i].print();
			}
		}
		System.out.println("-------------------------------------");
		
		
		System.out.println();
		System.out.println("2.주차전체구획수: "+carArray.length+"개");
		
		
		System.out.println();
		int count = 0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]==null) {
				count++;
			}
		}
		System.out.println("3.주차가능주차구획수: " + count+"개");
		
		
		System.out.println();
		System.out.println("4.입차");
		
		//1.차량객체생성 
		Car car1=new Car("8911", 13);
		
		
		//2.빈자리찾아서대입
		boolean isFull=true;
		//빈자리가 있나 없나 확인
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]==null) {
				//만약 배열 객체 안에 빈자리가 있으면
				carArray[i]=car1;
				//그 빈자리를 차량 객체에게 주고
				isFull=false;
				//isFull변수의 값을 false로 대입
				System.out.println(">>> 입차성공");
				//입차성공을 출력한 뒤
				break;
				//그만!
			}
		}
		if(isFull) {
			//만약 만차 상황이면
			System.out.println(">>> 입차실패(만차)");
			//입차실패 출력
		}
		
		
		System.out.println();
		System.out.println("5.차량번호 4567번  차 한대 정보출력");
		//차량번호는 String 타입으로 선언되어 있음
		//비교연산 아니고 equal로
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null) {
				//carArray 배열 객체 중 비어 있는 게 아니라면
				String tempNo=carArray[i].getNo();
				//임시공간에 차량 배열 객체의 차량번호를 담아 놓고
				if(tempNo.equals("4567")) {
					//임시공간에 담겨진 차량번호가 equals 괄호 안의 것과 같으면 
					carArray[i].print();
					//출력
					break;
					//차 한 대 출력이니까 break
				}
			}
		}
		System.out.println("-------------------------------------");
		
		
		System.out.println();
		System.out.println("6.입차시간 8시이후 차 여러대 정보출력");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null && carArray[i].getInTime()>=8) {
				//비어 있는 것이 아니고, 입차시간이 8시 이후이면
				carArray[i].print();
				//출력
				
			}
		}
		System.out.println("-------------------------------------");

		
		System.out.println();
		System.out.println("7.4234번차량 12시 출차");
		/*
		 * 1 . 4234번차량찾기 return
		 * 2 . 12시 출차 set 변경
		 * 3 . 영수증출력 print
		 * 4 . 배열에서 주소값 제거 --> null
		 */
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null) {
				String temp=carArray[i].getNo();
				if(temp.equals("4234")) {
					carArray[i].setOutTime(12);
					carArray[i].calculateFee();
					carArray[i].print();
				}
				
			}
		}
		System.out.println("-------------------------------------");
		
		
		System.out.println();
		System.out.println("8.1890 번차량 입차시간 9시로변경");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null) {
				String tempCar=carArray[i].getNo();
				if(tempCar.equals("1890")) {
					carArray[i].setInTime(9);
					carArray[i].print();
				}
				
			}
			
		}
		System.out.println("-------------------------------------");
		
		
	}

}
