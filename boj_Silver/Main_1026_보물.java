package algo0408;

import java.util.*;
import java.io.*;

public class Main_1026_보물 {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int [] arr_A = new int [N];
		int [] arr_B = new int [N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr_A[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr_B[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr_A);
		Arrays.sort(arr_B);
		int result = 0;
		for (int i = 0; i < arr_B.length; i++) {
			result += arr_A[i] * arr_B[N-i-1];
		}
		
		System.out.println(result);
	}
}
