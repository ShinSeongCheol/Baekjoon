package 배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 최소_최대 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int min,max;
		
		try {
			
			int num = Integer.parseInt(br.readLine());
			int[] N = new int[num];
			String[] str = new String[num];
			
			str = br.readLine().split(" "); 
			
			for(int i=0; i<num; i++)
				N[i] = Integer.parseInt(str[i]);
			
			min = N[0];
			max = N[0];
			
			for(int i=0; i<num; i++) {
				
				if(min>N[i])
					min = N[i];
				
				if(max < N[i])
					max = N[i];
				
			}
			
			bw.write(min + " " + max);
			bw.flush();
			
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
