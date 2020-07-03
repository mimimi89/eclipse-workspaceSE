
public class CreateCustomThreadMain {

	public static void main(String[] args) {
		
		System.out.println("1.main");

		CreateCustomThread cct=new CreateCustomThread();
		//3. Thread 객체를 생성한다.
		System.out.println("2.main");
		cct.setName("myThread");
		cct.start();
		//4. Thread 객체를통해서 Thread를 시작시킨다.
		//Thread 시작하는 메쏘드 start
		//Thread 실행하는 메쏘드 start
		/*
		 - Causes this thread to begin execution; 
		 the Java Virtual Machinecalls the run method of this thread. 
		 
		 - The result is that two threads are running concurrently:
		 the current thread (which returns from the call to the start method)
		 and the other thread (which executes its run method). 

		 */
		while(true) {
			System.out.println("3.main");
			
		}
		
		
		
		
	}

}
