package algo0408;

import java.util.*;

public class Main_2476_주사위게임 {
	// boj Bronze3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;
		for (int i = 0; i < 3; i++) {
			int dice1 = sc.nextInt();
			int dice2 = sc.nextInt();
			int dice3 = sc.nextInt();
			
			int price = 0;
			if (dice1 == dice2 && dice2 == dice3) {
				price = 10000 + dice1 * 1000;
			} else if (dice1 == dice2) {
				price = 1000 + dice1 * 100;
			} else if (dice2 == dice3) {
				price = 1000 + dice2 * 100;
			} else if (dice3 == dice1) {
				price = 1000 + dice3 * 100;
			} else {
				if (dice1 > dice2 && dice1 > dice3) {
					price = dice1 * 100;
				} else if (dice2 > dice1 && dice2 > dice3) {
					price = dice2 * 100;
				} else {
					price = dice3 * 100;
				}
			}
			
			if (result < price) {
				result = price;
			}
		}
		System.out.println(result);
	}
}
