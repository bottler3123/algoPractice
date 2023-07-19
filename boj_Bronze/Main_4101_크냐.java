package algo0408;

import java.util.Scanner;

public class Main_4101_크냐 {
	// boj Bronze5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if (A > B) {
				System.out.println("Yes");
			} else if (A == 0 && B == 0) {
				break;
			} else {
				System.out.println("No");
			}
		}
	}
}
