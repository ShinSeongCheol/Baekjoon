package 문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 문자열_반복 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printLoop();
	}

	static void printLoop() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T,R;
		String newString;
		String[] S = new String[2];
		
		try {
			T = Integer.parseInt(br.readLine());
			for(int i=0; i<T; i++) {
				newString = "";
				S = br.readLine().split(" ");
				R = Integer.parseInt(S[0]);
				for(int j=0; j<S[1].length(); j++) {
					for(int k=0; k<R; k++) {
						newString += S[1].charAt(j);
					}
				}
				bw.write(newString + "\n");
				bw.flush();
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
