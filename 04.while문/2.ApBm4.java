package while¹®;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ApBm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A,B;
		String temp_str;
		String[] str;
		try {
		while((temp_str = br.readLine()) != null) {
			try {
				str = temp_str.split(" ");
				A = Integer.parseInt(str[0]);
				B = Integer.parseInt(str[1]);
				
				bw.write(A+B + "\n");
				bw.flush();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
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
