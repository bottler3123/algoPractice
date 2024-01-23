package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main_5347_LCM {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int gcd = GCD(a,b);
			BigInteger lcm = new BigInteger(String.valueOf(a));
			lcm = lcm.multiply(new BigInteger(String.valueOf(b)));
			lcm = lcm.divide(new BigInteger(String.valueOf(gcd)));
			System.out.println(lcm);
		}		
		
	}

	private static int GCD(int a, int b) {
		int big = a >= b ? a : b;
		int small = a >= b ? b : a;
		
		if (big % small == 0) {
			return small;
		} else {
			return GCD(small, big % small);
		}
	}
}
