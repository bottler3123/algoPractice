package practice;

import java.util.Scanner;
import java.util.Stack;

public class Main_1094_막대기_ver2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(); // 만들어야하는 막대 길이
		
		int ans = 0;
		while (X > 0) {
			if (X%2 == 1) {
				ans++;
			}
			X/=2;
		}
		System.out.println(ans);
	}

}
