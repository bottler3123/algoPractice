package algo0408;

import java.util.Scanner;

public class Main_2745_진법변환 {
	// boj Bronze2
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int B = sc.nextInt();
		
		int result = 0;
		for (int i = N.length() - 1; i >= 0; i--) {
			if (N.charAt(i) >= 'A') {
				result += (N.charAt(i) - 'A' + 10) * Math.pow(B, N.length() - 1 - i);				
			} else {
				result += (N.charAt(i) - '0') * Math.pow(B, N.length() - 1 - i);		
			}
			System.out.println(result);
		}
		
		System.out.println(result);
	}
}
