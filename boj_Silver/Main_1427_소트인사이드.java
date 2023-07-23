package algo0408;

import java.util.Arrays;
import java.util.Scanner;

public class Main_1427_소트인사이드 {
	// boj Silver5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int arr [] = new int [str.length()];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i) - '0';
		}
		
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[arr.length - i - 1]);
		}
		
	}
}
