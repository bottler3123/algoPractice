package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main_11068_회문인수 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			int num = Integer.parseInt(br.readLine());
            boolean chk = false;
            for (int r = 2; r <= 64 && !chk; r++) {
                chk = isPalindrome(num, r);
            }
            if (chk) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
		
	}
	
	public static boolean isPalindrome(int n, int radix) {
		ArrayList<Integer> convert = new ArrayList<>();
		while (n != 0) {
			convert.add(n%radix);
			n/=radix;
		}
		for (int i = 0; i < convert.size()/2; i++) {
			if (convert.get(i) != convert.get(convert.size()-1-i))
				return false;
		}
		return true;
	}
}
