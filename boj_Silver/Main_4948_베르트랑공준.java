package algo0408;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_4948_베르트랑공준 {
	// boj Silver2
	
	public static void main(String[] args) throws Exception {
		int[] sieve = new int [300000];
		for (int i = 2; i < 300000; i++) {
			if (sieve[i] == 0) {
				sieve[i] = 1;
				for (int j = 2; j * i < 300000; j++) {
					sieve[i*j] = -1;
				}
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) {
				break;
			}
			
			int result = 0;
			for (int i = n+1; i <= n * 2; i++) {
				if (sieve[i] == 1) {
					result++;
				}
			}
			System.out.println(result);
		}
	}
}
