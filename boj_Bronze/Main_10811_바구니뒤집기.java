package algo0408;

import java.util.Scanner;

public class Main_10811_바구니뒤집기 {
	// boj Bronze2
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int ball [] = new int [N+1];
		for (int i = 1; i < N+1; i++) {
			ball[i] = i;
		}
		
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int end = b;
			for (int j = a; j <= (b+a)/2; j++) {
				int temp = ball[j];
				ball[j] = ball[end];
				ball[end] = temp;
				end --;
			}
		}
		
		for (int i = 1; i < N+1; i++) {
			System.out.print(ball[i] + " ");
		}
	}
}
