package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_18311_왕복 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		long K = Long.parseLong(st.nextToken());
		int[] arr = new int [N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		long cnt = 0;
		int result = 0;
		for (int i = 0; i < N; i++) {
			if (cnt + arr[i] <= K) {
				cnt += arr[i];
			} else {
				result = i+1;
				break;
			}
		}
		
		if (result == 0) {
			for (int i = N-1; i >= 0; i--) {
				if (cnt + arr[i] <= K) {
					cnt += arr[i];
				} else {
					result = i+1;
					break;
				}
			}
		}
		
		System.out.println(result);
	}
}
