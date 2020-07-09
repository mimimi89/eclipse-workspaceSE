
public class OuterClass {
	private InnerClass ic;
	public OuterClass() {
		
	}
	//인스턴스 멤버: 객체가 있어야 사용할 수 있음
	//static: 객체 생성과 무관하게 사용할 수 있음
	public int outer_member_field;
	
	public void outer_member_method() {
		System.out.println("OuterClass.outer_member_method()");
		
	}
	
	/*
	 * 외부클래스에서 내부클래스 사용
	 */
	public void outer_inner_use() {
		
		//InnerClass객체생성
		InnerClass innerObject=new InnerClass();
		this.ic=innerObject;
	}
	
	
	
	//Nested Class[Inner Class]
	public class InnerClass{
		
		public int inner_member_field;
		
		public void inner_member_method() {
			System.out.println("InnerClass.outer_member_method()");
			
		}
		/*
		 * InnerClass의 사용 이유
		 * 		- 내부 클래스(객체)에서 외부클래스(객체)
		 * 		  멤버에 쉽게 접근하기 위해서
		 */
		
		public void inner_outer_access() {
			outer_member_field=758973;
			outer_member_method();

		
		}
		
	}
	

}
