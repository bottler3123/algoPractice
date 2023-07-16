package algo0408;

import java.util.Scanner;

public class Main_4999_아 {
	// boj Bronze5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		
		if (A.length() >= B.length()) {
			System.out.println("go");
		} else {
			System.out.println("no");
		}
	}
}
