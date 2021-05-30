package for¹®;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ApBm8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int x,A,B,C;
		String str[];
		
		try {
			x = Integer.parseInt(br.readLine());
			
			for(int i=1; i<=x; i++) {
				str = br.readLine().split(" ");
				A = Integer.parseInt(str[0]);
				B = Integer.parseInt(str[1]);
				C = A + B;
				
				bw.write("Case #" + i + ": " + A + " + " + B + " = " + C + "\n");
			}
			bw.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}try {
			br.close();
			bw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
