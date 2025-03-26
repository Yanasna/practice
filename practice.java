package practice2;

import java.io.*;
import java.util.Scanner;

public class practice{
	public static void main(String[] args) {	
		
	try {
		FileReader fr = new FileReader("C:\\Users\\yura0\\Yellow.txt");
		BufferedReader br = new BufferedReader(fr);
		
		int c;
		while((c = br.read()) != -1)
			System.out.print((char)c);   
	
		
		System.out.println("무사히 파일 가져오기 성공");
		br.close();
		fr.close();
	}catch (Exception e){
		e.printStackTrace();
		}
	}
}