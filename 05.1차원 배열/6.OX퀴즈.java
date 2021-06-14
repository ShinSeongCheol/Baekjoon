package _1차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OX퀴즈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T;
		
		try {
			
			T = Integer.parseInt(br.readLine());
			String[] answer = new String[T];

			for(int i=0; i<T; i++)
				answer[i] = br.readLine();
			
			for(int i=0; i<T; i++) {
				int count=0;
				int score=0;
				
				for(int j=0; j<answer[i].length(); j++) {
					char result;
					result = answer[i].charAt(j);
					
					if(result == 'O') {
						count = count + 1;
						score += count;
					}else
						count = 0;
				}
				
				bw.write(score + "\n");
				bw.flush();
			}
			
		}catch(IOException e) {
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
