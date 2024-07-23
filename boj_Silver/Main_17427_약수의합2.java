package algo0408;

import java.io.*;

public class Main_17427_약수의합2 {
	// boj Silver2
	
	public static void main(String [] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		long result = 0;
		for (int i = 1; i <= N; i++) {
			result += N / i * i;
		}
		
		System.out.println(result);
	}

}
