package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main_2870_수학숙제 {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		List<BigInteger> list = new ArrayList<BigInteger>();
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 98; j < 123; j++) {
				str = str.replace((char) j, 'a');
			}
			
			String[] arr = str.split("a");
			
			for (int j = 0; j < arr.length; j++) {
				if (!arr[j].equals("")) {					
					list.add(new BigInteger(arr[j]));
				}
			}
		}
		
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
