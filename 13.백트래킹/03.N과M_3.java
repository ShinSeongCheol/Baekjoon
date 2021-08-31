package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N과M_3 {

	static int[] arr;
	static int N, M;
	static BufferedReader br;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");

		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);

		arr = new int[M];

		dfs(0);

		System.out.println(sb);
		
		br.close();
	}

	public static void dfs(int depth) throws IOException {

		if (depth == M) {
			for (int i : arr)
				sb.append(i).append(' ');
			sb.append('\n');
			return;
		}

		for (int i = 0; i < N; i++) {
			arr[depth] = i + 1;
			dfs(depth + 1);
		}

	}
}
