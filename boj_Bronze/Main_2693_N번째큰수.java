package algo;

import java.util.*;
import java.io.*;

public class Main_2693_N번째큰수 {
	// boj Bronze1
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int [] arr = new int [10];
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 10; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.parallelSort(arr);
			System.out.println(arr[7]);
		}
	}
}
