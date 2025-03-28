package practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int k =0;
			ArrayList<Integer> p = new ArrayList<>();
			Scanner sc = new Scanner(System.in);
			System.out.print("몇개의 수 입력 ? :: ");
			int su = sc.nextInt();
			for(int l = 0; l < su ; l++) {
			System.out.print((l+1) + "번째 : ");
			int o = sc.nextInt();
			p.add(l, o);
			System.out.println();
			}
			for(int i  : p) {	
				k = k + i;
				System.out.println(k);
				
			}

	}
}