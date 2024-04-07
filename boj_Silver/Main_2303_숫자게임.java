package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2303_숫자게임 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		int big = -1;
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = new int [5];
			for (int j = 0; j < 5; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			int num = -1;
			for (int j = 0; j < 3; j++) {
				for (int j2 = j+1; j2 < 4; j2++) {
					for (int j3 = j2+1; j3 < 5; j3++) {
						num = Math.max(num, (arr[j] + arr[j2] + arr[j3]) % 10);
					}
				}
			}
			
			if (big <= num) {
				big = num;
				result = i;
			}
		}
		
		System.out.println(result+1);
	}

}
