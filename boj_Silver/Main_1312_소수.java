package algo0408;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1312_소수 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		int result = 0;
		for(int i = 0; i < N; i++) {
			A = (A % B) * 10;
			result = A / B;
		}
		
		System.out.println(result % 10);
	}
}
