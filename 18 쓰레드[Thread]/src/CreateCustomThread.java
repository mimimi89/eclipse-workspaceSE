
public class CreateCustomThread extends Thread {
	
	@Override
	//ctrl+space+enter
	public void run() {
		while(true) {
			System.out.println("가."+Thread.currentThread().getName()+"쓰레드");
			System.out.println("나."+Thread.currentThread().getName()+"쓰레드 return");
			
		}
	
	}

}
