package dy0415;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class practice2 extends JFrame{
	
	practice2(){
		setTitle("Login Form");
		GridLayout grid = new GridLayout(3, 2);
		grid.setVgap(5);
		setLayout(grid);
		
		TextField email = new TextField("");
		
		TextField passwd = new TextField("");
		
		JButton bt1 = new JButton("�α���");
		JButton bt2 = new JButton("���");
		
		bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String em = email.getText();
				String pw = passwd.getText();
				if(em.equals("hong@google.com") && pw.equals("1234"))
					System.out.println("�α��εǾ����ϴ�.");
				else
					System.out.println("�̸��ϰ� ��й�ȣ�� �ٽ� �Է��ϼ���!");
			}
			
		});
		
		bt2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				email.setText("");
				passwd.setText("");
			}
		});
		
		add(new JLabel("�̸���"));
		add(email);
		add(new JLabel("��й�ȣ"));
		add(passwd);
		add(bt1);
		add(bt2);
		
		setSize(300, 200);
		setVisible(true);
	}
	
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new practice2();
	}

}
