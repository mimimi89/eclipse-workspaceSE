import java.io.IOException;

public class First {
	
	private Second second=new Second();

	public void method1() throws IOException, ClassNotFoundException {
		System.out.println("\t first.methode1() 실행");
		second.method2();
		System.out.println("\t first.methode1() 반환");
		return;
		
	
		
	}

}
