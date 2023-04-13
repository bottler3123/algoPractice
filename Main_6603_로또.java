package algo0408;

import java.util.*;
import java.io.*;

public class Main_6603_로또 {

   static int k;
   static int S [];
   static int arr [];

   public static void main(String artgs[]) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      while(true) {
         StringTokenizer st = new StringTokenizer(br.readLine()," ");
         k = Integer.parseInt(st.nextToken());
         
         if (k == 0) {
            break;
         }
         
         S = new int [k];
         arr = new int [6];
         for (int i = 0; i < k; i++) {
            S[i] = Integer.parseInt(st.nextToken());
         }
         
         
         comb(0,0);
         System.out.println();
      }
   }
   
   private static void comb(int num, int cnt) {

      if (cnt == 6) {
         for (int i = 0; i < 6; i++) {
        	 System.out.print(arr[i] + " ");
         }
         System.out.println();
         return;
      }
      
      for (int i = num; i < k; i++) {
         arr[cnt] = S[i];
         comb(i+1, cnt+1);
      }
   }
   
}