package algo;

import java.util.Scanner;

public class Main_13136_DoNotTouchAnything {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long R = sc.nextLong();
		long C = sc.nextLong();
		long N = sc.nextLong();
		
		R = R % N > 0 ? R / N + 1 : R / N;
		C = C % N > 0 ? C / N + 1 : C / N;
		
		System.out.println(R * C);
	}
}
