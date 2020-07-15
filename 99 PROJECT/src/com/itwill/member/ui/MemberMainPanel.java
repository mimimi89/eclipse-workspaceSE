package com.itwill.member.ui;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.AbstractListModel;
import javax.swing.table.DefaultTableModel;

public class MemberMainPanel extends JPanel {
	JTabbedPane memberTapPane;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public MemberMainPanel() {
		setLayout(new BorderLayout(0, 0));
		
		memberTapPane = new JTabbedPane(JTabbedPane.TOP);
		memberTapPane.setBackground(Color.LIGHT_GRAY);
		add(memberTapPane, BorderLayout.CENTER);
		
		JPanel memberListP = new JPanel();
		memberListP.setBackground(Color.ORANGE);
		memberTapPane.addTab("회원리스트", null, memberListP, null);
		memberListP.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"xxx", "yyy", "aaa", "bbb", "ccc"}));
		comboBox.setBounds(12, 29, 95, 31);
		memberListP.add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 70, 95, 141);
		memberListP.add(scrollPane);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"xxx", "yyy", "aaa", "bbb", "ccc"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(110, 29, 323, 184);
		memberListP.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"\uC544\uC774\uB514", "\uC774\uB984", "\uB098\uC774 ", "\uC8FC\uC18C", "\uACB0\uD63C\uC5EC\uBD80 "
			}
		));
		scrollPane_1.setViewportView(table);
		memberTapPane.setEnabledAt(0, false);
		
		JPanel memberDetailP = new JPanel();
		memberDetailP.setBackground(Color.ORANGE);
		memberTapPane.addTab("회원상세보기", null, memberDetailP, null);

	}
}
