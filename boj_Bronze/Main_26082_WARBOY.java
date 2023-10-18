package algo0408;

import java.util.Scanner;

public class Main_26082_WARBOY {
	// boj Bronze5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int result = B / A * 3 * C;
		System.out.println(result);
	}
}
