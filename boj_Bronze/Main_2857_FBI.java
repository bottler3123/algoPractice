package algo;

import java.util.Scanner;

public class Main_2857_FBI {
	// boj Bronze3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = "";
		for (int i = 1; i < 6; i++) {
			String str = sc.next();
			if (str.contains("FBI")) {
				result += i + " ";
			}
		}
		
		if (result.equals("")) {
			System.out.println("HE GOT AWAY!");
		} else {
			System.out.println(result);
		}
	}
}
