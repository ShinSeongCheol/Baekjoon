package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N과M_2 {

	static int[] arr;
	static int M, N;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");

		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);

		arr = new int[M];

		dfs(1, 0);

	}

	public static void dfs(int at, int depth) {
		if (M == depth) {
			for (int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}

		for (int i = at; i <= N; i++) {

			arr[depth] = i;
			dfs(i + 1, depth + 1);

		}
	}
}
