package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_14729_칠무해 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int [N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = (int) (Double.parseDouble(br.readLine()) * 1000);
//			System.out.println(arr[i]);
		}
		
		Arrays.sort(arr);
		
		for (int i = 0; i < 7; i++) {
			System.out.printf("%.3f\n", arr[i] / 1000.0);
		}
		
	}
}
