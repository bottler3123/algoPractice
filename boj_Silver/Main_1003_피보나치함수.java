package algo0408;

import java.util.*;

public class Main_1003_피보나치함수 {
	// boj Silver3
	
	static Integer [][] fibo_check;
	
	public static void main (String [] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		fibo_check = new Integer [41][2];
		fibo_check[0][0] = 1;
		fibo_check[0][1] = 0;
		fibo_check[1][0] = 0;
		fibo_check[1][1] = 1;
		
		fibo(40);
		
		for (int t = 0; t < T; t++) {
			int num = sc.nextInt();
			System.out.println(fibo_check[num][0] + " " + fibo_check[num][1]);
		}
		

	}
	
	public static Integer[] fibo(int num) {
		
		if (fibo_check[num][0] == null || fibo_check[num][1] == null) {
			fibo_check[num][0] = fibo(num - 1)[0] + fibo(num-2)[0];
			fibo_check[num][1] = fibo(num - 1)[1] + fibo(num-2)[1];
		}
		
		return fibo_check[num];
	}
}
