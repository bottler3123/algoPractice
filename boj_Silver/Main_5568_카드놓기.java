package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main_5568_카드놓기 {
	// boj Silver4
	
	static int n,k;
	static int[] arr;
	static HashSet<String> result = new HashSet<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		k = Integer.parseInt(br.readLine());
		arr = new int [n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		comb(0,0,new int[k]);
		System.out.println(result.size());
	}

	private static void comb(int cnt, int num, int[] choice) {
		if (cnt == k) {
			make(choice,new boolean [k],0,"");
			return;
		}
		
		for (int i = num; i < n; i++) {
			choice[cnt] = arr[i];
			comb(cnt+1, i+1, choice);
			choice[cnt] = 0;
		}
	}

	private static void make(int[] choice, boolean[] check, int num, String str) {
		if (num == k) {
			result.add(str);
			return;
		}
		
		for (int i = 0; i < k; i++) {
			if (!check[i]) {
				check[i] = true;
				make(choice, check, num+1, str + String.valueOf(choice[i]));
				check[i] = false;
			}
		}
	}
}
