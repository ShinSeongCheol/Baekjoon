package if문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 두_수_비교하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int A,B;
			String[] str = br.readLine().split(" ");
			
			A = Integer.parseInt(str[0]);
			B = Integer.parseInt(str[1]);
			
			if(A>B) {
				bw.write(">");
				bw.flush();
			}
			
			if(A<B) {
				bw.write("<");
				bw.flush();
			}
			
			if(A==B) {
				bw.write("==");
				bw.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
