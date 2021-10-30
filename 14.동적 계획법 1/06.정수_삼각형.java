package 동적_계획법_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 *             7
 *             3   8
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
	
	public static int[][] arr;
	public static int[][] dp;
	public static int n;

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		
		//2차원 배열 생성
		arr = new int[n][n];
		dp = new int[n][n];
		
		//dp배열 -1로 초기화
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				dp[i][j] = -1;
			}
		}
		
		//arr배열 초기화
		for(int i=0; i<n; i++) {
			int j=0;
			st = new StringTokenizer(br.readLine(), " ");
			
			while(st.hasMoreTokens()) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				j++;
			}
			
		}
		
		//dp의 마지막줄을 arr의 마지막 줄로 초기화
		for(int i=0; i<n; i++)
			dp[n-1][i] = arr[n-1][i];
		
		System.out.println(sum(0,0));
	}
	
	//dfs알고리즘
	public static int sum(int depth, int idx) {
		if(depth == n-1) {
			return dp[depth][idx];
		}
		
		if(dp[depth][idx] == -1) {
			dp[depth][idx] = Math.max(sum(depth+1, idx), sum(depth+1, idx+1)) + arr[depth][idx];
		}
		
		return dp[depth][idx];
	}
}
