package practice2;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<User> users = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("이름을 입력하세요 >> ");
			String n = sc.nextLine();
			if(n.equals("그만"))
				break;	
			System.out.println("나이를 입력하세요 >> ");
			int su = Integer.parseInt(sc.nextLine());
			
			User user1 = new User(n, su);
			
			users.add(user1);
			
			
		}
		sc.close();
		try {
			FileWriter fw = new FileWriter("C:\\Users\\yura0\\test1.txt");
			BufferedWriter bw = new BufferedWriter(fw);

			
			
			for(User user : users) {
				bw.write(user.toString());
				bw.newLine();
			}
			
			bw.close();
			fw.close();
			System.out.println("파일 생성 완료!!");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생");
			
		}
	}

}

