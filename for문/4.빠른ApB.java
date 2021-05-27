package for¹®;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ºü¸¥ApB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T;
		String[] str;
		
		try {
			T = Integer.parseInt(br.readLine());
			
			for(int i=0; i<T; i++) {
				str = br.readLine().split(" ");
				bw.write(Integer.parseInt(str[0]) + Integer.parseInt(str[1]) + "\n");
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
