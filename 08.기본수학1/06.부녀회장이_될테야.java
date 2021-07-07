package 기본_수학1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 부녀회장이_될테야 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T,k,n;
		int answer;
		
		try {
			T = Integer.parseInt(br.readLine());
			
			for(int i=0; i<T; i++) {
				
				k = Integer.parseInt(br.readLine());
				n = Integer.parseInt(br.readLine());
				
				answer = liveIn(k,n);
				
				bw.write(answer + "\n");
			}
			
			bw.flush();
			bw.close();
			br.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	static int liveIn(int k, int n) {
		int answer=0;
		
		if(k==0) {
			return n;
		}else if(n==1) {
			return 1;
		}
		else {
			answer = liveIn(k,n-1) + liveIn(k-1,n);
		}
		
		return answer;
	}
	
}
