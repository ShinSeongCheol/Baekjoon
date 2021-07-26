package 재귀;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 피보나치_수_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n,answer;
		
		try {
			
			n = Integer.parseInt(br.readLine());
			answer = fibonacci(n);
			bw.write(String.valueOf(answer));
			
			bw.flush();
			bw.close();
			br.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	static int fibonacci(int n) {
		
		if(n==0) {
			return 0;
		}else if(n == 1) {
			return 1;
		}else if(n > 1) {
			return fibonacci(n-1) + fibonacci(n-2);
		}
		
		return 0;
	}
	
}
