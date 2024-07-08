package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_5426_비밀편지 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			String str = br.readLine();
			int n = (int) Math.sqrt(str.length());
			
			char[][] map = new char[n][n];
			
			int cnt = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					map[i][j] = str.charAt(cnt);
					cnt++;
				}
			}
			
			for (int i = n-1; i >= 0; i--) {
				for (int j = 0 ; j < n; j++) {
					bw.append(map[j][i]);
				}
			}
			
			bw.append("\n");
		}
		
		bw.flush();
		bw.close();
	}
}
