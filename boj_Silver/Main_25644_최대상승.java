package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_25644_최대상승 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int [N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int small = Integer.MAX_VALUE;
		int result = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			result = result > arr[i] - small ? result : arr[i] - small;
			if (arr[i] < small) {
				small = arr[i];
			}
		}
		
		System.out.println(result);
	}
}
