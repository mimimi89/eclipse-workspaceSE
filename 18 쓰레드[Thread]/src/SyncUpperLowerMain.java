
public class SyncUpperLowerMain {

	public static void main(String[] args) {
		Object monitor=new Object();
		SyncUpperThread ut=new SyncUpperThread(monitor);
		SyncLowerThread lt=new SyncLowerThread(monitor);
		ut.start();
		lt.start();
		
		
	}

}
