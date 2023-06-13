package algo;

import java.util.*;

public class Main_2501_약수구하기 {
	// boj bronze3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int cnt = 0;
		int result = 0;
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				cnt++;
			}
			if (cnt == K) {
				result = i;
				break;
			}
		}
		
		System.out.println(result);
	}
}
