package algo;

import java.util.Scanner;

public class Main_24416_알고리즘수업피보나치수1 {
	// boj Bronze1
	
	static int fibo, dynamic;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		fibo = 0;
		dynamic = 0;
		
		fib(n);
		
		if (n == 1 || n == 2) {
			dynamic = 1;
		} else {
			dynamic = n - 2;
		}
		
		
		System.out.println(fibo + " " + dynamic);
		
	}

	private static int fib(int n) {
		if (n == 1 || n == 2) {
			fibo++;
			return 1;			
		} else {
			return (fib(n - 1) + fib(n - 2));			
		}
	}
}
