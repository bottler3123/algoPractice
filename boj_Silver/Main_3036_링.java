package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_3036_링 {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < N - 1; i++) {
			int ring = Integer.parseInt(st.nextToken());
			
			int gcd = gcd(start,ring);
			System.out.println(start / gcd + "/" + ring / gcd);
		}
		
		
	}

	private static int gcd(int a, int b) {
		int c;
		
		while (b != 0) {
			c = a % b;
			a = b;
			b = c;
		}
		
		return a;
	}
}
