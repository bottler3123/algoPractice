package algo;

import java.util.*;
import java.io.*;

public class Main_2003_수들의합2 {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int [] arr = new int [N];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 0;
		
		int start = 0;
		int end = 0;
		int sum = 0;
		
		while(end < N) {
//			System.out.println("시작 : " + start + " 끝 : " + end + " answer : " + answer + " " + sum);
			if (sum < M) {
				sum += arr[end];
				end++;
			} else if (sum == M) {
				answer ++;
				sum -= arr[start];
				start++;
			} else {
				sum -= arr[start];
				start++;
			}
		}
		
		while (start < end) {
			if (sum == M) {
				answer++;
				break;
			} else if (sum > M) {
				sum -= arr[start];
				start++;
			} else {
				break;
			}
		}
		
		// 1안
//		for (int i = 0; i < N-1; i++) { 
//			// 탈출 조건 만들기
//			if (arr[i] > M) continue;
//			boolean break_check = false;
//			for (int j = i; j < N; j++) {
//				// 이미 총 합이 M보다 크면 그 이후를 더할 필요가 없다
//				if (break_check) {
//					break;
//				}
//				int arr_sum = 0;
//				// 총 합 더하기
//				for (int check = i; check <= j; check++) {
//					arr_sum += arr[check];
//					if (arr_sum > M) {
//						break_check = true;
//						break;
//					}
//				}
//				if (arr_sum == M) {
////					System.out.println("시작 : " + i + " 끝 : " + j);
//					answer++;
//				}
//			}
//		}
		
		System.out.println(answer);
	}

}
