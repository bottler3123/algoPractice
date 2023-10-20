package algo0408;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_2217_로프 {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] rope = new int [N];
		for (int i = 0; i < N; i++) {
			rope[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(rope);
		
		int result = 0;
		for (int i = 0; i < N; i++) {
			if (rope[i] * (N - i) > result) {
				result = rope[i] * (N - i);
			}
		}
		
		System.out.println(result);
	}
}
