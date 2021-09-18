package 동적_계획법_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZeroOne_타일 {

	public static int[] memo = new int[1000001];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < 1000001; i++) {
			memo[i] = -1;
		}

		memo[0] = 0;
		memo[1] = 1;
		memo[2] = 2;

		System.out.println(tileNumber(N));
	}

	public static int tileNumber(int N) {
		if (memo[N] == -1) {
			return memo[N] = (tileNumber(N - 2) + tileNumber(N - 1)) % 15746;
		}

		return memo[N];
	}

}
