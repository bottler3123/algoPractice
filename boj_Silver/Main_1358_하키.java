package algo0408;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1358_하키 {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int W = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		int radius = H / 2;
		
		int result = 0;
		for (int i = 0; i < P; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			// 중앙 사각 부분에 있는지 체크
			if (a >= X && a <= X+W && b >= Y && b <= Y+H) {
				result ++;
				continue;
			}
			
			double distance = Math.sqrt((X - a) * (X - a) + (Y + radius - b) * (Y + radius - b));
			if (distance <= radius) {
				result++;
				continue;
			}
			
			distance = Math.sqrt((X + W - a) * (X + W - a) + (Y + radius - b) * (Y + radius - b));
			if (distance <= radius) {
				result++;
				continue;
			}
		}
		
		System.out.println(result);
		
	}
}
