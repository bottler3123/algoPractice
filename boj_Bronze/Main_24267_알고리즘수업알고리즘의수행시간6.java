package algo;

import java.util.Scanner;

public class Main_24267_알고리즘수업알고리즘의수행시간6 {
	// boj Bronze2
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long result = sc.nextLong();
        System.out.println(result * (result - 1) * (result - 2) / 6);
        System.out.println(3);
	}
}
