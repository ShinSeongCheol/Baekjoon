package 입출력과사칙연산;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class AminorB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int A,B,result;
		try {
			String str;
			str = br.readLine();
			StringTokenizer st = new StringTokenizer(str," ");
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			result = A - B;
			bw.write(String.valueOf(result));
			bw.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
