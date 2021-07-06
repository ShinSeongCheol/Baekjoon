package 기본_수학1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ACM_호텔 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str[] = new String[3];
		int T,H,W,N;
		int room=0;
		
		try {
			T = Integer.parseInt(br.readLine());
			
			for(int i=0; i<T; i++) {
				
				str = br.readLine().split(" ");
				H = Integer.parseInt(str[0]);
				W = Integer.parseInt(str[1]);
				N = Integer.parseInt(str[2]);
				
				for(int j=1; j<=W; j++) {
					
					if(j*H >= N) {
						room = (N-((j-1)*H))*100 + j;
						break;
					}
					
				}
				
				
				bw.write(room + "\n");
				
			}
			bw.flush();
			bw.close();
			br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
