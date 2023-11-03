package algo0408;

import java.util.Scanner;

public class Main_15727_조별과제를하려는데조장이사라졌다 {
	// boj Bronze5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		
		if (L % 5 == 0) {
			System.out.println(L / 5);
		} else {
			System.out.println(L / 5 + 1);
		}
	}
}
