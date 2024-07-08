package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1380_귀걸이 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cnt = 1;
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) {
				break;
			}
			
			String[] name = new String [n];
			int[] ling = new int [n];
			
			for (int i = 0; i < n; i++) {
				name[i] = br.readLine();
			}
			
			for (int i = 0; i < n*2-1; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int num = Integer.parseInt(st.nextToken());
				String temp = st.nextToken();
				
				if (ling[num-1] < 2) {
					ling[num-1]++;
				} else {
					ling[num-1]--;
				}
			}
			
			String result = "";
			for (int i = 0; i < n; i++) {
				if (ling[i] == 1) {
					result = name[i];
					break;
				}
			}
			
			System.out.println(cnt + " " + result);
			cnt++;
		}
	}
}
