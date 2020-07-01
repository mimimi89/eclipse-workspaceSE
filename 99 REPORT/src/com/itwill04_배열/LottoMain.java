package com.itwill04_배열;

public class LottoMain {
	
	public static void main(String[] args) {
		System.out.println("------------------------------");
		int[] lottoNo=new int[6];
	
		/*
		 * 번호6개(1set)생성
		 */
		for (int i = 0; i < lottoNo.length; i++) {
			
			//중복체크
			lottoNo[i] = (int)(Math.random()*45)+1;
			for (int j = 0; j < i; j++) {
				if(lottoNo[i]==lottoNo[j]) {
					System.out.println("--중복--");
					i--;
					break;
					//while 문으로 해도 된다
				}
					
			}
		}
		
		
		/*
		 * 번호 6개출력
		 */
		for (int i = 0; i < lottoNo.length; i++) {
			System.out.print(lottoNo[i]+" ");
		}
		System.out.println();
		
		
		
		
		
		
		
		System.out.println("-----------Lotto-----------------");
		Lotto lotto1=new Lotto();
		lotto1.print();
		
		
		
		
		
		
		System.out.println("-----------Lotto[]-----------------");
		Lotto[] lottoArray=new Lotto[10];
		for (int i = 0; i < lottoArray.length; i++) {
			lottoArray[i]=new Lotto();
		}
		for (int i = 0; i < lottoArray.length; i++) {
			lottoArray[i].print();
		}
		
		
		
		

	}

}
