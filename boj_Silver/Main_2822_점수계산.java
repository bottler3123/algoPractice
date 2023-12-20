package algo0408;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2822_점수계산 {
	// boj Silver5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int [8];
		int[] arr = new int [8];
		
		int sum = 0;
		for (int i = 0; i < 8; i++) {
			arr[i] = sc.nextInt();
			score[i] = arr[i];
		}
		
		Arrays.sort(arr);
		String result = "";
		for (int i = 0; i < 8; i++) {
			for (int j = 3; j < 8; j++) {
				if (score[i] == arr[j]) {
					sum += score[i];
					result += i + 1 + " ";
				}
			}
		}
		System.out.println(sum);
		System.out.println(result);
	}
}
