package practice2;

import javax.swing.*;
import java.awt.*;

public class practice_1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		
		JFrame frame = new JFrame();
		frame.setTitle("300X300 스윙 프레임 만들기");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.add(panel);
		frame.add(new JButton("OK"));
		frame.add(new JButton("Cancel"));
		frame.add(new JButton("Ignore"));
		
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}