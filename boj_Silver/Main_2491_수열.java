package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2491_수열 {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int [N];
		int[] up = new int [N];
		int[] down = new int [N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = 1;
		up[0] = 1;
		down[0] = 1;
		for (int i = 1; i < N; i++) {
			if (arr[i] > arr[i-1]) {
				up[i] = up[i-1] + 1;
				down[i] = 1;
			} else if (arr[i] < arr[i-1]) {
				down[i] = down[i-1] + 1;
				up[i] = 1;
			} else {
				up[i] = up[i-1] + 1;
				down[i] = down[i-1] + 1;
			}
			
//			System.out.println(arr[i] + " " + up[i] + " " + down[i]);
			if (up[i] > result) {
				result = up[i];
			}
			if (down[i] > result) {
				result = down[i];
			}
		}
		
		System.out.println(result);
	}
}
