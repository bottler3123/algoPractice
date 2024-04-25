package algo;

import java.util.Scanner;

public class Main_28113_정보섬의대중교통 {
	// boj Bronze5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A > B) {
			System.out.println("Subway");
		} else if (B > A) {
			System.out.println("Bus");
		} else {
			System.out.println("Anything");
		}
	}
}
