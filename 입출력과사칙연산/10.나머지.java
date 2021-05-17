package 입출력과사칙연산;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 나머지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			String[] str = br.readLine().split(" ");
			int A,B,C;
			A = Integer.parseInt(str[0]);
			B = Integer.parseInt(str[1]);
			C = Integer.parseInt(str[2]);
			bw.write((A + B) % C + "\n");
			bw.write(((A % C) + (B % C)) % C + "\n");
			bw.write((A * B) % C + "\n");
			bw.write(((A % C) * (B % C) % C) + "\n");
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
