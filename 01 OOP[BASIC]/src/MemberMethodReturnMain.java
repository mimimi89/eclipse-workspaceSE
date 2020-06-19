
public class MemberMethodReturnMain {

	public static void main(String[] args) {
		

		MemberMethodReturn mmr=new MemberMethodReturn();
		
		System.out.println("main1");				//임의로
		int recvData1 = mmr.method1();				//반환해야할 데이터는 첫번째 메쏘드 변수선언 및 대입
		System.out.println("recvData1:"+recvData1); //첫번째 메쏘드의 반환 값 출력
													//첫번째 메쏘드 실행과 결과값 11
		System.out.println();
		
		System.out.println("main2");
		boolean recvData2 = mmr.isMarried();
		System.out.println("recvData2:"+recvData2);
		System.out.println();
		
		System.out.println("main3");
		int recvData3 = mmr.add(45564, 34234323);
		System.out.println("recvData3:"+recvData3);
		recvData3 = mmr.add(56456, 3);
		System.out.println("recvData3:"+recvData3);
		recvData3 = mmr.add(-6756, -344);
		System.out.println("recvData3:"+recvData3);
		System.out.println();
		
		
		
	}//main

}//class
