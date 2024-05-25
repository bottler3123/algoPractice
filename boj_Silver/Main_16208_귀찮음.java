package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_16208_귀찮음 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] arr = new long [N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long all = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = Long.parseLong(st.nextToken());
			all += arr[i];
		}
		
		long result = 0;
		for (int i = 0; i < N; i++) {
			long num = arr[i];
			all = all - num;
			result += num * all;
		}
		
		System.out.println(result);
	}
}
