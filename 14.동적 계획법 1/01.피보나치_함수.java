package 동적_계획법_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치_함수 {
	public static int[] memo = new int[100];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		memo[0] = 0;
		memo[1] = 1;
		
		for(int i=0; i<T; i++) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				sb.append("1 0\n");
			}else if(n == 1) {
				sb.append("0 1\n");
			}else {
				fibonacci(n);
				sb.append(memo[n-1]).append(" ").append(memo[n]).append("\n");
			}
			
		}

		System.out.println(sb);
	}

	public static int fibonacci(int n) {
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}
		
		if(memo[n] != 0) {
			return memo[n];
		}else {
			return memo[n] = fibonacci(n-1) + fibonacci(n-2);
		}
	}
}
