package algo0408;

import java.util.Scanner;

public class Main_2588_곱셈 {
	// boj Bronze3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		String second = sc.next();

		int hun = second.charAt(0) - '0';
		int ten = second.charAt(1) - '0';
		int one = second.charAt(2) - '0';
		
		System.out.println(first * one);
		System.out.println(first * ten);
		System.out.println(first * hun);
		System.out.println(first * Integer.parseInt(second));
	}
}
