package algo;

import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class Main_10431_줄세우기 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int tc = Integer.parseInt(st.nextToken());
			int result = 0;
			int[] student = new int [20];
			
			for (int i = 0; i < 20; i++) {
				int num = Integer.parseInt(st.nextToken());
				for (int j = 0; j < 20; j++) {
					if (student[j] == 0) {
						student[j] = num;
						break;
					}
					
					if (student[j] > num) {
						int cnt = j;
						while (true) {
							if (student[cnt] == 0) {
								break;
							}
							int temp = student[cnt];
							student[cnt] = num;
							num = temp;
							result++;
							cnt++;
						}
					}
				}
			}
			
			System.out.println(tc + " " + result);
		}
	}
}
