package algo;

import java.util.*;

public class Main_10807_개수세기 {
	// boj Bronze5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr [] = new int [201];
		for (int i = 0; i < N; i++) {
			int temp = sc.nextInt();
			arr[temp+100] += 1;
		}
		int result = sc.nextInt();
		System.out.println(arr[result+100]);
	}
}
