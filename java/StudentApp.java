package dy0415;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class StudentApp extends JFrame{
	ArrayList<Student> studentList = new ArrayList<Student>();
	
	StudentApp(){
		setTitle("�л������ý���");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(6, 2));
		
		
		JTextField inName = new JTextField("");
		JTextField inHb = new JTextField("");
		JTextField inDept = new JTextField("");
		JTextField inGwa = new JTextField("");
		JButton btnIn = new JButton("�Է�");
		JButton btnCancel = new JButton("���");
		JButton btnSave= new JButton("��ȸ �� ���� ����");
		JButton btnSelect = new JButton("�̸� �˻�");
		
		
		add(new JLabel("�̸�"));
		add(inName);
		add(new JLabel("�й�"));
		add(inHb);
		add(new JLabel("�а�"));
		add(inDept);
		add(new JLabel("����"));
		add(inGwa);
		
		
		
		add(btnIn);
		add(btnCancel);
		add(btnSave);
		add(btnSelect);
		
		btnIn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String strName = inName.getText();
				String strHb = inHb.getText();
				String strDept = inDept.getText();
				String strGwa = inGwa.getText();
				studentList.add(new Student(strName, strHb, strDept, strGwa));
				System.out.println(strName + "�Է¿Ϸ�");
			}
		});
		
		btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				inName.setText("");
				inHb.setText("");
				inDept.setText("");
				inGwa.setText("");
			}
		});
		
		
		//��ȸ �� ���� ���� �̺�Ʈ ó��
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileWriter fw;
				try {
					fw = new FileWriter("C:\\Users\\313\\Documents\\newFile\\20221053.txt");
					for(Student one : studentList) {
						System.out.println(one);
						//fw.write(one.toString());
						fw.write(one.getName() + ", " +one.getHb() + ", " + one.getDept() +", "
						+ one.getGwa() + "\n");
						System.out.println("���� ���� �Ϸ�");
					}
					fw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				// TODO Auto-generated method stub
				
			}
		});
		//�̸��� ���� ��ü ���� ���
		btnSelect.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//if(inName.getName().equals(studenList.strName)) {
					
				//}
			}
		});
		
		setSize(300, 300);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StudentApp();
	}

}
