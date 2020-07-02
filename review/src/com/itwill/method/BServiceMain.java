package com.itwill.method;

public class BServiceMain {

	public static void main(String[] args) {
		
			BService bService=new BService();
			bService.a();
			System.out.println("---------------------------");
			
			int ri=bService.b();
			System.out.println("public int b()메쏘드실행후 반환받은 int 데이타:"+ri);
			System.out.println("---------------------------");
			
			
			String msg = bService.c("김경호");
			System.out.println("public int c()메쏘드실행후 반환받은 String 데이타:"+msg);
			System.out.println("---------------------------");
			
			
			msg = bService.c("김수미");
			System.out.println(">>> "+msg);
			System.out.println("---------------------------");
			
			Student st=new Student();
			st.no=1;
			st.name="ONE";
			st.kor=89;
			st.eng=78;
			st.math=90;
			
			System.out.println("인자객체: "+st+", "+st.tot);
			Student recvSt=bService.d(st);
			System.out.println("반환객체: "+recvSt+", "+recvSt.tot);
			
			
			Student eSt=bService.e();
			System.out.println("반환된 Student 객체");
			System.out.println(eSt.no);
			System.out.println(eSt.name);
			System.out.println(eSt.kor);
			System.out.println(eSt.eng);
			System.out.println(eSt.math);
		
		

	}

}
