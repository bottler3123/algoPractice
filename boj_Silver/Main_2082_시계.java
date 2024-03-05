package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2082_시계 {
	// boj Silver3
	
	static char[][][] time = {
			// 0
			{
				{'#','#','#'},
				{'#','.','#'},
				{'#','.','#'},
				{'#','.','#'},
				{'#','#','#'}
				},
			// 1
			{
				{'.','.','#'},
				{'.','.','#'},
				{'.','.','#'},
				{'.','.','#'},
				{'.','.','#'}
			},			
			// 2
			{
				{'#','#','#'},
				{'.','.','#'},
				{'#','#','#'},
				{'#','.','.'},
				{'#','#','#'}
			},			
			// 3
			{
				{'#','#','#'},
				{'.','.','#'},
				{'#','#','#'},
				{'.','.','#'},
				{'#','#','#'}
			},			
			// 4
			{
				{'#','.','#'},
				{'#','.','#'},
				{'#','#','#'},
				{'.','.','#'},
				{'.','.','#'}
			},			
			// 5
			{
				{'#','#','#'},
				{'#','.','.'},
				{'#','#','#'},
				{'.','.','#'},
				{'#','#','#'}
			},			
			// 6
			{
				{'#','#','#'},
				{'#','.','.'},
				{'#','#','#'},
				{'#','.','#'},
				{'#','#','#'}
			},			
			// 7
			{
				{'#','#','#'},
				{'.','.','#'},
				{'.','.','#'},
				{'.','.','#'},
				{'.','.','#'}
			},			
			// 8
			{
				{'#','#','#'},
				{'#','.','#'},
				{'#','#','#'},
				{'#','.','#'},
				{'#','#','#'}
			},			
			// 9
			{
				{'#','#','#'},
				{'#','.','#'},
				{'#','#','#'},
				{'.','.','#'},
				{'#','#','#'}
			},			
	};
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[][] map = new char [5][15];
		
		for (int i = 0; i < 5; i++) {
			String str = br.readLine();
			for (int j = 0; j < 15; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		String result = "";
		for (int i = 0; i < 15; i += 4) {
			for (int num = 0; num < 10; num++) {
				boolean check = true;
				for (int j = 0; j < 5; j++) {
					if (check) {
						for (int k = 0; k < 3; k++) {
							if (map[j][k+i] == '#' && time[num][j][k] != map[j][k+i]) {
								check = false;
							}
						}						
					}
				}
				
				if (check) {
					result += num;
					break;
				}
			}
		}
		
		result = result.substring(0, 2) + ":" + result.substring(2,4);
		System.out.println(result);
	}
}
