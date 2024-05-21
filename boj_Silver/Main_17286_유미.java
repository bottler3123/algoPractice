package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_17286_유미 {
	// boj Silver5
	
	static int[] x = new int [4];
	static int[] y = new int [4];
	static boolean[] check = new boolean [4];
	static double result;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 4; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		
		result = 100000;
		find(0,0,0);
		
		System.out.println((int) result);
	}

	private static void find(int start, int cnt, double num) {
		if (cnt == 3) {
			if (result > num) {
				result = num;
			}
		}
		
		for (int i = 1; i < 4; i++) {
			if (!check[i]) {
				check[i] = true;
				double temp = Math.sqrt(Math.pow(x[start]-x[i], 2) + Math.pow(y[start]-y[i], 2));
				find(i, cnt+1, num + temp);
				check[i] = false;
			}
		}
		
	}
}
