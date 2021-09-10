package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연산자_끼워넣기 {
	static int[] num;
	static int[] oper = new int[4];
	static int MAX = Integer.MIN_VALUE;
	static int MIN = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		num = new int[N];
		
		for(int i=0; i<N; i++)
			num[i] = Integer.parseInt(st1.nextToken());
		
		for(int i=0; i<4; i++)
			oper[i] = Integer.parseInt(st2.nextToken());
		
		dfs(N, num[0], 1);
		
		System.out.println(MAX);
		System.out.println(MIN);
		
	}

	public static void dfs(int N, int number, int idx) {
		
		if(idx == N) {
			//max min print
			MAX = Math.max(MAX, number);
			MIN = Math.min(MIN, number);
			return;
		}
		
		for(int i=0; i<4; i++) {
			if(oper[i] > 0) {
				oper[i]--;
				switch(i) {
				case 0 : dfs(N, number + num[idx], idx + 1); break;
				case 1 : dfs(N, number - num[idx], idx + 1); break;
				case 2 : dfs(N, number * num[idx], idx + 1); break;
				case 3 : dfs(N, number / num[idx], idx + 1); break;
				}
				
				oper[i]++;
			}
		}
	}
}
