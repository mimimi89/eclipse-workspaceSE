///
import com.itwill.shop.ShopService;
import com.itwill.shop.member.Member;
import com.itwill.shop.member.MemberService;
import com.itwill.shop.order.Order;
//줄인 클래스의 이름이 동일한 클래스는 import문에 2개 동시에 기술할 수 없다

//import com.itwill.shop.member.*;
//com.itwill.shop.member package에 있는 모든 클래스를 import 한다.
//하지만 com.itwill.shop.member package의 하위 package에 있는 클래스를 import하지는 않음

public class PackagrImportMain {

	public static void main(String[] args) {

		Member m1=new Member();
		System.out.println(m1);
		
		MemberService memberService=new MemberService();
		System.out.println(memberService);
		
		com.itwill.shop.admin.Member am1=
				new com.itwill.shop.admin.Member();
		System.out.println(am1);
		
		Order order=new Order();
		//ctrl+shift+o 자동 import 가능
		System.out.println(order);
		
		ShopService shopService=new ShopService();
		System.out.println(shopService);
		
		
		
	}

}
