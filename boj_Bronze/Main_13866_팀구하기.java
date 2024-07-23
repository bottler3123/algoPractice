package algo;

import java.util.Scanner;

public class Main_13866_팀구하기 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] user = new int [4];
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			user[i] = sc.nextInt();
			sum += user[i];
		}
		
		int result = Integer.MAX_VALUE;
		
		for (int i = 1; i < 4; i++) {
			if (Math.abs(sum - 2 * (user[0] + user[i])) < result) {
				result = Math.abs(sum - 2 * (user[0] + user[i]));
			}
		}
		
		System.out.println(result);
	}
}
