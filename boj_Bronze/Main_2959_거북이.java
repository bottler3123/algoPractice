package algo;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2959_거북이 {
	// boj Bronze3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int [4];
		
		for (int i = 0; i < 4; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		System.out.println(arr[0] * arr[2]);
	}
}
