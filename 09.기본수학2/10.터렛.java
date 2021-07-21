package 기본_수학2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 터렛 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T;
		int answer;
		String[] str = new String[6];

		try {

			T = Integer.parseInt(br.readLine());

			for (int i = 0; i < T; i++) {
				str = br.readLine().split(" ");
				answer = countPoint(str);
				bw.write(answer + "\n");
			}

			bw.flush();
			bw.close();
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static int  countPoint(String[] str) {
		int x[] = new int[2], y[] = new int[2], r[] = new int[2];
		int d;

		x[0] = Integer.parseInt(str[0]);
		y[0] = Integer.parseInt(str[1]);
		r[0] = Integer.parseInt(str[2]);
		x[1] = Integer.parseInt(str[3]);
		y[1] = Integer.parseInt(str[4]);
		r[1] = Integer.parseInt(str[5]);

		d = (int)(Math.pow(x[1] - x[0], 2) + Math.pow(y[1] - y[0], 2));
	
		if(d == 0 && r[0] == r[1]) {
			return -1;
		}
		else if(d > Math.pow(r[0] + r[1], 2)) {
			return 0;
		}
		else if(d < Math.pow(r[1] - r[0], 2)) {
			return 0;
		}
		else if(d == Math.pow(r[1] - r[0], 2)) {
			return 1;
		}
		else if(d == Math.pow(r[1] + r[0], 2)) {
			return 1;
		}else {
			return 2;
		}
		
	}
}
