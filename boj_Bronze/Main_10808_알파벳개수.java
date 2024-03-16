package algo;

import java.util.Scanner;

public class Main_10808_알파벳개수 {
	// boj Bronze4
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int [26];
		String str = sc.next();
		
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i) - 'a']++;
		}
		
		for (int i = 0; i < 26; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
