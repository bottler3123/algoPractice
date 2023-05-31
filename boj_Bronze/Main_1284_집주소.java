package algo0408;

import java.util.*;

public class Main_1284_집주소 {
	// boj Bronze3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String door_num = sc.next();
			
			if (door_num.equals("0")) {
				break;
			}
			
			int result = 2;
			result = result + door_num.length() - 1;
			
			for (int i = 0; i < door_num.length(); i++) {
				char temp = door_num.charAt(i);
				if (temp == '1') {
					result += 2;
				} else if (temp == '0') {
					result += 4;
				} else {
					result += 3;
				}
			}
			
			System.out.println(result);
		}
		
	}
}
