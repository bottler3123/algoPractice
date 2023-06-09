package algo0408;

import java.util.Scanner;

public class Main_2442_별찍기5 {
	// boj Bronze3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 1; i <= N; i++) {
	      for(int j = i; j < N; j++) {
	        System.out.print(" ");
	      }
	      for(int k = 0; k < i*2-1; k++) {
	        System.out.print("*");
	      }
	      System.out.println();
	    }
	}
}
