import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.DriverManager;

public class ExceptionCatchMain {

	public static void main(String[] args) {
		
		System.out.println("stmt1-1");
		
		try {
			
			System.out.println("stmt1-2");
			Class.forName("Firsdfdfdfet");		//있는 클래스면 catch 문 안을 실행하지 않고, 없는 클래쓰면 catch 문 안을 실행
			System.out.println("stmt1-3");
			
		}catch(ClassNotFoundException e){
			
			System.out.println("catch stmt1-4 catch start");
			System.out.println("catch msg: "+e.getMessage());
			System.out.println("catch stmt1-5 catch end");
			
		}
		
		System.out.println("-------------------------------------------------------------");
		System.out.println();
		
		System.out.println("stmt2");
		
		try {
			System.out.println("stmt2-1");
			DriverManager.getConnection("");
			System.out.println("stmt2-2");
			
		} catch (Exception e) {
			System.out.println("catch stmt2-3");
			System.out.println("catch msg: "+e.getMessage());
			System.out.println("catch stmt2-4");
		}
		
		System.out.println("-------------------------------------------------------------");
		System.out.println();
		
		
		System.out.println("stmt3");
		
	
		Socket socket=null;
		try {
			
			System.out.println("stmt3-1");
			socket = new Socket("www.dfdfdfdfd.net",80);
			System.out.println(socket);
			System.out.println("stmt3-2");
		} catch (IOException e) {
			System.out.println("catch stmt3-3");
			System.out.println("catch msg: "+e.getMessage());
			System.out.println("catch stmt3-4");
			
		}
		
		System.out.println("stmt4");

	}

}
