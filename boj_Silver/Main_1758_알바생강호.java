package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_1758_알바생강호 {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int [N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		long tip = 0;
		long result = 0;
		for (int i = N-1; i >= 0 ; i--) {
			long num = arr[i] - tip;
			if (num > 0) {
				result += num;				
			}
			
			tip++;
		}
		
		System.out.println(result);
	}
}
