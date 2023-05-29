package algo0408;

import java.util.Arrays;
import java.util.Scanner;

public class Main_1059_좋은구간 {
	// boj Silver4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		int [] arr = new int [L];
		for (int i = 0; i < L; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int n = sc.nextInt();
		
		int min_num = 0;
		int max_num = 0;
		int shot_distance = 0;
		
		if (n < arr[0]) {
			min_num = 0;
			max_num = arr[0];
			if (max_num - n > n - min_num) {
				shot_distance = n - min_num;
			} else {
				shot_distance = max_num - n;
			}
		} else {
			for (int i = 0; i < L -1; i++) {
				if (arr[i] <= n && arr[i+1] >= n ) {
					min_num = arr[i];
					max_num = arr[i+1];
					if (max_num - n > n - min_num) {
						shot_distance = n - min_num;
					} else {
						shot_distance = max_num - n;
					}
					break;
				}
			}
		}
		
		int distance = max_num - min_num;
		int result = 0;
		
		if (n == min_num || n == max_num || min_num + 2 == max_num) {
			result = 0;
		} else {
			for (int i = 2; i <= shot_distance; i++) {
				result += i;
//				System.out.println("sum + : " + i);
			}
			for (int i = shot_distance+ 1; i <= distance; i++) {
				if (distance - i >= shot_distance) {
					result += shot_distance;
//					System.out.println("sum + : " + shot_distance);
				} else {
					result += distance - i;
//					System.out.println("sum : " + (distance - i));
				}
			}
		}
		
		System.out.println(result);
	}
}
