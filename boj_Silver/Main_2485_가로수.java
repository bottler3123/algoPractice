package algo0408;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2485_가로수 {
	// boj Silver4
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int [N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int gcd = 0;
		for (int i = 0; i < N; i++) {
			if (i == 1) {
				gcd = arr[i] - arr[i-1];
			}
			
			if (i >= 2) {
				gcd = gcd(arr[i] - arr[i-1],gcd);
			}
		}
		
		int result = (arr[N-1] - arr[0]) / gcd + 1 - N;
		System.out.println(result);

	}

	private static int gcd(int i, int gcd) {
		if (i%gcd == 0) {
			return gcd;
		}
		return gcd(gcd,i%gcd);
	}
}
