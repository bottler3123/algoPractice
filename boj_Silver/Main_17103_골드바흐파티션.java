package algo0408;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_17103_골드바흐파티션 {
	// boj Silver2
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		int[] sieve = new int [1000001];
		for (int i = 2; i < 1000001; i++) {
			if (sieve[i] == 0) {
				sieve[i] = 1;
				for (int j = 2; j * i < 1000001; j++) {
					sieve[i * j] = -1;
				}
			}
		}
		
		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());
			int result = 0;
			for (int i = 2; i < N / 2 + 1; i++) {
				if (sieve[i] == 1 && sieve[N - i] == 1) {
					result++;
				}
			}
			System.out.println(result);
		}
	}
}
