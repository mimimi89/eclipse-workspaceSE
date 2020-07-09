package paint;

import java.awt.Graphics;

import javax.swing.JFrame;

public class PaintFrame extends JFrame {

		
		public PaintFrame() {
			setSize(300, 400);
			setVisible(true);
			
		}
		
		/*
		public void paint(Graphics g)
			- Paints this component.
			- This method is called when the contents of the component should be painted;
			   such as when the component is first being shown 
			   or is damaged and in need of repair.
		 */
		
		
		@Override
		public void paint(Graphics g) {
			super.paintAll(g);
			System.out.println("paint thread: "+Thread.currentThread().getName());
			System.out.println("");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public static void main(String[] args) {
		
		
		
		
	}

}
