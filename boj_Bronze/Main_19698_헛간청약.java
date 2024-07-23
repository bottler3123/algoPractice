package algo;

import java.util.Scanner;

public class Main_19698_헛간청약 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		int H = sc.nextInt();
		int L = sc.nextInt();
		
		int result = (W / L) * (H / L);
		if (result > N) {
			result = N;
		}
		
		System.out.println(result);
	}
}
