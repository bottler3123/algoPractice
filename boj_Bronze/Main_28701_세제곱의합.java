package algo;

import java.util.Scanner;

public class Main_28701_세제곱의합 {
	// boj Bronze5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;
		int result2 = 0;
		
		for (int i = 1; i <= N; i++) {
			result += i;
		}
		
		result2 = result * result;
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result2);
	}
}
