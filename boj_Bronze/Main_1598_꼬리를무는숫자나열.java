package algo0408;

import java.util.Scanner;

public class Main_1598_꼬리를무는숫자나열 {
	// boj Bronze3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int map_length = A>B?A/4+1:B/4+1;
		int map [][] = new int [4][map_length];
		int a_length [] = new int [2];
		int b_length [] = new int [2];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < map_length; j++) {
				map[i][j] = i+1+j*4;
				if (map[i][j] == A) {
					a_length[0] = i;
					a_length[1] = j;
				}
				if (map[i][j] == B) {
					b_length[0] = i;
					b_length[1] = j;
				}
			}
		}
		System.out.println(Math.abs(a_length[0]-b_length[0])+Math.abs(a_length[1]-b_length[1]));
	}
}
