package algo;

import java.util.Scanner;

public class Main_5575_타임카드 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			int sh = sc.nextInt();
			int sm = sc.nextInt();
			int ss = sc.nextInt();
			int eh = sc.nextInt();
			int em = sc.nextInt();
			int es = sc.nextInt();
			
			int rh = 0;
			int rm = 0;
			int rs = 0;
			
			if (es < ss) {
				sm += 1;
				rs = 60 + es - ss;
			} else {
				rs = es - ss;
			}
			
			if (em < sm) {
				sh += 1;
				rm += 60 + em - sm;
			} else {
				rm += em - sm;
			}
			
			rh += eh - sh;
			System.out.println(rh + " " + rm + " " + rs);
		}
	}
}
