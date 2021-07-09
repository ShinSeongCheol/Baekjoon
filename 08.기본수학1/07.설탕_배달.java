package 기본_수학1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 설탕_배달 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N,answer;
		
		try {
			N = Integer.parseInt(br.readLine());
			
			answer = minNum(N);
			
			bw.write(String.valueOf(answer));
			bw.flush();
			bw.close();
			br.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	static int minNum(int N) {
		int count=0;
		
		while(N>=0) {
			
			if(N%5 == 0) {
				return count + N/5;
			}
			
			N -= 3;
			count++;
			
		}
		
		return -1;
	}
}
