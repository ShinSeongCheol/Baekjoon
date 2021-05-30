package for¹®;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ApBm7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T,A,B;
		String[] str;
		
		try {
			T = Integer.parseInt(br.readLine());
			
			for(int i=1; i<=T; i++) {
				str = br.readLine().split(" ");
				A = Integer.parseInt(str[0]);
				B = Integer.parseInt(str[1]);
				
				bw.write("Case #" + i + ": " + (A+B) + "\n");
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
