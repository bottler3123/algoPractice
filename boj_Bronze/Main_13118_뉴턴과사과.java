package algo;

import java.util.Scanner;

public class Main_13118_뉴턴과사과 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int [5];
		for (int i = 1; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		
		int result = 0;
		for (int i = 1; i < 5; i++) {
			int apple = Math.abs(arr[i] - x);
			if (apple == 0) {
				result = i;
			}
		}
		
		System.out.println(result);
	}
}
