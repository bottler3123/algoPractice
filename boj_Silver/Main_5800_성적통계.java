package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_5800_성적통계 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= K; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int[] arr = new int [N];
			for (int j = 0; j < N; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			int gap = 0;
			for (int j = N-2; j >= 0; j--) {
				if (arr[j+1] - arr[j] > gap) {
					gap = arr[j+1] - arr[j];
				}
			}
			
			System.out.println("Class " + i);
			System.out.println("Max " + arr[N-1] + ", Min " + arr[0] + ", Largest gap " + gap);
		}
	}
}
