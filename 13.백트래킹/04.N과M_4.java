package 백트래킹;

import java.util.Scanner;

public class N과M_4 {
	
	static int[] arr;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		arr = new int [M];
		
		dfs(N, M, 0, 0);
		
		System.out.println(sb);
		
		sc.close();
	}

	public static void dfs(int N, int M, int depth, int count) {
		if(depth == M) {
			for(int i : arr)
				sb.append(i).append(' ');
			sb.append('\n');
			return;
		}
		
		for(int i=count; i<N; i++) {
			arr[depth] = i + 1;
			dfs(N, M, depth + 1, i);
		}
	}
}
