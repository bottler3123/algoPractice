package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2018_수들의합 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int[] num = new int[n+1];
		int answer = 0;
		
		for (int i = 1; i <= n; i++) {
			num[i] = i;
		}
		
		for (int i = 1; i <= n; i++) {
			int hap = num[i];
			for (int j = i+1; j < n; j++) {
				hap += num[j];
				if (hap > n) break;
				else if (hap == n) answer++;
				
			}
		}
		
		System.out.println(answer+1);
	}
}
