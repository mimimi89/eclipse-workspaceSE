//22 내부클래스 참고
package event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionEventJFrame extends JFrame{
	/*
	1. 이벤트 소스 결정 :하나의 윈도우에는 여러 개의 컴포넌트가 존재할 수 있으므로
						 실제로 이벤트가 발생되면 처리할 컴포넌트를 결정한다. 
	2. 이벤트 핸들러(리스너) 클래스작성 : 
				이벤트를 실제적으로 처리할 수 있도록 
	            해당 이벤트를 처리할 이벤트 리스너 인터페이스를 
	            이용해서 이벤트 핸들러(리스너) 클래스를 작성한다. 

	3. 이벤트 소스객체와 이벤트 핸들러(리스너)객체 연결 :
	 				이벤트 리스너가 작성이되면 리스너와 이벤트 소스와 연결을 하여 
	 				이벤트 소스에서 실제적으로 이벤트가 발생이 되면 처리할수 있도록 
					addXXListener()함수를 통해 연결을 시켜준다.  
					XX부분은 해당 컴포넌트에 붙일 수 있는 리스너 이름을 의미한다.
		  
		  예를 들어 버튼에 ActionEvent을 처리하기 위하여 
		  버튼에다가 addActionListener를 붙이는 경우이다.
		  ex)버튼객체.addActionListener(핸들러객체)

	 */
	
		private JButton northB;
		private JButton southB;
	
		public ActionEventJFrame() {
			
			this.setTitle("ActionEvent");
			this.getContentPane().setLayout(new BorderLayout());
			northB=new JButton("이벤트쏘스[north]");
			southB=new JButton("이벤트쏘스[south]");
			this.getContentPane().add(northB, BorderLayout.NORTH);
			this.getContentPane().add(southB, BorderLayout.SOUTH);
			
			
			//event 처리
			northB.addActionListener(new SouthButtonActionEventHandler());
			
			this.setSize(300, 400);
			this.setVisible(true);
			
		}
		
		public static void main(String[] args) {
			new ActionEventJFrame();

		}
		
		/*************************Nested Class****************************/
		
		public class SouthButtonActionEventHandler implements ActionListener{
			private int count;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("event발생시 실행메쏘드 --> "+Thread.currentThread().getName());
				System.out.println(e);
				/*
				 * 이벤트객체로부터 이벤트쏘스객체참조얻기
				 */
				Object source = e.getSource();
				JButton sourceBtn =(JButton)source;
				count++;
				sourceBtn.setText("click count:"+count);
				int r=(int)(Math.random()*255);
				int g=(int)(Math.random()*255);
				int b=(int)(Math.random()*255);
				sourceBtn.setBackground(new Color(r,g,b));
				
				/*
				 * JFrame의 타이틀변경
				 */
				setTitle("click count:"+count);
				getContentPane().setBackground(new Color(r,g,b));
			}

		}

		
		
		
		
		
		

	

}
