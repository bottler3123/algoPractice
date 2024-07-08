package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11116_교통량 {
	// boj Silver5
	
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());
			int[] left = new int [N];
			int[] right = new int [N];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				left[i] = Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				right[i] = Integer.parseInt(st.nextToken());
			}
			
			int result = 0;
			for (int i = 0; i < N; i++) {
				int cnt = 1;
				int num = left[i];
				for (int j = i+1; j < N; j++) {
					if (num + 500 == left[j]) {
						cnt++;
						num = left[j];
					}
				}
				if (cnt != 4) {
					for (int j = 0; j < N; j++) {
						if (num + 500 == right[j]) {
							cnt++;
							num = right[j];
						}
					}
				}
				
				if (cnt == 4) {
					result++;
				}
			}
			
			System.out.println(result);
		}
	}
}
