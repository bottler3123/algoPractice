package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_9417_최대GCD {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < N; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int cnt = st.countTokens();
			int[] arr = new int [cnt];
			for (int i = 0; i < cnt; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int result = 0;
			for (int i = 0; i < cnt-1; i++) {
				for (int j = i+1; j < cnt; j++) {
					int gcd = GCD(arr[i],arr[j]);
					if (gcd > result) {
						result = gcd;
					}
				}
			}
			
			System.out.println(result);
		}
	}

	private static int GCD(int a, int b) {
		int big = a > b ? a : b;
		int small = a > b ? b : a;
		
		if (big % small == 0) {
			return small;
		} else {
			return GCD(big % small, small);
		}
	}
}
