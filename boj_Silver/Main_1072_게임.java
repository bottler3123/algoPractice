package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1072_게임 {
	// boj Silver3
	
	static long X,Y,rating;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		X = Integer.parseInt(st.nextToken());
		Y = Integer.parseInt(st.nextToken());
		
		rating = Y * 100 / X;
		if (rating == 100 || rating == 99) {
			System.out.println(-1);
		} else {			
			int start = 1;
			int end = 1000000000;
			int result = 0;
			
			while (true) {
				int mid = (start + end) / 2;
				long plus1 = (Y + mid) * 100 / (X + mid);
				
				if (start > end) {
					break;
				}
				
				if (plus1 >= rating + 1) {
					end = mid - 1;
					result = mid;
				} else {
					start = mid + 1;
				}
			}
			
			System.out.println(result);
		}
	}
}
