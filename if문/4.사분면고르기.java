package if문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 사분면고르기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int x,y;
		
		try {
			x = Integer.parseInt(br.readLine());
			y = Integer.parseInt(br.readLine());
			
			if((x > 0) && (y > 0)) {
				bw.write("1");
			}
			else if((x < 0) && (y > 0)) {
				bw.write("2");
			}
			else if((x < 0) && (y < 0)) {
				bw.write("3");
			}
			else {
				bw.write("4");
			}
			bw.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
