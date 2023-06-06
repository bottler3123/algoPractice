package algo0408;

import java.util.*;

public class Main_1075_나누기 {
	// boj Bronze2
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int F = sc.nextInt();
		
		int num = N / 100 * 100;
		int small_num = num / F * F % 100;
		int big_num =  (num / F + 1) * F % 100 ;
		
//		System.out.println(small_num + " " + big_num);
		if (small_num < big_num) {
			if (small_num/10 == 0) {
				System.out.println("0"+small_num);				
			} else {
				System.out.println(small_num);				
			}
		} else {
			if (big_num/10 == 0) {
				System.out.println("0"+big_num);				
			} else {
				System.out.println(big_num);				
			}
		}
	}
}
