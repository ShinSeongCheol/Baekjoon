package algorythm;

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

public class test {
	
	static int[][] rgb;
	static int[][] dp;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		rgb = new int[N][3];
		dp = new int[N][3];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			for(int j=0; j<3; j++)
				rgb[i][j] = Integer.parseInt(st.nextToken());
			
		}
		
		dp[0][0] = rgb[0][0];
		dp[0][1] = rgb[0][1];
		dp[0][2] = rgb[0][2];
		
	}
	
}
