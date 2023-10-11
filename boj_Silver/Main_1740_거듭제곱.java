package algo0408;

import java.util.Scanner;

public class Main_1740_거듭제곱 {
	// Silver4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		String str = "";
		
		while (true) {
			if (N / 2 > 0) {
				if (N % 2 == 1) {
					str += "1";				
				} else {
					str += "0";
				}
				N /= 2;
			} else {
				str += "1";
				break;
			}
		}
		
		long result = 0;
		long three = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1') {
				result += three;		
			}
			three *= 3;
		}
		
		System.out.println(result);
	}
}
