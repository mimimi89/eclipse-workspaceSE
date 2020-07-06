
public class SyncUpperThread extends Thread{
	//대문자를 찍는 쓰레드
	private Object monitor;
	public SyncUpperThread(Object monitor) {
		this.monitor=monitor;
	}
	
	
	
	@Override
	public void run() {
		while(true) {
			synchronized (this.monitor) {
				System.out.print("A");
				System.out.print("B");
				System.out.print("C");
				System.out.print("D");
				System.out.print("E");
				System.out.print("F");
				System.out.print("G");
				System.out.print("H");
				System.out.print("I");
				System.out.print("J");
				System.out.print("K");
				System.out.print("L");
				System.out.print("M");
				System.out.print("N");
				System.out.print("O");
				System.out.print("P");
				System.out.print("Q");
				System.out.print("R");
				System.out.print("S");
				System.out.print("T");
				System.out.print("U");
				System.out.print("V");
				System.out.print("W");
				System.out.print("X");
				System.out.print("Y");
				System.out.print("Z");
				
			}//동기화 블록의 끝
			
		}//while 끝
		
	}//run method 끝
	
}//class 끝
