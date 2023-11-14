package algo0408;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11576_BaseConversion {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(br.readLine());
		int num = 0;
		
		st = new StringTokenizer(br.readLine());
		for (int i = m - 1; i >= 0; i--) {
			int temp = Integer.parseInt(st.nextToken());
			num += temp * Math.pow(A, i);
		}
		
		String result = "";
		while (true) {
			result = (" " + num % B) + result;
			
			num /= B;
			
			if (num < B) {
				result = num + result;
				break;
			}
		}
		
		System.out.println(result);
	}
}
