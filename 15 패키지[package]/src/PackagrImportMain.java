import com.itwill.shop.ShopService;
import com.itwill.shop.member.Member;
import com.itwill.shop.member.MemberService;
import com.itwill.shop.order.Order;

/*
 * import com.itwill.shop.member.*;
 * com.itwill.shop.member package에 있는 모든 클래스를 import 한다.
 * 하지만 com.itwill.shop.member package의 하위 package에 있는 클래스를 import하지는 않음
 */




public class PackagrImportMain {

	public static void main(String[] args) {

		Member m1=new Member();		//객체 생성
		System.out.println(m1);		//m1의 주소값 출력
		
		MemberService memberService=new MemberService();		//객체 생성
		System.out.println(memberService);		//memberService의 주소값 출력
		
		com.itwill.shop.admin.Member am1=new com.itwill.shop.admin.Member();		//객체 생성(풀네임 기술시에는 import 필요 없음)
		System.out.println(am1);		//am1의 주소값 출력
		
		Order order=new Order();		//객체 생성
		System.out.println(order);		//order의 주소값 출력
		//ctrl+shift+o 자동 import 가능
		
		ShopService shopService=new ShopService();		//객체 생성
		System.out.println(shopService);		//shopService의 주소값 출력
		
		
		
	}

}
