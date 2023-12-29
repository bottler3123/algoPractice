package algo0408;

import java.util.Scanner;

public class Main_13909_창문닫기 {
	// boj Silver5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;
		
		for (int i = 1; i * i <= N; i++) {
			result++;
		}
		
		System.out.println(result);
	}
}
