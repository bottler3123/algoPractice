package algo;

import java.util.Scanner;

public class Main_25377_빵 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 1001;
		
		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if (A > B) {
				continue;
			} else {
				if (result > B) {
					result = B;
				}
			}
		}
		
		if (result == 1001) {
			System.out.println(-1);
		} else {
			System.out.println(result);
		}
	}
}
