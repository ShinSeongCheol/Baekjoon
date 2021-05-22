package if문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 알람시계 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int hour,minute;
		String[] str;
		try {
			str = br.readLine().split(" ");
			
			hour = Integer.parseInt(str[0]);
			minute = Integer.parseInt(str[1]);

			int setTime = hour*60 + minute - 45;
			
			if(setTime < 0) {
				setTime += 1440;
			}
			
			bw.write(setTime/60 + " " + setTime%60);
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
