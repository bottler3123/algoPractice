package algo;

import java.util.Scanner;

public class Main_15726_이칙연산 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextFloat();
		double b = sc.nextFloat();
		double c = sc.nextFloat();
		
		double result = 0;
		if (b > c) {
			result = a * b / c;
		} else {
			result = a / b * c;
		}
		
		System.out.println((int) result);
	}
}
