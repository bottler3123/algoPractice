package algo;

import java.util.Scanner;

public class Main_1110_더하기사이클 {
	// boj Bronze1
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;
		int first_num = N;
		int num = -1;
		
		while (first_num != num) {
			int plus = N / 10 + N % 10;
			num = N % 10 * 10 + plus % 10;
			N = num;
			result ++;
		}
		
		System.out.println(result);
	}
}
