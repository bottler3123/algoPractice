package algo;

import java.util.Scanner;

public class Main_2460_지능형기차2 {
	// boj Bronze3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int peaple = 0;
		for (int t = 0; t < 10; t++) {
			int out_peaple = sc.nextInt();
			int in_peaple = sc.nextInt();
			peaple = peaple - out_peaple + in_peaple;
			if (result < peaple) {
				result = peaple;
			}
		}
		
		System.out.println(result);
	}
}
