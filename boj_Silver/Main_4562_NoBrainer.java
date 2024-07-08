package algo;

import java.util.Scanner;

public class Main_4562_NoBrainer {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a < b) {
				System.out.println("NO BRAINS");
			} else {
				System.out.println("MMM BRAINS");				
			}
		}
	}
}
