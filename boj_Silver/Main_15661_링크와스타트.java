package algo0408;

import java.util.*;
import java.io.*;

public class Main_15661_링크와스타트 {
	static int N, result;
	static int [][] arr;

	public static void main(String [] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    N = Integer.parseInt(br.readLine());
	    arr = new int [N][N];
	    for (int i = 0; i < N; i++) {
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        for (int j = 0; j < N; j++) {
	            arr[i][j] = Integer.parseInt(st.nextToken());
	        }
	    }
	    
	    boolean [] check = new boolean [N];
	    result = Integer.MAX_VALUE;
	    
	    for (int i = 1; i < N-1; i++) {
	    	perm(0,0,i,check);			
		}
	    System.out.println(result);
	}

	private static void perm(int cnt, int num,int end,boolean[] check) {
	    if (cnt == end) {
	    	int startpow = 0;
	    	int linkpow = 0;
	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < N; j++) {
	                if (true && check[i] && check[j]) {
						startpow += arr[i][j];
					} else if(true && !check[i] && !check[j]) {
						linkpow += arr[i][j];
					}
	            }
	        }
	        
	        if (Math.abs(linkpow-startpow) < result) {
				result = Math.abs(linkpow-startpow);
			}
	        
	        return;
	    }
	    
	    for (int i = num; i < N; i++) {
	        check[i] = true;
	        cnt++;
	        perm(cnt,i+1,end,check);
	        cnt--;
	        check[i] = false;
	    }
	}
}
