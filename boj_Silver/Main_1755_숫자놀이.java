package algo0408;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main_1755_숫자놀이 {
	// boj Silver4
	
	static String[] dic = {"zero","one","two","three","four","five","six","seven","eight","nine"};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		List<number> list = new LinkedList<>();
		for (int i = M; i <= N; i++) {
			String temp = String.valueOf(i);
			String str = "";
			
			for (int j = 0; j < temp.length(); j++) {
				str += dic[temp.charAt(j) - '0'] + " ";
			}
			list.add(new number(i,str));
		}
		
		Collections.sort(list, new Comparator<number>() {
			@Override
			public int compare(number o1, number o2) {
				return o1.num_str.compareTo(o2.num_str);
			}
		});
		
		for (int i = 0; i <=  N - M; i++) {
			if (i != 0 && i % 10 == 0) {
				System.out.println();
			}
			System.out.print(list.get(i).num + " ");
		}
	}
	
	public static class number {
		int num;
		String num_str;
		
		public number(int num, String num_str) {
			this.num = num;
			this.num_str = num_str;
		}
	}
}
