package com.itwill.account.ui;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class AccountPanel extends JPanel {
	private JTabbedPane accountTP;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public AccountPanel() {
		setBackground(Color.PINK);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("계좌추가");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accountTP.setSelectedIndex(0);
			}
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("계좌리스트");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accountTP.setSelectedIndex(1);
			}
		});
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("계좌찾기");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accountTP.setSelectedIndex(2);
			}
		});
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("입금");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accountTP.setSelectedIndex(3);
			}
		});
		panel.add(btnNewButton_3);
		
		accountTP = new JTabbedPane(JTabbedPane.TOP);
		add(accountTP, BorderLayout.CENTER);
		
		JPanel addP = new JPanel();
		addP.setBackground(Color.PINK);
		addP.setForeground(Color.WHITE);
		accountTP.addTab("계좌추가", null, addP, null);
		addP.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("번호");
		lblNewLabel_1.setBounds(125, 39, 57, 15);
		addP.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setBounds(125, 79, 57, 15);
		addP.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("잔고");
		lblNewLabel_3.setBounds(125, 119, 57, 15);
		addP.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("이율");
		lblNewLabel_4.setBounds(125, 159, 57, 15);
		addP.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(215, 36, 116, 21);
		addP.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(215, 76, 116, 21);
		addP.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(215, 116, 116, 21);
		addP.add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0.1", "0.2", "0.3", "0.4", "0.5", "0.6", "0.7", "0.8"}));
		comboBox.setBounds(215, 156, 116, 21);
		addP.add(comboBox);
		
		JButton btnNewButton_4 = new JButton("추가");
		btnNewButton_4.setBounds(110, 205, 97, 23);
		addP.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("취소");
		btnNewButton_5.setBounds(250, 205, 97, 23);
		addP.add(btnNewButton_5);
		
		JPanel listP = new JPanel();
		listP.setBackground(Color.ORANGE);
		listP.setForeground(Color.WHITE);
		accountTP.addTab("계좌리스트", null, listP, null);
		listP.setLayout(null);
		
		JPanel serchP = new JPanel();
		serchP.setBackground(Color.YELLOW);
		serchP.setForeground(Color.WHITE);
		accountTP.addTab("계좌찾기", null, serchP, null);
		serchP.setLayout(null);
		
		JPanel depositP = new JPanel();
		depositP.setBackground(Color.GREEN);
		depositP.setForeground(Color.WHITE);
		accountTP.addTab("입금", null, depositP, null);
		depositP.setLayout(null);
		
		accountTP.setSelectedIndex(3);

	}
}
