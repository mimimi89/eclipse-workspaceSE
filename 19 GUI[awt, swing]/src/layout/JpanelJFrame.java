package layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class JpanelJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JpanelJFrame frame = new JpanelJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JpanelJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 377);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 160, 122));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel SouthMenu = new JPanel();
		FlowLayout fl_SouthMenu = (FlowLayout) SouthMenu.getLayout();
		fl_SouthMenu.setVgap(10);
		fl_SouthMenu.setHgap(20);
		fl_SouthMenu.setAlignOnBaseline(true);
		SouthMenu.setBackground(new Color(102, 205, 170));
		contentPane.add(SouthMenu, BorderLayout.SOUTH);
		
		JButton btnNewButton_3 = new JButton("추 가");
		SouthMenu.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("리스트");
		SouthMenu.add(btnNewButton_4);
		
		JButton btnNewButton_2 = new JButton("수 정");
		SouthMenu.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("삭 제");
		SouthMenu.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("찾 기");
		SouthMenu.add(btnNewButton);
		
		JPanel WestList = new JPanel();
		WestList.setBackground(new Color(30, 144, 255));
		contentPane.add(WestList, BorderLayout.WEST);
		WestList.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("접속자 리스트");
		WestList.add(lblNewLabel, BorderLayout.NORTH);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"김경호", "신명숙", "김태희", "고소영", "이소라", "이효리"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		WestList.add(list, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		WestList.add(panel_2, BorderLayout.SOUTH);
		
		JPanel Center = new JPanel();
		Center.setBackground(new Color(154, 205, 50));
		contentPane.add(Center, BorderLayout.CENTER);
		Center.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("이름");
		lblNewLabel_1.setBounds(27, 68, 57, 15);
		Center.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("전화번호");
		lblNewLabel_2.setBounds(27, 109, 57, 15);
		Center.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("주소");
		lblNewLabel_3.setBounds(27, 150, 57, 15);
		Center.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(113, 65, 116, 21);
		Center.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(113, 106, 116, 21);
		Center.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(113, 147, 116, 21);
		Center.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("자기소개");
		lblNewLabel_3_1.setBounds(27, 192, 57, 15);
		Center.add(lblNewLabel_3_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(113, 183, 116, 56);
		Center.add(textArea);
	}
}
