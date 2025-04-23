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
		
		JButton bt1 = new JButton("로그인");
		JButton bt2 = new JButton("취소");
		
		bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String em = email.getText();
				String pw = passwd.getText();
				if(em.equals("hong@google.com") && pw.equals("1234"))
					System.out.println("로그인되었습니다.");
				else
					System.out.println("이메일과 비밀번호를 다시 입력하세요!");
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
		
		add(new JLabel("이메일"));
		add(email);
		add(new JLabel("비밀번호"));
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
