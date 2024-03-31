package algo;

import java.util.Scanner;

public class Main_27294_몇개고 {
	// boj Bronze5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int S = sc.nextInt();
		
		if (T >= 12 && T <= 16 && S == 0) {
			System.out.println(320);
		} else {
			System.out.println(280);
		}
	}
}
