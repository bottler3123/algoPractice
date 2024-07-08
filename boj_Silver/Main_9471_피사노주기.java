package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_9471_피사노주기 {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int m1 = 1;
			int m2 = 1;
			
			int result = 0;
			do {
				int temp = m1;
				m1 = m2;
				m2 = (temp + m1) % M;
				result++;
			} while (m1 != 1 || m2 != 1);
			
			System.out.println(N + " " + result);
		}
	}
}
