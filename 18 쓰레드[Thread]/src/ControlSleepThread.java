
public class ControlSleepThread extends	Thread {
	
	@Override
	public void run() {
		
		while(true) {
			
			try {
				System.out.println("가."+Thread.currentThread().getName());
				//현재 실행 쓰레드를 1000ms동안 sleep 시킨다.
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
