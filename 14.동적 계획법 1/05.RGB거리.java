package ����_��ȹ��_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 *--- ����---
 * RGB�Ÿ����� ���� N�� �ִ�. �Ÿ��� �������� ��Ÿ�� �� �ְ�, 1�� ������ N�� ���� ������� �ִ�.
 *���� ����, �ʷ�, �Ķ� �� �ϳ��� ������ ĥ�ؾ� �Ѵ�. ������ ���� ����, �ʷ�, �Ķ����� ĥ�ϴ� ����� �־����� ��,
 *�Ʒ� ��Ģ�� �����ϸ鼭 ��� ���� ĥ�ϴ� ����� �ּڰ��� ���غ���.
 *
 *1�� ���� ���� 2�� ���� ���� ���� �ʾƾ� �Ѵ�.
 *N�� ���� ���� N-1�� ���� ���� ���� �ʾƾ� �Ѵ�.
 *i(2 �� i �� N-1)�� ���� ���� i-1��, i+1�� ���� ���� ���� �ʾƾ� �Ѵ�.
 *
 *---�Է�---
 *ù° �ٿ� ���� �� N(2 �� N �� 1,000)�� �־�����.
 *��° �ٺ��� N���� �ٿ��� �� ���� ����, �ʷ�, �Ķ����� ĥ�ϴ� ����� 1�� ������ �� �ٿ� �ϳ��� �־�����.
 * ���� ĥ�ϴ� ����� 1,000���� �۰ų� ���� �ڿ����̴�.
*/

public class RGB�Ÿ� {
	
	static int[][] rgb;
	static int[][] dp;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		rgb = new int[N][3];
		dp = new int[N][3];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int j=0; j<3; j++)
				rgb[i][j] = Integer.parseInt(st.nextToken());
			
		}
		
		dp[0][0] = rgb[0][0];
		dp[0][1] = rgb[0][1];
		dp[0][2] = rgb[0][2];
		
		System.out.println(Math.min(Paint(N-1, 0), Math.min(Paint(N-1, 1), Paint(N-1, 2))));
	}
	
	public static int Paint(int N, int color) {
		if(dp[N][color] == 0) {
			if(color == 0) {
				dp[N][color] = Math.min(Paint(N-1, 1), Paint(N-1, 2)) + rgb[N][0];
			}
			else if(color == 1) {
				dp[N][color] = Math.min(Paint(N-1, 0), Paint(N-1, 2)) + rgb[N][1];
			}
			else {
				dp[N][color] = Math.min(Paint(N-1, 1), Paint(N-1, 0)) + rgb[N][2];
			}
		}
			
		return dp[N][color];	
	}
	
}