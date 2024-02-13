package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1331_나이트투어 {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean [][] map = new boolean [6][6];
		
		String start = br.readLine();
		int startx = start.charAt(1) - '1';
		int starty = start.charAt(0) - 'A';
		int prex = startx;
		int prey = starty;
		String result = "Valid";
		
		map[startx][starty] = true;
		for (int i = 0; i < 35; i++) {
			String knight = br.readLine();
			int x = knight.charAt(1) - '1';
			int y = knight.charAt(0) - 'A';
			
			if (Math.abs(x - prex) == 2 && Math.abs(y - prey) == 1 || Math.abs(x - prex) == 1 && Math.abs(y - prey) == 2) {
				if (!map[x][y]) {
					map[x][y] = true;
					prex = x;
					prey = y;
				} else {
					result = "Invalid";
					break;
				}				
			} else {
				result = "Invalid";
				break;
			}
		}
		
		if (Math.abs(startx - prex) == 2 && Math.abs(starty - prey) == 1 || Math.abs(startx - prex) == 1 && Math.abs(starty - prey) == 2) {
			
		} else {			
			result = "Invalid";
		}
		
		System.out.println(result);
	}
}