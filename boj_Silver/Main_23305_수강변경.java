package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_23305_수강변경 {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] before = new int [1000001];
		int[] after = new int [1000001];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			before[num]++;
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			after[num]++;
		}
		
		int result = 0;
		for (int i = 1; i < 1000001; i++) {
			result += Math.abs(before[i] - after[i]);
		}
		result = result / 2;
		System.out.println(result);
	}
}
