package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1969_DNA {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		char map[][] = new char [N][R];
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < R; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		String result_dna = "";
		int result = 0;
		
		for (int i = 0; i < R; i++) {
			int[] dna = new int [4];
			int cnt = 0;
			int num = 0;
			for (int j = 0; j < N; j++) {
				switch (map[j][i]) {
				case 'A':
					dna[0]++;
					break;
				case 'C':
					dna[1]++;
					break;
				case 'G':
					dna[2]++;
					break;
				case 'T':
					dna[3]++;
					break;
				}
			}
			
			for (int j = 0; j < 4; j++) {
				if (dna[j] > cnt) {
					cnt = dna[j];
					num = j;
				}
			}
			
			switch (num) {
			case 0:
				result_dna += 'A';
				break;
			case 1:
				result_dna += 'C';
				break;
			case 2:
				result_dna += 'G';
				break;
			case 3:
				result_dna += 'T';
				break;
			}
			result += N - cnt;
		}
		
		System.out.println(result_dna);
		System.out.println(result);
	}
}
