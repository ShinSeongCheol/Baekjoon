package 입출력과사칙연산;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 사칙연산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A,B;
		try {
			String[] str = br.readLine().split(" ");
			A = Integer.parseInt(str[0]);
			B = Integer.parseInt(str[1]);
			bw.write(String.valueOf(A+B) + "\n");
			bw.write(String.valueOf(A-B) + "\n");
			bw.write(String.valueOf(A*B) + "\n");
			bw.write(String.valueOf(A/B) + "\n");
			bw.write(String.valueOf(A%B) + "\n");
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
