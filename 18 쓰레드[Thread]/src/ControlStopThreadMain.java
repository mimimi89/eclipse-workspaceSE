
public class ControlStopThreadMain {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("1.main");
		ControlStopThread cst=new ControlStopThread();
		cst.setName("stop thread");
		cst.start();
		System.out.println("2.main sleep");
		Thread.sleep(4556); 
		
		//case1: Thread.stop() 사용하지 않는 게 좋음
		//cst.stop();
		
		//case2: isPlay 변수를 false로 바꿔주면 됨
		//cst.setPlay(false);
		
		//case3: 쓰레드가 할 일을 다 하면 스스로 종료
		
		
		//join: main 쓰레드는 cst 쓰레드가 죽을 때까지 대기한다.
		cst.join();
		System.out.println("99.main return");
		
	
	}

}
