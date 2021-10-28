package 동적_계획법_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 *         7
 *         3   8
 *             8   1   0
 *             2   7   4   4
 *             4   5   2   6   5
 *             위 그림은 크기가 5인 정수 삼각형의 한 모습이다.
 *             
 *             맨 위층 7부터 시작해서 아래에 있는 수 중 하나를 선택하여 아래층으로 내려올 때, 이제까지 선택된 수의 합이 최대가 되는 경로를 구하는 프로그램을 작성하라.
 *             아래층에 있는 수는 현재 층에서 선택된 수의 대각선 왼쪽 또는 대각선 오른쪽에 있는 것 중에서만 선택할 수 있다.
 *             삼각형의 크기는 1 이상 500 이하이다. 삼각형을 이루고 있는 각 수는 모두 정수이며, 범위는 0 이상 9999 이하이다.
 */

public class 정수_삼각형 {
	
	public static int[] num = new int[125250];
	public static int[] dp;

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp = new int[n*n-1+1];
		int j = 0;
		
		StringTokenizer st;
		
		for(int i=0; i<dp.length; i++)
			dp[i] = -1;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) {
				num[j] = Integer.parseInt(st.nextToken());
				j++;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
			}
		}
		
		dp[0] = num[0];
		
		System.out.println(sum(n));
	}

	public static int sum(int n) {
		int max = n*n-1;
		if(dp[max] == -1) {
			dp[n] = num[max-(n-1)] + sum(n);
		}
		
		return dp[n];
	}
	
}
