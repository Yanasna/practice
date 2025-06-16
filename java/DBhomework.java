package practice2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBhomework extends JFrame{
	JButton btnInsert, btnDelete, btnUpdate, btnSelect, btnSearch, btnOut;
	JTextField name, phone, comName;
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	FileWriter fout = null;
	
	public DBhomework() {
		setTitle("homework");
		setLayout(new GridLayout(6,2));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		createGUI();
		
		btnInsert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dbInsert();
			}
		});
		btnDelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dbDelete();
			}
		});
		btnSelect.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dbSelect();
			}
		});
		btnSearch.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dbSearch();
			}
		});
		btnUpdate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dbUpdate();
			}
		});
		btnOut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dbOut();
			}
		});
		setSize(300, 500);
		setVisible(true);
	}
	
	public void createGUI() {
		add(new JLabel("이름"));
		name = new JTextField(20);
		add(name);
		add(new JLabel("전화번호"));
		phone = new JTextField(20);
		add(phone);
		add(new JLabel("회사 이름"));
		comName = new JTextField(20);
		add(comName);
		
		btnInsert = new JButton("입력");
		add(btnInsert);
		btnSelect= new JButton("조회");
		add(btnSelect);
		btnSearch = new JButton("검색");
		add(btnSearch);
		btnUpdate = new JButton("수정");
		add(btnUpdate);
		btnDelete = new JButton("삭제");
		add(btnDelete);
		btnOut = new JButton("종료");
		add(btnOut);
		
	}
	
	public void dbSearch() {
		try {
			conn = DBConn.dbConnection();
			String searchText = name.getText().toString();
			String searchSql = "";
			searchSql = "select * from addrtbl where name = ?;";	
			
			pstmt = conn.prepareStatement(searchSql);
			pstmt.setString(1,  searchText);
			rs = pstmt.executeQuery();
			
			String line = "";
			System.out.println("        name          tel           com     \n");
			System.out.println("-----------------------------------------------");		
			while(rs.next()) {
				String name = rs.getString("name");
				String tel = rs.getString("tel");
				String comName = rs.getString("com");
				line = "   |   "  + name  + "  |  " + tel + "  |  " + comName + "\n";
				System.out.println(line);
			}
			
			rs.close();
			pstmt.close();
			conn.close();
		}

		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void dbSelect() {
		try {
			conn = DBConn.dbConnection();

			String sql = "select * from addrtbl;";
		
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			String line = "";
			System.out.println("        name          tel           com     \n");
			System.out.println("-----------------------------------------------");		
			while(rs.next()) {
				String name = rs.getString("name");
				String tel = rs.getString("tel");
				String comName = rs.getString("com");
				line = "   |   "  + name  + "  |  " + tel + "  |  " + comName + "\n";
				System.out.println(line);
			}
			
			rs.close();
			pstmt.close();
			conn.close();
		}

		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void dbUpdate() {
		try {
			conn = DBConn.dbConnection();

			String sql = "update addrtbl set tel = ?, com = ? where name = ?;";
			String in_name = name.getText().toString();
			String in_tel = phone.getText().toString();
			String in_comName = comName.getText().toString();
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, in_tel);
			pstmt.setString(2, in_comName);
			pstmt.setString(3, in_name);
			pstmt.executeUpdate();
			System.out.println(in_name + "수정완료");
			
			name.setText("");
			phone.setText("");
			comName.setText("");
			
			pstmt.close();
			conn.close();
		}

		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void dbInsert() {
		try {
			conn = DBConn.dbConnection();

			
			String in_name = name.getText().toString();
			String in_tel = phone.getText().toString();
			String in_comName = comName.getText().toString();
			String sql = "insert into addrtbl(name, tel, com) values(?, ?, ?);";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, in_name);
			pstmt.setString(2, in_tel);
			pstmt.setString(3, in_comName);
			
			pstmt.executeUpdate();
			System.out.println(in_name + "입력완료");
			
			name.setText("");
			phone.setText("");
			comName.setText("");
			
			pstmt.close();
			conn.close();
		}

		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void dbDelete() {
		try {
			conn = DBConn.dbConnection();

			
			String in_name = name.getText().toString();
			String sql = "delete from addrtbl where name = ?;";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, in_name);
			pstmt.executeUpdate();
			System.out.println(in_name + "삭제완료");
			
			name.setText("");
			phone.setText("");
			comName.setText("");
			
			pstmt.close();
			conn.close();
		}

		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void dbOut() {
		System.exit(0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DBhomework();
	}

}
