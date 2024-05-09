package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2891_카약과강풍 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		int[] arr = new int [N+1];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < S; i++) {
			int num = Integer.parseInt(st.nextToken());
			arr[num] = -1;
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < R; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (arr[num] == -1) {
				arr[num] = 0;
			} else {
				arr[num] = 1;
 			}
		}
		
		for (int i = 1; i < N; i++) {
			if (arr[i] == -1) {
				if (arr[i-1] == 1) {
					arr[i-1] = 0;
					arr[i] = 0;
					continue;
				}
				if (arr[i+1] == 1) {
					arr[i+1] = 0;
					arr[i] = 0;
				}
			}
		}
		if (arr[N] == -1 && arr[N-1] == 1) {
			arr[N-1] = 0;
			arr[N] = 0;
		}
		
		int result = 0;
		for (int i = 1; i <= N; i++) {
			if (arr[i] == -1) {
				result++;
			}
		}
		
//		System.out.println(Arrays.toString(arr));
		System.out.println(result);
	}
}
