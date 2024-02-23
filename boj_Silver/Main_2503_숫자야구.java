package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2503_숫자야구 {
	// boj Silver3
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int [1000];
		int[] check = new int [1000];
		for (int i = 123; i <= 987; i++) {
			String str = String.valueOf(i);
			
			if (str.charAt(0) == str.charAt(1) || str.charAt(1) == str.charAt(2) || str.charAt(2) == str.charAt(0)) {
				arr[i] = -1;
			}
			if (str.charAt(0) == '0' || str.charAt(1) == '0' || str.charAt(2) == '0') {
				arr[i] = -1;
			}
		}
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String base = st.nextToken();
			int strike = Integer.parseInt(st.nextToken());
			int ball = Integer.parseInt(st.nextToken());
			
			for (int j = 123; j <= 987; j++) {
				if (arr[j] == -1) {
					continue;
				}
				
				int strike_cnt = 0;
				int ball_cnt = 0;
				String temp = String.valueOf(j);
				
				for (int k = 0; k < 3; k++) {
					if (temp.charAt(k) == base.charAt(k)) {
						strike_cnt++;
					}
					
					for (int l = 0; l < 3; l++) {
						if (temp.charAt(k) == base.charAt(l) && k != l) {
							ball_cnt++;
						}
					}
				}
				
				if (strike == strike_cnt && ball == ball_cnt) {
					check[j]++;
				}
			}
		}
		
		int result = 0;
		for (int i = 123; i <= 987; i++) {
			if (check[i] == N) {
				result++;
			}
		}
		
		System.out.println(result);
	}
}
