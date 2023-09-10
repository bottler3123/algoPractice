package algo0408;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_1996_지뢰찾기 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String [][] map = new String [N][N];
		String [][] result = new String [N][N];
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				map[i][j] = String.valueOf(str.charAt(j));
				result[i][j] = "0";
			}
		}
		
		int [] px = {-1,-1,-1,0,0,1,1,1};
		int [] py = {-1,0,1,-1,1,-1,0,1};
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!map[i][j].equals(".")) {
					result[i][j] = "*";
					int num = Integer.parseInt(map[i][j]);
					for (int k = 0; k < 8; k++) {
						int x = i + px[k];
						int y = j + py[k];
						if (x < N && x >= 0 && y < N && y >= 0 && !result[x][y].equals("*") && result[x][y] != "M") {
							int temp = Integer.parseInt(result[x][y]);
							if (num + temp > 9) {
								result[x][y] = "M";
							} else {
								result[x][y] = String.valueOf(num + temp);								
							}
						}
					}
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				bw.append(result[i][j]);
			}
			bw.append("\n");
		}
		bw.flush();
		bw.close();
	}
}
