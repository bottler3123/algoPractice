package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1459_걷기 {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long X = Long.parseLong(st.nextToken());
		long Y = Long.parseLong(st.nextToken());
		long W = Long.parseLong(st.nextToken());
		long S = Long.parseLong(st.nextToken());
		
		long result = 0;
		if (W * 2 < S) {
			result = W * X + W * Y;
		} else {
			long abs = Math.abs(X - Y);
			if (W < S) {
				result = abs * W + (X + Y - abs) / 2 * S;
			} else {
				result = (abs % 2) * W + (abs / 2) * S * 2 + (X + Y - abs) / 2 * S;				
			}
		}
		
		System.out.println(result);
	}
}
