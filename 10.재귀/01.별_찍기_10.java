package Àç±Í;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class º°_Âï±â_10 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N;
		char star[][];

		try {

			N = Integer.parseInt(br.readLine());
			star = new char[N][N];

			initStar(star);

			insertStar(star, 0, 0, N);

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					bw.write(String.valueOf(star[i][j]));
				}
				bw.write("\n");
			}

			bw.flush();
			bw.close();
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	static void initStar(char[][] star) {

		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[0].length; j++) {
				star[i][j] = ' ';
			}
		}

	}

	static void insertStar(char[][] star, int x, int y, int N) {

		if (N == 1) {
			star[x][y] = '*';
			return;
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (!(i == 1 && j == 1)) {
					insertStar(star, x + i * (N / 3), y + j * (N / 3), N / 3);
				}
			}
		}

	}

}