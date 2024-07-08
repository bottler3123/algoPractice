package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_1340_연도진행바 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st= new StringTokenizer(br.readLine());
		String[] months = {"January","February","March","April",
				"May","June","July","August","September","October",
				"November","December"};
		int[] month_day= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int totalday=0;
		int totalminute=0;
		
		String str="";

		str = st.nextToken();
		int month=0;
		for(int i=0;i<months.length;i++) {
			if(months[i].equals(str)) {
				month=i;
				break;
			}
		}
		str= st.nextToken();
		
		int day= Integer.parseInt(str.substring(0,2));
		int n=0;
		int year = Integer.parseInt(st.nextToken());
		if(is_leap(year)) {
			n=527040;
		}else {
			n=525600;
		}
		
		for(int i=0;i<month;i++) {
			totalday+=month_day[i];
			if(i==1) {
				if(is_leap(year)) {
					totalday+=1;
				}
			}
		}

		totalday+=day-1;
		totalminute= totalday* 24 * 60;

		String arr[] = (st.nextToken()).split(":");
		
		int time = Integer.parseInt(arr[0]);
		int minute = Integer.parseInt(arr[1]);
		
		totalminute += time*60 + minute;
		
		double result = (double)totalminute/n * 100;

		bw.write(String.valueOf(result));
		
		bw.flush();
		bw.close();
		br.close();
	}
	public static boolean is_leap(int year) {
		if(year%4==0) {
			if(year%100 == 0) {
				if(year%400==0) {
					return true; 
				}else {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}
