package ����_��ȹ��_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �Ǻ���ġ_�Լ� {
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
