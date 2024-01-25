package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2847_게임을만든동준이 {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int [N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int result = 0;
		for (int i = N - 2; i >= 0; i--) {
			if (arr[i] >= arr[i+1]) {
				result += arr[i] - arr[i+1] + 1;
				arr[i] = arr[i+1] - 1;
			}
		}
		
		System.out.println(result);
	}
}
