package for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class X보다_작은_수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N,X;
		String str[];
		
		try {
			
			str = br.readLine().split(" ");
			N = Integer.parseInt(str[0]);
			X = Integer.parseInt(str[1]);
			
			int A[] = new int[N];
			
			str = br.readLine().split(" ");
			
			for(int i=0; i<N; i++) {
				
				A[i] = Integer.parseInt(str[i]);
				if(X > A[i]) {
					bw.write(A[i] + " ");
				}
				
			}
			
			bw.flush();
			
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
