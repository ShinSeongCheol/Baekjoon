package 기본_수학1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 손익분기점 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = new String[3];
		int A,B,C,BREAK_EVEN_POINT;
		
		try {
			
			str = br.readLine().split(" ");
			A = Integer.parseInt(str[0]);
			B = Integer.parseInt(str[1]);
			C = Integer.parseInt(str[2]);

			if(C-B > 0) {
				BREAK_EVEN_POINT = A/(C-B)+1;
			}else {
				BREAK_EVEN_POINT = -1;
			}
			
			bw.write(String.valueOf(BREAK_EVEN_POINT));
			bw.flush();
			bw.close();
			br.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
