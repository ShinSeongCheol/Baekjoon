package 브루트포스;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 분해합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N, answer = 0;
		String str;

		try {

			str = br.readLine();
			N = Integer.parseInt(str);

			for(int i = 0; i < N; i++) {
				
				int number = i;
				int sum = 0;	
				
				while(number != 0) {
					
					sum += number % 10;
					number /= 10;
					
				}
				
				if(sum + i == N) {
					
					answer = i;
					break;
					
				}
				
			}
			
			bw.write(String.valueOf(answer));
			bw.flush();
			bw.close();
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
