package algo0408;

import java.util.Scanner;

public class Main_1100_하얀칸 {
	// boj Bronze2
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		for (int i = 0; i < 8; i++) {
			String temp = sc.next();
			for (int j = 0; j < 8; j++) {
				if(temp.charAt(j) == 'F' ) {
					if ((i % 2 == 0 &&  j % 2 == 0) || (i % 2 == 1 && j % 2 == 1)) {
						result ++;
					}
				}
			}
		}
		System.out.println(result);
	}
}
