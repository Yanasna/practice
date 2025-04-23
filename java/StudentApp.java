package dy0415;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class StudentApp extends JFrame{
	ArrayList<Student> studentList = new ArrayList<Student>();
	
	StudentApp(){
		setTitle("학생관리시스템");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(6, 2));
		
		
		JTextField inName = new JTextField("");
		JTextField inHb = new JTextField("");
		JTextField inDept = new JTextField("");
		JTextField inGwa = new JTextField("");
		JButton btnIn = new JButton("입력");
		JButton btnCancel = new JButton("취소");
		JButton btnSave= new JButton("조회 및 파일 저장");
		JButton btnSelect = new JButton("이름 검색");
		
		
		add(new JLabel("이름"));
		add(inName);
		add(new JLabel("학번"));
		add(inHb);
		add(new JLabel("학과"));
		add(inDept);
		add(new JLabel("과목"));
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
				System.out.println(strName + "입력완료");
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
		
		
		//조회 및 파일 저장 이벤트 처리
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
						System.out.println("파일 저장 완료");
					}
					fw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				// TODO Auto-generated method stub
				
			}
		});
		//이름만 보고 전체 값들 출력
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
