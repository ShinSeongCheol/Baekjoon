package 동적_계획법_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 파도반_수열 {
public static long[] memo = new long[101];

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		memo[1] = 1;
		memo[2] = 1;
		memo[3] = 1;
		memo[4] = 2;
		memo[5] = 2;
		memo[6] = 3;
		memo[7] = 4;
		memo[8] = 5;
		memo[9] = 7;
		memo[10] = 9;
		
		for(int i=0; i<T; i++) {
			int num = Integer.parseInt(br.readLine());
			P(num);
			sb.append(memo[num]).append('\n');
		}
		
		System.out.println(sb);
		br.close();
	}
	
	public static long P(int N) {
		if(N == 0) {
			return 0;
		}
		
		if(memo[N] == 0) {
			return memo[N] = P(N-1) + P(N-5);
		}
		
		return memo[N]; 
	}
}

