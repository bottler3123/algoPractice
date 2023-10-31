package algo0408;

import java.util.Scanner;

public class Main_10039_평균점수 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		for (int i = 0; i < 5; i++) {
			int score = sc.nextInt();
			if (score > 40) {
				result += score;
			} else {
				result += 40;
			}
		}
		
		result /= 5;
		System.out.println(result);
	}
}
