package ÆÑÅä¸®¾ó;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ÆÑÅä¸®¾ó {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N,answer;
		
		try {
			
			N = Integer.parseInt(br.readLine());
			answer = factorial(N);
			bw.write(String.valueOf(answer));
			
			bw.flush();
			bw.close();
			br.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	static int factorial(int N) {
		if(N <= 1) {
			return 1;
		}else {
			return N * factorial(N-1);
		}
	}
}
