package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2312_수복원하기 {
	// boj Silver3
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		int[] map = new int [100001];
		for (int i = 2; i < 100001; i++) {
			if (map[i] == 0) {
				map[i] = 1;
				int num = 2;
				while (i * num <= 100000) {
					map[i * num] = -1;
					num++;
				}
			}
		}
		
		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());
			
			for (int i = 2; i <= N; i++) {
				int cnt = 0;
				if (map[i] == 1) {
					while (N % i == 0) {
						N /= i;
						cnt++;
					}
					
					if (cnt != 0) {
						System.out.println(i + " " + cnt);
					}
				}
			}
		}
	}
}
