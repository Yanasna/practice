package practice2;

import java.util.ArrayList;
import java.util.Arrays;


public class practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int k =0;
			ArrayList<Integer> p = new ArrayList<>();
			p.add(0, 1);
			p.add(1, 2);
			p.add(2, 3);
			for(int i  : p) {	
				k = k + i;
				System.out.println(k);
				
			}

	}
}