package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1024_수열의합 {
	// boj Silver2
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		int start = -1;
		for (int i = L; i < 101; i++) {
			int num = (i-1) * i / 2;
			
			if ((N - num) % i == 0) {
				cnt = i;
				start = (N - num) / i;
				break;
			}
		}
		
		if (start < 0) {
			System.out.println(-1);
		} else {
			for (int i = 0; i < cnt; i++) {
				System.out.print((start + i) + " ");
			}			
		}
	}
}
