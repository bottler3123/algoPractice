package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2057_팩토리얼분해 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		
		
		long num = facto(20);
		if (N == 0) {
			System.out.println("NO");
		} else {		
			for (int i = 20; i > 0; i--) {
				if (N >= num) {
					N -= num;
				}
				num /= i;
			}
			
			if (N == 0 || N == 1) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
		}
	}

	private static long facto(long i) {
		if (i <= 1) {
			return 1;
		} else {
			return facto(i - 1) * i;
		}
	}
}
