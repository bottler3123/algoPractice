package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1590_캠프가는영식 {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		
		int result = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken());
			int I = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			
			for (int j = 0; j < C; j++) {
				int bus = S + (j * I);
				if (bus >= T) {
					result = bus - T < result ? bus - T : result;
					break;
				}
			}
		}
		
		if (result == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {			
			System.out.println(result);
		}
	}
}
