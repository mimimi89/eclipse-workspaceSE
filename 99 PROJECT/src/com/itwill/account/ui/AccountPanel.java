package com.itwill.account.ui;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTabbedPane;

public class AccountPanel extends JPanel {
	private JTabbedPane accountTP;

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
