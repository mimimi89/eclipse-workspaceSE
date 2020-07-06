package basic;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;

import javax.swing.JButton;
import javax.swing.JFrame;

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

public class ChildJFrame extends JFrame {
	
	private JButton btn1;
	private JButton btn2;
	
	public ChildJFrame() {
		System.out.println(">>>"+Thread.currentThread().getName()+" 쓰레드");
		this.setTitle("상속에의한 JFrame준비");
		Container contentPane=this.getContentPane();
		this.getContentPane().setBackground(new Color(125,125,0));
		contentPane.setCursor(new Cursor(Cursor.HAND_CURSOR));
		this.setSize(300, 400);
		
		contentPane.setLayout(null);
		
		//4. 컴포넌트 생성(컨테이너의 멤버변수) 작업
		btn1=new JButton("확인");
		btn2=new JButton("취소");
		
		btn1.setBounds(50, 280, 80, 30);
		btn2.setBounds(140, 280, 80, 30);
		
		
		
		//5. 컨테이너에 컴포넌트 붙이기(ADD)
		contentPane.add(btn1);
		contentPane.add(btn2);
		
		//6. 컨네이너 객체 보여주기
		this.setVisible(true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
