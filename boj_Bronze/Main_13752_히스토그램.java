package algo;

import java.util.Scanner;

public class Main_13752_히스토그램 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int t = 0; t < T; t++) {
			int n = sc.nextInt();
			
			for (int i = 0; i < n; i++) {
				System.out.print("=");
			}
			System.out.println();
		}
	}
}
