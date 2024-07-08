package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2097_조약돌 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int x = 1;
		int y = 1;
		while ((x+1) * (y+1) < N) {
			if (x == y) {
				x++;
			} else {
				y++;
			}
		}
		
		System.out.println(x + x + y + y);
	}
}
