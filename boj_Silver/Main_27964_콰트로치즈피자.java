package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main_27964_콰트로치즈피자 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Set<String> set = new HashSet<>();
		
		for (int i = 0; i < cnt; i++) {
			String str = st.nextToken();
			int num = str.length();
//			System.out.println(num + " " + str.substring(num - 6, num));
			if (str.length() >= 6 && str.substring(num - 6, num).equals("Cheese")) {
				set.add(str);
			}
		}
		
//		System.out.println(set.size());
		if (set.size() >= 4) {
			System.out.println("yummy");
		} else {
			System.out.println("sad");
		}
	}
}
