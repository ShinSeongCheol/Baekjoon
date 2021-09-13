package 동적_계획법_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 피보나치_함수 {
	public static int zero;
	public static int one;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			zero = 0;
			one = 0;
			
			fibonacci(Integer.parseInt(br.readLine()));
			
			sb.append(zero).append(" ").append(one).append("\n");
		}
		
		System.out.print(sb);
		br.close();
	}
	
	public static int fibonacci(int n) {
		if(n==0) {
			zero++;
			return 0;
		}
		else if(n==1) {
			one++;
			return 1;
		}
		else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
}
