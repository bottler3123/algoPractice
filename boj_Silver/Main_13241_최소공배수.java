package algo0408;

import java.util.Scanner;

public class Main_13241_최소공배수 {
	// boj Silver5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long LCM = 0;
		long GCD = 0;
		long num = 0;
		
		if (A > B) {
			num = B;
			GCD = A % B;
		} else if (B > A) {
			num = A;
			GCD = B % A;
		} else {
			num = GCD = A;
		}
		
		if (GCD != 0) {
			while (num % GCD != 0) {
				long temp = GCD;
				GCD = num % GCD;
				num = temp;
			}			
			LCM = A * B / GCD;
		} else {
			LCM = A > B ? A : B;
		}
		
		System.out.println(LCM);
	}
}
