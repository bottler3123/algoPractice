package algo0408;

import java.io.*;
import java.util.*;

public class Main_18110_solvedac {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr [] = new int [n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int cutoff = (int) Math.round(n * 0.15);
//		System.out.println(cutoff);
		Arrays.sort(arr);
		
		double sum = 0;
		
		for (int i = cutoff; i < n - cutoff; i++) {
			sum += arr[i];
		}
		
//		System.out.println(sum);
		
		int result = (int) Math.round(sum / (n-cutoff*2));
		
		System.out.println(result);
	}
}
