
public class ControlStopThread extends Thread{
	
	
	private int count;
	boolean isPlay;

	
	public ControlStopThread() {
		count = 0;
		isPlay = true;
	}


	@Override
	public void run() {
		while(isPlay) {
			
			try {
				System.out.println("ControlStopThread: "+count);
				Thread.sleep(500);
				count++;
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
	}

}
