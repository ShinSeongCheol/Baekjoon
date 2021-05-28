package if문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 시험_성적 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int degree = Integer.parseInt(br.readLine());
			if((90<=degree) && (100>=degree))
				bw.write("A");
			else if((80<=degree) && (89>=degree))
				bw.write("B");
			else if((70<=degree) && (79>=degree))
				bw.write("C");
			else if((60<=degree) && (69>=degree))
				bw.write("D");
			else
				bw.write("F");
			bw.flush();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
