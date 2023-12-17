package algo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main_11478_서로다른부분문자열의개수 {
	// boj Silver3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int len = str.length();
		
		Set<String> set = new HashSet<>();
		
		for (int i = 1; i <= len; i++) {
			for (int j = 0; j <= len - i; j++) {
//				System.out.println(str.substring(j,j+i));
				set.add(str.substring(j, j+i));
			}
		}
		
		System.out.println(set.size());
	}
}
