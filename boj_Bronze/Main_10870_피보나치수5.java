package algo;

import java.util.Scanner;

public class Main_10870_피보나치수5 {
	// boj Bronze2
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = fibo(0,1,2,n);
		System.out.println(result);
	}
	
	public static int fibo(int a, int b, int cnt, int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		if (n == cnt) {
			return a + b;
		}
		return fibo(b,a+b,cnt+1,n);
	}
}
