package algo0408;

import java.util.*;

public class Main_1547_공 {
	// boj Bronze3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		boolean [] cup = new boolean [4];
		cup[1] = true;
		for (int t = 0; t < T; t++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			boolean temp = false;
			temp = cup[a];
			cup[a] = cup[b];
			cup[b] = temp;
		}
		
		for (int i = 1; i < 4; i++) {
			if (cup[i]) {
				System.out.println(i);
			}
		}
	}
}
