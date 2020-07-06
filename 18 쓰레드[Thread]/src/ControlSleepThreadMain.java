
public class ControlSleepThreadMain {

	public static void main(String[] args) {

		System.out.println("1.main");
		ControlSleepThread controlSleepThread=new ControlSleepThread();
		controlSleepThread.setName("sleep thread");
		controlSleepThread.start();
		
		System.out.println("99.main thread return --> JVM");
		
		
	}

}
