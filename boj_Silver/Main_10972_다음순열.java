package algo0408;

import java.util.*;
import java.io.*;

public class Main_10972_다음순열 {
	// boj Silver3
	
	static int N;
	static int[] arr;
	
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
		int i = arr.length - 1;
		while(i > 0 && arr[i-1] >= arr[i]) {
			i--;
		}
		if( i <= 0) return false;
		int j = arr.length - 1;
		while(arr[j] <= arr[i-1]) {
			j--;
		}
		swap(i-1,j);
		j=arr.length -1;
		while(i < j) {
			swap(i,j);
			i++;
			j--;
		}
		return true;
	}
	
	private static void swap(int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
