package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_3054_피터팬프레임 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] sArr = new String[5];
				
		sArr[0] = "..#..";
		sArr[4] = "..#..";
		for(int i=1; i< str.length(); i++) {
			if(i%3 == 2) {	
				sArr[0] += ".*..";
				sArr[4] += ".*..";
			}	
			else {
				sArr[0] += ".#..";
				sArr[4] += ".#..";
			}
		}
		
		sArr[1] = ".#.#.";
		sArr[3] = ".#.#.";
		for(int i=1; i<str.length(); i++) {
			if(i%3 == 2) {
				sArr[1] += "*.*.";
				sArr[3] += "*.*.";
			}
			else {
				sArr[1] += "#.#.";
				sArr[3] += "#.#.";
			}
		}
		
		sArr[2] = "#." + str.charAt(0) + ".#";
		for(int i=1; i<str.length(); i++) {
			if(i%3 == 1) {
				sArr[2] += "." + str.charAt(i);
				if(i == str.length()-1) 
					sArr[2] += ".#";
				else 
					sArr[2] += ".*";
			}
			else if(i%3 == 2) {
				sArr[2] += "." + str.charAt(i) + ".*";
			}
			else {
				sArr[2] += "." + str.charAt(i) + ".#"; 
			}
		}
		
		for(int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
	}
}
