
public class OuterClassMain {

	public static void main(String[] args) {

			OuterClass oc=new OuterClass();
			oc.outer_member_field=9090;
			oc.outer_member_method();
			
			OuterClass.InnerClass ic=oc.new InnerClass();
			ic.inner_member_field=7878;
			ic.inner_member_method();
			
			/*
			 * InnerClass의 사용 이유
			 * 		- 내부 클래스(객체)에서 외부클래스(객체)
			 * 		  멤버에 쉽게 접근하기 위해서
			 */
			
			
			
			
			
		
		
	}

}
