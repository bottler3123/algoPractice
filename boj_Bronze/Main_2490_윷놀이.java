package algo;

import java.util.Scanner;

public class Main_2490_윷놀이 {
	// boj Bronze3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			int num = 0;
			for (int j = 0; j < 4; j++) {
				int stick = sc.nextInt();
				num += stick;
			}
			
			switch (num) {
			case 0:
				System.out.println("D");
				break;
			case 1:
				System.out.println("C");
				break;
			case 2:
				System.out.println("B");
				break;
			case 3:
				System.out.println("A");
				break;
			case 4:
				System.out.println("E");
				break;
			}
		}
	}
}
