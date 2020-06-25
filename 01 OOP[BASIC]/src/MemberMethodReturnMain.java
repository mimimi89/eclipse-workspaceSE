///

public class MemberMethodReturnMain {

	public static void main(String[] args) {
		

		MemberMethodReturn mmr=new MemberMethodReturn();	
		//MemberMethodReturn 타입의 객체를 생성, 객체이름 mmr(주소값, 참조변수)
		
		
		System.out.println("main1");				//임의로
		
		int recvData1 = mmr.method1();				//반환해야 할 데이터는 첫번째 메쏘드 변수선언 및 대입
		
		System.out.println("recvData1:"+recvData1); //첫번째 메쏘드의 반환 값 출력
													//첫번째 메쏘드 실행과 결과값 11

		
		
		System.out.println();
		
		
		
		System.out.println("main2");
		
		boolean recvData2 = mmr.isMarried();		//반환해야 할 데이터는 boolean 타입의 두번째 메쏘드
													
		System.out.println("recvData2:"+recvData2);	//두번째 메쏘드의 반환 값 출력
													//두번재 메쏘드 반환 값은 false
		
		
		
		System.out.println();
		
		
		
		System.out.println("main3");
		
		int recvData3 = mmr.add(45564, 34234323);
		System.out.println("recvData3:"+recvData3);		//반환 값은 45564+34234323의 합계
		
		recvData3 = mmr.add(56456, 3);					//세번째 메쏘드 인자값 초기화(재설정)
		System.out.println("recvData3:"+recvData3);		//반환 값은 56456+3의 합계
		
		recvData3 = mmr.add(-6756, -344);				//세번째 메쏘드 인자값 초기화(재설정)
		System.out.println("recvData3:"+recvData3);		//반환 값은 -6756+-344의 합계
		System.out.println();
		
		
		
	}//main

}//class
