///
import java.io.IOException;
import java.net.Socket;

public class Second {
	
	public void method2() throws IOException, ClassNotFoundException{
		System.out.println("\t\t second.method2() 실행");
		/*************** case1 *****************/
		/*
		1. JVM이 지켜보고 있다가 예외상황을 감지하고 예외 객체를 생성
		2. 생성한 예외 객체를 반환방향(호출의 반대 방향)으로 던진다.
		3. 이때 실행 중인 쓰레드는 실행을 멈추고 예외의 기작(machanism)이 시작된다.
		*/
		String str="";
		int length=str.length();
		
		
		/*************** case2 *****************/
		/*
		1. 예외객체생성
		2. 예외객체를 던진다.
		3. 이때 실행 중인 쓰레드는 실행을 멈추고 예외의 기작(machanism)이 시작된다.
		*/
		boolean b=true;
		if(b) {
			NullPointerException exception=
					new NullPointerException("널애로사항발생");
			throw exception;
			
		}
		
		
		/*************** case3 *****************/
		/*
		* 예외 발생시키는 코드가 있는 메쏘드를 호출했을 경우,
		*/
		Socket socket=new Socket();
		socket.getInputStream();
		
		Class.forName("xxx");
		
		
		System.out.println("\t\t second.method2() 반환");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
