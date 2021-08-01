package 브루트포스;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 덩치 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N,x,y;
		int body[][];
		String[] str = new String[2];
		
		try {
			
			N = Integer.parseInt(br.readLine());
			body = new int[N][2];
			
			for(int i=0; i<N; i++) {
				
				str = br.readLine().split(" ");
				x = Integer.parseInt(str[0]);
				y = Integer.parseInt(str[1]);
				
				body[i][0] = x;
				body[i][1] = y;
				
			}
			
			for(int i=0; i<N; i++) {
				
				int count = 1;
			
				for(int j=0; j<N; j++) {
					
					if(body[i][0] < body[j][0] && body[i][1] < body[j][1]) {
						count++;
					}
					
				}
				
				bw.write(String.valueOf(count) + " ");
				
			}
			
			bw.flush();
			bw.close();
			br.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
