package algo0408;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2559_수열 {
	// boj Silver3
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] arr = new int [N];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int temp = 0;
		for (int i = 0; i < K; i++) {
			temp += arr[i];
		}
		
		int result = temp;
		for (int i = 0; i < N-K; i++) {
			temp -= arr[i];
			temp += arr[i+K];
			
			if (temp > result) {
				result = temp;
			}
		}
		
		System.out.println(result);
	}
}
