
public class LocalVariableInitializationMain {

	public static void main(String[] args) {
		
		int a=9;
		int b=10;
		int c; 
		//main 안에서 실행된 local 변수는 반드시 초기화(대입)가 필요함
		//그래서 14항, 19항에 오류 발생
		
		System.out.println(a);
		System.out.println(b);
		//System.out.println(c);
		
		if (a>b) {
			c = 9090;
		}
		//System.out.println(c);
		
		if(a<b) {
			c=9090;
		}else {
			c=-9999;
		}
		System.out.println(c);
		
		LocalVariableInitialization m1=new LocalVariableInitialization();
		m1.method1();
		
		LocalVariableInitialization m2=null;
		//null:객체주소 리터럴
		//주소가 없다는 값, 객체 주소값 초기화의 용도로 사용 
		if(m2==null) {
			m2=new LocalVariableInitialization();
			m2.method1();
		}else {
			m2.method1();
			
		}
		
		
	
				
		
		
		

	}

}
