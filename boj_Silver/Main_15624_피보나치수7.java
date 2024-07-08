package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_15624_피보나치수7 {
	// boj Silver4
	
	static int[] arr;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int [n+1];
		
		if (n == 0) {
			System.out.println(0);
		} else if (n == 1) {
			System.out.println(1);
		} else {
			arr[0] = 0;
			arr[1] = 1;
			System.out.println(fibo(n));
		}
	}

	private static int fibo(int n) {
		if (n == 0) {
			return 0;
		}
		
		if (n == 1) {
			return 1;
		}
		
		if (arr[n] == 0) {
			arr[n] = fibo(n-1) + fibo(n-2);
		}
		
		return arr[n] % 1000000007;
	}
}
