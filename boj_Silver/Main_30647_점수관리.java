package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main_30647_점수관리 {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		student[] arr = new student[N];
		
		for (int i = 0; i < N; i++) {
			String temp = br.readLine();
			temp = temp.replace("[", "").replace("]", "").replace("{\"name\":\"", "").replace("\",\"score\":", "/").replace(",\"isHidden\":", "/").replace("},", "").replace("}", "");
			
			String[] split = temp.split("/");
			arr[i] = new student(split[0], Integer.parseInt(split[1]), split[2].equals("0") ? false : true);
		}
		
		Arrays.sort(arr, new Comparator<student>() {
			@Override
			public int compare(student o1, student o2) {
				if (o2.score == o1.score) {
					return o1.name.compareTo(o2.name);
				}
				return o2.score - o1.score;
			}
		});

		int rank = 1;
		int cnt = 0;
		int score = arr[0].score;
		
		for (int i = 0; i < N; i++) {
			if (arr[i].score == score) {
				cnt++;
			} else {
				if (cnt > 0) {
					rank += cnt;
					cnt = 1;					
				} else {
					rank++;
				}
			}
			
			if (!arr[i].isHidden) {
				System.out.println(rank + " " + arr[i].name + " " + arr[i].score);				
			}
			
			score = arr[i].score;
		}
	}
	
	public static class student {
		String name;
		int score;
		boolean isHidden;
		
		public student(String name, int score, boolean isHidden) {
			this.name = name;
			this.score = score;
			this.isHidden = isHidden;
		}
	}
}
