package algo;

import java.util.*;
import java.io.*;

public class Main_10973_이전순열 {
	// boj Silver3
	
	static int N;
	static int [] arr;
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		if (perm()) {
			for (int i = 0; i < N; i++) {
				System.out.print(arr[i] + " ");
			}
		} else {
			System.out.print(-1);
		}
	}
	
	private static boolean perm() {
		int i = N -1;
		while(i > 0 && arr[i -1] <= arr[i]) {
			i--;
		}
		if (i == 0) {
			return false;
		}
		int j = N - 1;
		while (arr[i-1] <= arr[j]) {
			j--;
		}
		swap(i - 1 , j);
		j = N - 1;
		while(i < j) {
			swap(i,j);
			i++;
			j--;
		}
		return true;
	}
	
	private static void swap(int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

}
