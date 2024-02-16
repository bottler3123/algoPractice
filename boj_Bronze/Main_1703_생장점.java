package algo;

import java.util.Scanner;

public class Main_1703_생장점 {
	// boj Bronze3;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			
			if (n == 0) {
				break;
			}
			
			int leef = 1;
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				leef = leef * a - b;
			}
			
			System.out.println(leef);
		}
	}
}
