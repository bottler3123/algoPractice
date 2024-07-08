package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_20114_미아노트 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		
		char[][] map = new char [H][N*W];
		for (int i = 0; i < H; i++) {
			String str = br.readLine();
			for (int j = 0; j < str.length(); j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		String result = "";
		for (int i = 0; i < N; i++) {
			String temp = "?";
			for (int j = 0; j < H; j++) {
				for (int k = i*W; k < i*W+W; k++) {
					if (map[j][k] != '?') {
						temp = String.valueOf(map[j][k]);
						break;
					}
				}
			}
			
			result += temp;
		}
		
		System.out.println(result);
	}
}
