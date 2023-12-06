package algo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main_14215_세막대 {
	// boj Bronze3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] arr = new Integer [3];
		for (int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr,Collections.reverseOrder());
		
		if (arr[0] < arr[1] + arr[2]) {
			System.out.println(arr[0] + arr[1] + arr[2]);
		} else {
			System.out.println((arr[1] + arr[2]) * 2 - 1);			
		}
		
	}
}
