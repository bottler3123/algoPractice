package algo;

import java.util.Scanner;

public class Main_15964_이상한기호 {
	// boj Bronze5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long result = (A+B) * (A-B);
		System.out.println(result);
	}
}
