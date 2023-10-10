package algo0408;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2752_세수정렬 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int [3];
		for (int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		for (int i = 0; i < 3; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
