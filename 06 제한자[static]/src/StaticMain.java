
public class StaticMain {

	public static void main(String[] args) {
		
		//객체 멤버 접근
		//참조변수(주소값)+도트, 객체 만들어 지지 않으면 접근 불가
		//정적 멤버 접근
		//클래스이름+도트, 객체 없이 접근 가능

		
			System.out.println("1.Static.static_member_field-->"+Static.static_member_field);
			Static.static_member_field=898989;
			System.out.println("2.Static.static_member_field-->"+Static.static_member_field);
			Static.static_method();
			
			Static.st1 = new Static();
			st1.instance_member_field=1;
			st1.instance_method();
			
			Static.st2 = new Static();
			st2.instance_member_field=2;
			st2.instance_method();
			
			
			System.out.println("-----------------------------------------");
			System.out.println(Static.static_member_field);
			st1.static_member_field=77777;
			System.out.println(st1.static_member_field);
			st2.static_member_field=88888;
			System.out.println(st2.static_member_field);
			
			System.out.println("-----------------------------------------");
			System.out.println(Static.static_member_field);
			System.out.println(st1.static_member_field);
			System.out.println(st2.static_member_field);
			

		
	}

}
