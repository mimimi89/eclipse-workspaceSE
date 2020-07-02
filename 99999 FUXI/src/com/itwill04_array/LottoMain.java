package com.itwill04_array;

public class LottoMain {

	public static void main(String[] args) {
		System.out.println("------------------------------");
		
		int[] lottoNo=new int[6];
		
		
		//번호6개(1set)생성
		for (int i = 0; i < lottoNo.length; i++) {
			//중복체크
			lottoNo[i] = (int)(Math.random()*45)+1;
			/*
			for (int j = 0; j < lottoNo.length; j++) {
				if(lottoNo[i]==lottoNo[j]) {
					System.out.println("중복");
					i--;
					break;
					
				}
			}
			*/
			
		}


		//번호 6개출력
		for (int i = 0; i < lottoNo.length; i++) {
			System.out.print(lottoNo[i]+" ");
		}
		System.out.println();
		
		
		
		
		
		System.out.println("-----------Lotto-----------------");
		Lotto lotto1=new Lotto();
		//객체 만들고 무작위로 6개의 숫자까지 뽑아 놓음
		lotto1.print();

		
		
		
		
		System.out.println("-----------Lotto[]-----------------");
		Lotto[] lottoArray=new Lotto[10];
		//6개 한 세트가 10개 들어있는 Lotto 객체
		
		for (int i = 0; i < lottoArray.length; i++) {
			lottoArray[i]=new Lotto();
			//lottoArray 배열 객체의 하나 하나는 6개 한 세트를 가지고 있고,
		}
		
		for (int i = 0; i < lottoArray.length; i++) {
			System.out.print(i+1+" 번째: ");
			lottoArray[i].print();
		}
		
		
		
		

	}

}
