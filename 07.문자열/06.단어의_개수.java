package 문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 단어의_개수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str;
		int count=0;
		
		try {
			str = br.readLine();
			StringTokenizer st = new StringTokenizer(str, " ");
			
			while(st.hasMoreTokens()) {
				st.nextToken();
				count++;
			}
			
			bw.write(String.valueOf(count));
			bw.flush();
			bw.close();
			br.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
