package algo;

import java.util.Scanner;

public class Main_17388_와글와글숭고한 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int [3];
		for (int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt();
		}
		
		if (arr[0] + arr[1] + arr[2] >= 100) {
			System.out.println("OK");
		} else {
			int cnt = 0;
			int num = arr[0];
			
			for (int i = 1; i < 3; i++) {
				if (num > arr[i]) {
					cnt = i;
					num = arr[i];
				}
			}
			
			switch (cnt) {
			case 0:
				System.out.println("Soongsil");
				break;
			case 1:
				System.out.println("Korea");
				break;
			case 2:
				System.out.println("Hanyang");
				break;
			}
		}
	}
}
