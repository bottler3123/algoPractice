package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_11256_사탕 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int J = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int[] arr = new int [N];
			
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				int R = Integer.parseInt(st.nextToken());
				int C = Integer.parseInt(st.nextToken());
				arr[i] = R * C;
			}
			Arrays.sort(arr);
			
			int result = 0;
			for (int i = N-1; i >= 0; i--) {
				result++;
				if (J > arr[i]) {
					J -= arr[i];
				} else {
					break;
				}
			}
			
			System.out.println(result);
		}
	}
}
