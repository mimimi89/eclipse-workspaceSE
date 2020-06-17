
public class MemberMethodReturn {

	int method1() {
		System.out.println("MemberMethodReturn.method1() 실행");
		
		int result=2+9;	
			
		//실행흐름을 호출한 곳으로 반환
		//실행흐름을 호출한 곳으로 데이타 반화
		//
		//return할 데이타가 있는 경우에는 return문을 생략할 수 없음, 반드시 기술해야 함.
				
		return result;
		
	}
	
	boolean isMarried() {
		System.out.println("MemberMethodReturn.isMarried() 실행");
		
		return false;
		
	}
	
	int add(int a, int b) {
		System.out.println("MemberMethodReturn.add(int a, int b) 실행");
					
		int o=a+b;
		
		return o; 
		
	}
	
}
