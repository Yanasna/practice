package dy0415;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class practice extends JFrame{
	
	practice(){
		setTitle("판넬예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		JLabel icecream = new JLabel("");
		icecream.setText("아이스크림을 좋아하나요?");
		JButton jbt_1 = new JButton("Yes");
		JButton jbt_2 = new JButton("No");
		
		jbt_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				icecream.setText("네. 아이스크림을 좋아합니다.");
			}
		});
		
		jbt_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				icecream.setText("아니오. 아이스크림을 좋아하지 않습니다.");
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
