
public class LocalVariableInitializationMain {

	public static void main(String[] args) {
		
		int a = 9;
		int b = 10;
		
		int t = a;
		a = b;
		b = t;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		//참조변수는 주소값, 주소값 변경을 위해 위의 내용 연습
		
		int tot;
		tot=0;
		tot=tot+1;
		System.out.println("tot="+tot);
		
		//로컬변수는 반드시 초기화해야 함
		
		LocalVariableInitialization m1=new LocalVariableInitialization(1, "KIM");
		m1.print();
		
		LocalVariableInitialization m2=null;
		//null: 객체주소 리터럴
		//			-참조 변수 초기화의 용도로 사용
		//			-주소 값이 없다라는 값
		if(m2==null) {
			m2=new LocalVariableInitialization(2,"LEE");
			m2.print();
		}else {
			m2.print();
			
		}
		
		System.out.println("-----------------------------------------------------------------");
		
		LocalVariableInitialization m3=new LocalVariableInitialization(3, "SAM");
		LocalVariableInitialization m4=null;
		m4=m3;
		m3.print();
		m4.print();
		if(m4==m3) {
			System.out.println("m3와 m4의 주소값이 동일하다.");
			
		}else {
			System.out.println("m3와 m4의 주소값이 동일하지 않다.");
		
		}
		System.out.println("-----------------------------------------------------------------");
		
		LocalVariableInitialization firstMember=new LocalVariableInitialization(1111, "FIRST");
		LocalVariableInitialization secondMember=new LocalVariableInitialization(2222, "SECOND");
		firstMember.print();
		secondMember.print();
		
		LocalVariableInitialization tempMember=firstMember;
		firstMember=secondMember;
		secondMember=tempMember;
		firstMember.print();
		secondMember.print();
		
		
		
	
				
		
		
		

	}

}
