package algo0408;

import java.util.*;

public class Main_2506_점수계산 {
	// boj Bronze3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;
		int score = 1;
		for (int i = 0; i < N; i++) {
			int temp = sc.nextInt();
			if (temp == 1) {
				result += score;
				score ++;
			} else {
				score = 1;
			}
		}
		
		System.out.println(result);
	}
}
