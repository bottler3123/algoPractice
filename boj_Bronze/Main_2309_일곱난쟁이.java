package algo0408;

import java.util.*;

public class Main_2309_일곱난쟁이 {
	// boj Bronze1
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] shotman = new int [9];
		int result = 0;
		
		for (int i = 0; i < 9; i++) {
			shotman[i] = sc.nextInt();
			result += shotman[i];
		}
		Arrays.sort(shotman);
		
		for (int i = 0; i < 9; i++) {
			for (int j = i+1; j < 9; j++) {
				if (shotman[i]+shotman[j] == result - 100) {
					shotman[i] = -1;
					shotman[j] = -1;
				}
			}
		}
		
		for (int i = 0; i < 9; i++) {
			if (shotman[i] != -1) {
				System.out.println(shotman[i]);
			}
		}
	}
}
