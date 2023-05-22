package algo0408;

import java.util.Scanner;

public class Main_11022_AplusB8 {
	// boj Bronze5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println("Case #" + i +": " + A + " + " + B + " = " + (A+B));
		}
		
	}
}
