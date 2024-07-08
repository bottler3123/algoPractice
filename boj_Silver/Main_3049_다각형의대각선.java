package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_3049_다각형의대각선 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int result = (n * (n-1) * (n-2) * (n-3)) / 24;
		System.out.println(result);
	}
}
