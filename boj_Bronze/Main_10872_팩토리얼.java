package algo0408;

import java.util.Scanner;

public class Main_10872_팩토리얼 {
	// boj Bronze5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 1;
		
		if (N == 0) {
			System.out.println(1);
		} else {
			for (int i = 1; i <= N; i++) {
				result *= i;
			}
			System.out.println(result);
		}
		
	}
}
