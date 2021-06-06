package while문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 더하기_사이클 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N, tempN = 0, anwser = 100, count = 0;

		try {

			N = Integer.parseInt(br.readLine());
			if (N >= 0 && N < 100) {
				tempN = N;
				while (N != anwser) {

					tempN = (tempN % 10 * 10) + (tempN / 10 + tempN % 10) % 10;
					anwser = tempN;
					count++;
				}
			}

			bw.write(String.valueOf(count));
			bw.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				br.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
