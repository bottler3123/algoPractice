package algo;

import java.util.Scanner;

public class Main_9295_주사위 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int t = 0; t < T; t++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("Case " + (t+1) + ": " + (a+b));
		}
	}
}
