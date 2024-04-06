package algo;

import java.util.Scanner;

public class Main_27959_초코바 {
	// boj Bronze5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		if ((N * 100) - M >= 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
