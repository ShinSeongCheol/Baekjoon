package for¹®;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class NÂï±â {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N;
		
		try {
			N = Integer.parseInt(br.readLine());
			
			for(int i=1; i<=N; i++) 
				bw.write(i + "\n");
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
