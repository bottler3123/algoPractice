package algo;

import java.util.Scanner;

public class Main_11283_한글2 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int N = str.charAt(0);

		System.out.println((int)N - 44031);
	}
}
