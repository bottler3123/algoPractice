package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_17419_비트가넘쳐흘러 {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int result = 0;
		
		for (int i = 0; i < N; i++) {
			if (str.charAt(i) == '1') {
				result++;
			}
		}
		
		System.out.println(result);
	}
}
