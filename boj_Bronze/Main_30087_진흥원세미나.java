package algo;

import java.util.Scanner;

public class Main_30087_진흥원세미나 {
	// boj Bronze5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N+1; i++) {
			String str = sc.nextLine();
			switch (str) {
				case "Algorithm":
					System.out.println("204");
					break;
				case "DataAnalysis":
					System.out.println("207");
					break;
				case "ArtificialIntelligence":
					System.out.println("302");
					break;
				case "CyberSecurity":
					System.out.println("B101");
					break;
				case "Network":
					System.out.println("303");
					break;
				case "Startup":
					System.out.println("501");
					break;
				case "TestStrategy":
					System.out.println("105");
					break;
			}
		}
	}
}
