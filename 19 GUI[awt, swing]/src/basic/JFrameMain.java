package basic;

import java.awt.Color;

import javax.swing.JFrame;

public class JFrameMain {

	public static void main(String[] args) {
		
		/*
		 * 	>>>GUI 프로그래밍 방법<<<
		 * 
		 * 1. 컨테이너 클래스(JFrame) 준비
		 * 2. 컨테이너 클래스에 객체 생성
		 * 3. 컨테이너 객체의 크기 설정
		 * 4. 컴포넌트 생성(컨테이너의 멤버변수)
		 * 5. 컨테이너에 컴포넌트 붙이기(ADD)
		 * 6. 컨네이너 객체 보여주기
		 */
		
		/*
		 * 	>>>클래스를 사용하려면?<<<
		 * 1. 포함
		 * 2. 상속
		 * 두 가지 방법 밖에 없음
		 */
		
		JFrame f=new JFrame();
		f.setTitle("my first frame");
		f.getContentPane().setBackground(new Color(0, 0, 255));
		f.setSize(300, 400);
		f.setVisible(true);
		
		/*
		 * Frame.setVisible(true)
		 * 	- 호출되면 GUI(awt) thread 생성
		 * 	- GUI(awt) thread는 무한 대기하면서
		 * 	 GUI 컴포넌트 이벤트 처리와 그래픽(페인트) 처리를 담당
		 * 	- GUI 컴포넌트는 계속 떠 있다.
		 * 	 (JVM이 종료되지 않음을 의미한다.)
		 */
		
		
		
		

	}

}
