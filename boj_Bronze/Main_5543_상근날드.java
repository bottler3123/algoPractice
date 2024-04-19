package algo;

import java.util.Scanner;

public class Main_5543_상근날드 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int burger1 = sc.nextInt();
		int burger2 = sc.nextInt();
		int burger3 = sc.nextInt();
		int beverage1 = sc.nextInt();
		int beverage2 = sc.nextInt();
		
		int burger = Math.min(burger1, burger2);
		burger = Math.min(burger, burger3);
		int result = 0;
		result += Math.min(beverage1, beverage2);
		result += burger - 50;
		
		System.out.println(result);
	}
}
