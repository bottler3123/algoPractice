package algo0408;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1138_한줄로서기 {
	// boj Silver2
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int [N];
		int[] line = new int [N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int num = 0;
		for (int i = N-1; i >= 0 ; i--) {
			if (arr[i] == num) {
				line[num] = i+1;
			} else {
				for (int j = num; j > arr[i]; j--) {
					line[j] = line[j-1]; 
				}
				line[arr[i]] = i+1;
			}
			
			num++;
		}
		
		for (int i = 0; i < N; i++) {
			System.out.print(line[i] + " ");
		}
	}
}
