package practice2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class practice_2 extends JFrame{

	practice_2(){
		setTitle("안녕");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(4, 1);
		grid.setVgap(5);
		
		setLayout(grid);
		
		JLabel texter = new JLabel("초기값이요!");
		TextField hihi = new TextField("");
		add(hihi);
		JButton hi = new JButton("안녕");
		JButton bye = new JButton("잘가");
		
		hi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String strhihi = hihi.getText();
				System.out.println("작성한 글 : " + strhihi);
				texter.setText("안녕!!");
			}
		});
		
		bye.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				texter.setText("잘가용~^^");
				hihi.setText(" ");
			}
		});
		add(texter);
		add(hihi);
		add(hi);
		add(bye);
		setSize(300, 200);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new practice_2();
	}

}
