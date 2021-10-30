package ����_��ȹ��_1;

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
 *             �� �׸��� ũ�Ⱑ 5�� ���� �ﰢ���� �� ����̴�.
 *             
 *             �� ���� 7���� �����ؼ� �Ʒ��� �ִ� �� �� �ϳ��� �����Ͽ� �Ʒ������� ������ ��, �������� ���õ� ���� ���� �ִ밡 �Ǵ� ��θ� ���ϴ� ���α׷��� �ۼ��϶�.
 *             �Ʒ����� �ִ� ���� ���� ������ ���õ� ���� �밢�� ���� �Ǵ� �밢�� �����ʿ� �ִ� �� �߿����� ������ �� �ִ�.
 *             �ﰢ���� ũ��� 1 �̻� 500 �����̴�. �ﰢ���� �̷�� �ִ� �� ���� ��� �����̸�, ������ 0 �̻� 9999 �����̴�.
 */

public class ����_�ﰢ�� {
	
	public static int[][] arr;
	public static int[][] dp;
	public static int n;

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		
		//2���� �迭 ����
		arr = new int[n][n];
		dp = new int[n][n];
		
		//dp�迭 -1�� �ʱ�ȭ
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				dp[i][j] = -1;
			}
		}
		
		//arr�迭 �ʱ�ȭ
		for(int i=0; i<n; i++) {
			int j=0;
			st = new StringTokenizer(br.readLine(), " ");
			
			while(st.hasMoreTokens()) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				j++;
			}
			
		}
		
		//dp�� ���������� arr�� ������ �ٷ� �ʱ�ȭ
		for(int i=0; i<n; i++)
			dp[n-1][i] = arr[n-1][i];
		
		System.out.println(sum(0,0));
	}
	
	//dfs�˰���
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
