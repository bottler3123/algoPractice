package algo0408;

import java.util.Scanner;

public class Main_1812_사탕 {
	// boj Silver4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int [N+1];
		for (int i = 1; i < N+1; i++) {
			arr[i] = sc.nextInt();
		}
		
		int a = 0;
		for (int i = 1; i < N+1; i++) {
			if (i % 2 == 0) {
				a -= arr[i];				
			} else {
				a += arr[i];
			}
		}
		a = a / 2;
		
		System.out.println(a);
		for (int i = 1; i < N; i++) {
			a = arr[i] - a;
			System.out.println(a);
		}
	}
}
