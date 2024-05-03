package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1268_임시반장정하기 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[][] student = new int [N][5];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				student[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int result = 0;
		int result_cnt = 0;
		
		for (int i = 0; i < N; i++) {
			int cnt = 0;
			
			for (int j = 0; j < N; j++) {
				if (student[i][0] == student[j][0] || student[i][1] == student[j][1] || student[i][2] == student[j][2] || student[i][3] == student[j][3] || student[i][4] == student[j][4]) {
					cnt++;
					continue;
				}
			}
			
			if (cnt > result_cnt) {
				result_cnt = cnt;
				result = i;
			}
		}
		
		System.out.println(result+1);
	}
}
