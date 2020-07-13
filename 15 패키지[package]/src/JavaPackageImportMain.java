///
import java.awt.Frame;
import java.awt.List;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.sql.Connection;

import com.itwill.shop.ShopService;
import com.itwill.shop.admin.Member;
import com.itwill.shop.order.Order;

public class JavaPackageImportMain {

	public static void main(String[] args) {
		
		
		//java.lang package에 소속된 클래스들은 import 구문 생략 가능
		System.out.println("------------java.lang package-------------");
		java.lang.String str="str1";
		//java.lang 생략 가능
		String str2="str2";
		Math math;
		
		System.out.println("-----------java.lang 이외의 package---------");
		InputStream in;
		OutputStream out;
		Frame f;
		List list;
		Socket socket;
		Connection con;
		
		System.out.println("--------------업무 package------------");
		ShopService shopservice;
		Member member;
		Order order;
		
		
		
		
		
		
		
	}
	

}
