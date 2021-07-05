package 기본_수학1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 달팽이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = new String[3];
		int A,B,V;
		int X;
		
		try {
			
			str = br.readLine().split(" ");
			A = Integer.parseInt(str[0]);
			B = Integer.parseInt(str[1]);
			V = Integer.parseInt(str[2]);
			
			X = calX(A,B,V);

			bw.write(String.valueOf(X));
			bw.flush();
			bw.close();
			br.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	
	static int calX(int A, int B, int V) {
		int X;
		
		if((V-A)%(A-B) == 0)
			X = (V-A)/(A-B) + 1;
		else
			X = (V-A)/(A-B) + 2;
		return X;
	}
}
