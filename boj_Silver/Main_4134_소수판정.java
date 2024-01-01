package algo0408;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_4134_소수판정 {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			long n = Long.parseLong(br.readLine());
			long result = 0;
			if (n <= 2) {
				result = 2;
			} else {
				result = pnum(n);
			}
			System.out.println(result);
		}
	}

	private static long pnum(long n) {
		while (true) {
			boolean check = true;
			for (int i = 2; i < Math.sqrt(n)+1; i++) {
				if (n % i == 0) {
					check = false;
					break;
				}
			}
			
			if (check) {
				break;
			}
			
			n++;
		}
		
		return n;
	}
}
