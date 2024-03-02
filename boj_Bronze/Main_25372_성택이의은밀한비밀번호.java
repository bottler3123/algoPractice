package algo;

import java.util.Scanner;

public class Main_25372_성택이의은밀한비밀번호 {
	// boj Bronze5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			if (str.length() >= 6 && str.length() <= 9) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		
	}
}
