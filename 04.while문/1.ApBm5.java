package while¹®;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ApBm5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str;
		int A,B;
		
		while(true) {
			try {
				
				str = br.readLine().split(" ");
				A = Integer.parseInt(str[0]);
				B = Integer.parseInt(str[1]);
				
				if((A==0) && (B==0)) {
					break;
				}else {
					bw.write(A+B + "\n");
				}
				
				bw.flush();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			
		}
		
	}

}
