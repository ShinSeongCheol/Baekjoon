package 동적_계획법_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGB거리 {
	public static int[][] dp;
	public static int N;

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		dp = new int[N][3];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<3; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine()," ");
				dp[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		minValue(0);
		
	}

	public static int minValue(int depth) {
		if(depth == N) {
			return 0;
		}
		return 1;
	}
}
