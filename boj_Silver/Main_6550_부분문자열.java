package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_6550_부분문자열 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
        while((str = br.readLine()) != null) {
        	StringTokenizer st = new StringTokenizer(str);
        	String s = st.nextToken();
        	String t = st.nextToken();
        	
        	int num = 0;
        	for (int i = 0; i < t.length(); i++) {
				if (s.charAt(num) == t.charAt(i)) {
					num++;
				}
				if (num == s.length()) {
					break;
				}
			}
        	
        	if (num == s.length()) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
        }
	}
}
