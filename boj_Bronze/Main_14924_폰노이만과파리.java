package algo;

import java.util.Scanner;

public class Main_14924_폰노이만과파리 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int T = sc.nextInt();
		int D = sc.nextInt();
		
		int result = D / (S * 2) * T;
		System.out.println(result);
	}
}
