package algo0408;

import java.util.*;
import java.io.*;

public class Main_2529_부등호 {
	// boj Silver1
	
    static int k;
    static long maxresult, minresult;
    static String [] sign;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        k = Integer.parseInt(st.nextToken());
        sign = new String [k];
        boolean check[] = new boolean[10];
        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < k; i++) {
            sign[i] = st.nextToken();
        }

        maxresult = Long.MIN_VALUE;
        minresult = Long.MAX_VALUE;
        int arr [] = new int [k+1];
        perm(0, arr, check);

	    long chg = Long.toString(maxresult).length();
	    for (int i = 0; i < k  + 1- chg; i++) {
	        System.out.print("0");
	    }
	    System.out.println(maxresult);
	    
	    chg = Long.toString(minresult).length();
	    for (int i = 0; i < k + 1 - chg; i++) {
	        System.out.print("0");
	    }
	    System.out.println(minresult);
	    
	}

	private static void perm(int cnt, int [] arr, boolean [] check) {
	    if (cnt == k+1) {
	        long result = 0;
	        for (int i = 0; i < k+1; i++) {
	            result += arr[i] * Math.pow(10, k-i);
	        }
	        if (maxresult < result) {
	            maxresult = result;
	        }
	        if (minresult > result) {
	            minresult = result;
	        }
	        return;
	    }
	    
	    for (int i = 0; i < 10; i++) {
	        if (check[i]) continue;
	        // 숫자 중복 사용여부 체크
	        
	        if (cnt == 0) {
	            arr[cnt] = i;
	            check[i] = true;
	            perm(cnt+1,arr,check);
	            check[i] = false;
	            // 첫번째 숫자 체킹
	        } else if (sign[cnt-1].matches("<") && (arr[cnt-1] < i) && !check[i]) {
	            arr[cnt] = i;
	            check[i] = true;
	            perm(cnt+1,arr,check);
	            check[i] = false;
	        } else if((sign[cnt-1].matches(">") && (arr[cnt-1] > i) && !check[i])){
	            arr[cnt] = i;
	            check[i] = true;
	            perm(cnt+1,arr,check);
	            check[i] = false;
	        }
	        // 부등호에 따라 맞는 값을 저장
	        
	    }
	}
}