package algo0408;

import java.util.*;

public class Main_1652_누울자리를찾아라 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		char map [][] = new char [N][N];
		for (int i = 0; i < N; i++) {
			String line = sc.next();
			for (int j = 0; j < N; j++) {
				map[i][j] = line.charAt(j);
//				System.out.print(map[i][j]);
			}
//			System.out.println();
		}
		sc.close();
		
		int width = 0;
		int height = 0;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0 ; j < N ; j++) {
				if (j+2 < N) {
					if (map[i][j] == '.' && map[i][j+1] == '.' && map[i][j+2] == 'X') width++;
					if (map[j][i] == '.' && map[j+1][i] == '.' && map[j+2][i] == 'X') height++;			
				}
			}
			if (N-2 >= 0) {
				if (map[i][N-2] == '.' && map[i][N-1] == '.') width++;
				if (map[N-2][i] == '.' && map[N-1][i] == '.') height++;
			}
//			System.out.println(width +  " " + height);
		}
		
		System.out.print(width +  " " + height);
	}
}
