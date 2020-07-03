
public class MainThreadCalled {//메인 쓰레드 호출받는 대상
	
	public void main_thread_called_method() {
		System.out.println("\t A."+Thread.currentThread().getName()+" 쓰레드 실행");
		System.out.println("\t B."+Thread.currentThread().getName()+" 쓰레드 반환");
		return;
	}
	
	
	
}
