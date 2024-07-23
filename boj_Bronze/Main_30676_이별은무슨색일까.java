package algo;

import java.util.Scanner;

public class Main_30676_이별은무슨색일까 {
	// boj Bronze5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num >= 620) {
			System.out.println("Red");
		} else if (num >= 590) {
			System.out.println("Orange");
		} else if (num >= 570) {
			System.out.println("Yellow");
		} else if (num >= 495) {
			System.out.println("Green");
		} else if (num >= 450) {
			System.out.println("Blue");
		} else if (num >= 425) {
			System.out.println("Indigo");
		} else {
			System.out.println("Violet");
		}
	}
}
