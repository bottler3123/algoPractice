package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1813_논리학교수 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int [51];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			arr[num]++;
		}
		
		int result = 0;
		for (int i = 0; i < 51; i++) {
			if (arr[i] == i) {
				result = i;
			}
		}
		
		if (result == 0 && arr[0] > 0) {
			result = -1;
		}
		System.out.println(result);
	}
}
