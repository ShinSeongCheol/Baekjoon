package 기본_수학2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 네_번째_점 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str;
		
		int[] x = new int[4];
		int[] y = new int[4];
		int[] locX = new int[1001];
		int[] locY = new int[1001];
		
		try {
		
			for(int i=0; i<3; i++) {
				
				str = br.readLine().split(" ");
				x[i] = Integer.parseInt(str[0]);
				y[i] = Integer.parseInt(str[1]);
				
			}
			
			for(int i=0; i<3; i++) {
				
				locX[x[i]]++;
				locY[y[i]]++;
				
			}
						
			for(int i=0; i<locX.length; i++) {
				
				if(locX[i] == 1) {
					x[3] = i;
				}
				
				if(locY[i] == 1) {
					y[3] = i;
				}
				
			}
			
			bw.write(x[3] + " " + y[3]);
			bw.flush();
			bw.close();
			br.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
