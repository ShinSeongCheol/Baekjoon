package for��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class �����_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N;
		
		try {
			N = Integer.parseInt(br.readLine());
			
			for(int i=1; i<=N; i++) {
				for(int j=0; j<i; j++)
					bw.write("*");
				bw.write("\n");
			}
			bw.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}try {
			bw.close();
			br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
