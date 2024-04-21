package algo;

import java.util.Scanner;

public class Main_11282_한글 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		N += Integer.parseInt("AC00",16) - 1;
		char result = (char) N;
		System.out.println(result);
	}
}
