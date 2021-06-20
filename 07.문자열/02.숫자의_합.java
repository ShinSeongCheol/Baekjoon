package 문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 숫자의_합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();
		
	}
	
	static void sum() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N,sum=0;
		String str;
		try {
			N = Integer.parseInt(br.readLine());
			str = br.readLine();
			
			for(int i=0; i<N; i++) {
				sum += str.charAt(i) - 48;
			}
			
			bw.write(String.valueOf(sum));
			bw.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				bw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
