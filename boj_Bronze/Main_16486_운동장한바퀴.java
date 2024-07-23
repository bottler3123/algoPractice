package algo;

import java.util.Scanner;

public class Main_16486_운동장한바퀴 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		
		double result = (d1 * 2) + (2 * 3.141592 * d2);
		System.out.println(result);
	}
}
