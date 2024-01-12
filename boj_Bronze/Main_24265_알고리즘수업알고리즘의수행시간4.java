package algo;

import java.util.Scanner;

public class Main_24265_알고리즘수업알고리즘의수행시간4 {
	// boj Bronze3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		
		long result = 0;
		for (int i = 1; i < n; i++) {
			result += i;
		}
		
		System.out.println(result);
		System.out.println(2);
	}
}
