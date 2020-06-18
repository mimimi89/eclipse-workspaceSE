
public class LocalVariableInitialization {
	
	public void method1(){
		System.out.println("new LocalVariableInitialization.method1 실행");
		int a=9;
		int b=10;
		int tot;
		//초기화 작업을 거치지 않으면 11항과 같은 오류
		
		
		//tot=tot+a;
		
		tot=0;
		tot=tot+a;
		
		System.out.println(tot);
		
		
		
	}

}
