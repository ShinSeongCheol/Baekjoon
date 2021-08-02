package 브루트_포스;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 체스판_다시_칠하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N, M;
		char[][] board;
		int min = 64;

		try {

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());

			board = new char[N][M];

			for (int i = 0; i < N; i++) {

				String str;
				st = new StringTokenizer(br.readLine());
				str = st.nextToken();

				for (int j = 0; j < M; j++) {
					board[i][j] = str.charAt(j);
				}
			}

			for(int i=0; i<=N-8; i++) {
				for(int j=0; j<=M-8; j++) {
					
					int count = 0;
					char c = board[i][j];
					
					for(int k=i; k<8+i; k++) {
						for(int l=j; l<8+j; l++) {
							
							
							if(board[k][l] != c) {
								count++;
							}
							
							if(c == 'W') {
								c = 'B';
							}else {
								c = 'W';
							}
							
						}
						
						if(c == 'W') {
							c = 'B';
						}else {
							c = 'W';
						}
						
					}
					count = Math.min(count,  64 - count);
					min = Math.min(min,  count);
				}
			}
			
			bw.write(String.valueOf(min));
			bw.flush();
			bw.close();
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
