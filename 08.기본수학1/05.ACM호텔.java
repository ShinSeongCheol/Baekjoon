package 기본수학1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ACM호텔 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T,H,W,N;
		String[] str;
		
		try {
			T = Integer.parseInt(br.readLine());
			
			for(int i=0; i<T; i++) {
				int X,Y;
				str = br.readLine().split(" ");
				H = Integer.parseInt(str[0]);
				W = Integer.parseInt(str[1]);
				N = Integer.parseInt(str[2]);
				
				if(N%H == 0) {
					Y = H;
					X = (N/H);
				}else {
					Y = N%H;
					X = (N/H) + 1;
				}
				
				
				if(X<10) {
					bw.write(Integer.toString(Y) + "0" + Integer.toString(X) + "\n");
				}else {
					bw.write(Integer.toString(Y) + Integer.toString(X) + "\n");
				}
				bw.flush();
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				br.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
