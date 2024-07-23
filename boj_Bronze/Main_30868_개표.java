package algo;

import java.util.Scanner;

public class Main_30868_개표 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int t = 0; t < T; t++) {
			String result = "";
			int n = sc.nextInt();
			int five = n / 5;
			for (int i = 0; i < five; i++) {
				result += "++++ ";
			}
			
			int bar = n % 5;
			for (int i = 0; i < bar; i++) {
				result += "|";
			}
			
			System.out.println(result);
		}
	}
}
