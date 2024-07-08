package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1359_복권 {
	// boj Silver4
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		double res = 0.0;
        double p = Combination(N, M);

        while(M >= K){
            if(N - M < M - K){
                K++;
                continue;
            }

            double c = Combination(M, K) * Combination(N-M, M-K);

            res += c/p;
            K++;
        }

        System.out.println(res);
	}

	private static double Combination(int n, int m) {
		int p = 1;
        int c = 1;

        while(m > 0){
            c *= n--;
            p *= m--;
        }
        return c / p;
	}
}
