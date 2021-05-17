package 입출력과사칙연산;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 곱셈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a,b;
		try {
			a = Integer.parseInt(br.readLine());
			b = Integer.parseInt(br.readLine());
			bw.write(a*(b%10) + "\n");
			bw.write(a*((b%100-(b%10))/10) + "\n");
			bw.write(a*((b-(b%100))/100) + "\n");
			bw.write(a*b + "\n");
			bw.flush();
		}catch(IOException e) {
			
		}
	}

}
