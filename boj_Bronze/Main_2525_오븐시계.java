package algo0408;

import java.util.*;

public class Main_2525_오븐시계 {
	// boj Bronze3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int cook = sc.nextInt();
		
		int overhour = (minute + cook) / 60;
		minute = (minute+cook) % 60;
		hour = (hour+overhour) % 24;
		
		System.out.println(hour + " " + minute);
	}
}
