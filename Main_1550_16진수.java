package algo0408;

import java.util.Scanner;

public class Main_1550_16진수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		sc.close();
		
		String [] hex = N.split("");
		int result = 0;
		
		for (int i = 0 ; i < hex.length ; i++) {
			int changehex = (int) Math.pow(16, i);
			int hexint = N.charAt(hex.length - i -1) - '0';
			
			if (hexint > 10) {
				result += changehex * (hexint -7);
			} else {
				result += changehex * hexint;
			}
			
		}
		
		System.out.println(result);
	}
}
