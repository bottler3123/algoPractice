package algo0408;

import java.util.*;
import java.io.*;

public class Main_1063_킹 {
	// boj Silver3
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String king = st.nextToken();
		int king_x = 0;
		int king_y = 0;
		String stone = st.nextToken();
		int stone_x = 0;
		int stone_y = 0;
		int num = Integer.parseInt(st.nextToken());

		String [][] board = new String [8][8];
		
		for (int i = 7; i >= 0; i--) {
			for (int j = 0; j < 8; j++) {
				board[i][j] = Character.toString((char) (j+65)) + Integer.toString(i+1);
				if (board[i][j].equals(king)) {
					king_x = i;
					king_y = j;
				}
				if (board[i][j].equals(stone)) {
					stone_x = i;
					stone_y = j;
				}
//				System.out.print(board[i][j] + " ");
			}
//			System.out.println();
		}
//		System.out.println("시작 킹 위치 : " + board[king_x][king_y]+ " 돌 위치 : " + board[stone_x][stone_y]);
		
		for (int i = 0; i < num; i++) {
			String move = br.readLine();
			
			switch (move) {
			case "R":
				if (king_y+1 < 8) {
					king_y++;
					if (king_y == stone_y && king_x == stone_x) {
						if (stone_y+1 < 8) {
							stone_y++;
						} else {
							king_y--;
						}
					}
				}
				break;
			case "L":
				if (king_y-1 >= 0) {
					king_y--;
					if (king_y == stone_y && king_x == stone_x) {
						if (stone_y-1 >= 0) {
							stone_y--;
						} else {
							king_y++;
						}
					}
				}
				break;
			case "B":
				if (king_x-1 >= 0) {
					king_x--;
					if (king_y == stone_y && king_x == stone_x) {
						if (stone_x-1 >= 0) {
							stone_x--;
						} else {
							king_x++;
						}
					}
				}
				break;
			case "T":
				if (king_x+1 < 8) {
					king_x++;
					if (king_y == stone_y && king_x == stone_x) {
						if (stone_x+1 < 8) {
							stone_x++;
						} else {
							king_x--;
						}
					}
				}
				break;
			case "RT":
				if (king_y+1 < 8 && king_x+1 < 8) {
					king_x++;
					king_y++;
					if (king_y == stone_y && king_x == stone_x) {
						if (stone_y+1 < 8 && stone_x+1 < 8) {
							stone_y++;
							stone_x++;
						} else {
							king_y--;
							king_x--;
						}
					}
				}
				break;
			case "LT":
				if (king_y-1 >= 0 && king_x+1 < 8) {
					king_x++;
					king_y--;
					if (king_y == stone_y && king_x == stone_x) {
						if (stone_y-1 >= 0 && stone_x+1 < 8) {
							stone_y--;
							stone_x++;
						} else {
							king_y++;
							king_x--;
						}
					}
				}
				break;
			case "RB":
				if (king_y+1 < 8 && king_x-1 >= 0) {
					king_x--;
					king_y++;
					if (king_y == stone_y && king_x == stone_x) {
						if (stone_y+1 < 8 && stone_x-1 >= 0) {
							stone_y++;
							stone_x--;
						} else {
							king_y--;
							king_x++;
						}
					}
				}
				break;
			case "LB":
				if (king_y-1 >= 0 && king_x-1 >= 0) {
					king_x--;
					king_y--;
					if (king_y == stone_y && king_x == stone_x) {
						if (stone_y-1 >= 0 && stone_x-1 >= 0) {
							stone_y--;
							stone_x--;
						} else {
							king_y++;
							king_x++;
						}
					}
				}
				break;
			}
			
//			System.out.println((i+1) + "번째 킹 위치 : " + board[king_x][king_y] + " 돌 위치 : " + board[stone_x][stone_y]);
		}
		
		System.out.println(board[king_x][king_y]);
		System.out.println(board[stone_x][stone_y]);
		
	}
}
