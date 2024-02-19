package algo;

import java.util.Scanner;

public class Main_1145_적어도대부분의배수 {
	// boj Bronze1
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int [5];
		for (int i = 0; i < 5; i++) {
			num[i] = sc.nextInt();
		}
		
		int result = 0;
		for (int i = 1; i < 1000000; i++) {
			int check = 0;
			for (int j = 0; j < 5; j++) {
				if (i % num[j] == 0) {
					check++;
				}
			}
			
			if (check >= 3) {
				result = i;
				break;
			}
		}
		
		System.out.println(result);
	}
}
