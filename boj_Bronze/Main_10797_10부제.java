package algo0408;

import java.util.Scanner;

public class Main_10797_10부제 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int [5];
		
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		
		int result = 0;
		
		for (int i = 0; i < 5; i++) {
			if (arr[i] == N) {
				result++;
			}
		}
		
		System.out.println(result);
	}
}
