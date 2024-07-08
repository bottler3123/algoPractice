package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_10709_기상캐스터 {
	// boj Silver5
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
		
		int cloud;
        for(int h = 0; h < H; h++){
            String sky = br.readLine();
            cloud = -1;
            for(int w = 0; w < W; w++){
                if(sky.charAt(w)=='c') {
                    bw.append("0 ");
                    cloud = w;
                } else if(cloud == -1) {
                	bw.append("-1 ");
                } else {
                	bw.append((w-cloud) + " ");
                }
            }
            bw.append("\n");
        }
        
        bw.flush();
        bw.close();
	}
}
