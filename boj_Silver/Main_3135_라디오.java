package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_3135_라디오 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(br.readLine());
		
		int result = Math.abs(end - start);
		for (int i = 0; i < N; i++) {
			int button = Integer.parseInt(br.readLine());
			if (result > Math.abs(end - button) + 1) {
				result = Math.abs(end - button) + 1;
			}
		}
		
		System.out.println(result);
	}
}
