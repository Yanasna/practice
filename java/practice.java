package dy0415;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class practice extends JFrame{
	
	practice(){
		setTitle("�ǳڿ���");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		JLabel icecream = new JLabel("");
		icecream.setText("���̽�ũ���� �����ϳ���?");
		JButton jbt_1 = new JButton("Yes");
		JButton jbt_2 = new JButton("No");
		
		jbt_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				icecream.setText("��. ���̽�ũ���� �����մϴ�.");
			}
		});
		
		jbt_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				icecream.setText("�ƴϿ�. ���̽�ũ���� �������� �ʽ��ϴ�.");
			}
		});
		this.add(icecream);
		add(jbt_1);
		add(jbt_2);
		setSize(400, 300);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new practice();
	}

}
