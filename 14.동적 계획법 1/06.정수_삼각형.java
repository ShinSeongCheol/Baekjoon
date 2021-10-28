package ����_��ȹ��_1;

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
 *             �� �׸��� ũ�Ⱑ 5�� ���� �ﰢ���� �� ����̴�.
 *             
 *             �� ���� 7���� �����ؼ� �Ʒ��� �ִ� �� �� �ϳ��� �����Ͽ� �Ʒ������� ������ ��, �������� ���õ� ���� ���� �ִ밡 �Ǵ� ��θ� ���ϴ� ���α׷��� �ۼ��϶�.
 *             �Ʒ����� �ִ� ���� ���� ������ ���õ� ���� �밢�� ���� �Ǵ� �밢�� �����ʿ� �ִ� �� �߿����� ������ �� �ִ�.
 *             �ﰢ���� ũ��� 1 �̻� 500 �����̴�. �ﰢ���� �̷�� �ִ� �� ���� ��� �����̸�, ������ 0 �̻� 9999 �����̴�.
 */

public class ����_�ﰢ�� {
	
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
