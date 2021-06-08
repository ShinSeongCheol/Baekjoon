package ¹è¿­;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ÃÖ´ñ°ª {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] N = new int[9];
		int max_N, count = 1;
		
		try {
			
			for(int i=0; i<9; i++)
				N[i] = Integer.parseInt(br.readLine());
			
			max_N = N[0];
			
			for(int i=0; i<9; i++) {
				
				if(max_N < N[i]) {
					
					max_N = N[i];
					count = i + 1;
					
				}
				
			}
			
			bw.write(max_N + "\n" + count);
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
