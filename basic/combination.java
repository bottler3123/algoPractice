package basic;

import java.util.Scanner;

public class combination {
	// 조합
	static int n, r;
	static int[] arr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		r = sc.nextInt();
		
		arr = new int [n+1];
		for (int i = 1; i <= n; i++) {
			arr[i] = i;
		}
		
		comb_math();
		comb(0,1,"");
	}
	
	// n개의 수에서 r개를 뽑는 경우의 수 (순서 상관 없음)
	public static void comb(int start, int num, String str) {
		if (start == r) {
			System.out.println(str);
			return;
		}
		
		for (int i = num; i <= n; i++) {
			comb(start+1,i+1,str + String.valueOf(arr[i]) + " ");
		}
	}
	
	public static void comb_math() {
		System.out.println("n개 중 r개를 뽑는 경우의 수 : " + facto(n) / facto(n - r) / facto(r));
	}
	
	public static int facto(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * facto(n-1);
		}
	}
}
