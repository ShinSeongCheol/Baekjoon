package 동적_계획법_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치_함수 {
	public static int[] memo;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			memo = new int[1000];

			fibonacci(Integer.parseInt(br.readLine()));

		}

	}

	public static int fibonacci(int n) {
		if (n == 0) {
			memo[n] = 0;
		}
		
		if (n == 1) {
			memo[n] = 1;
		}
		
		if (memo[n] != 0) {
			
		}
		return 0;
	}
}
