package algo;

import java.util.Arrays;
import java.util.Scanner;

public class Main_11948_과목선택 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int [4];
		int[] arr2 = new int [2];
		
		for (int i = 0; i < 4; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < 2; i++) {
			arr2[i] = sc.nextInt();
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int result = 0;
		for (int i = 1; i < 4; i++) {
			result += arr1[i];
		}
		result += arr2[1];
		
		System.out.println(result);
	}
}
