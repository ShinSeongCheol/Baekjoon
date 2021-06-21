package 문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 알파벳_찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findAlphabet();
	}

	static void findAlphabet() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String S;
		int alphabet[] = new int[26];
		
		for(int i=0; i<alphabet.length; i++) {
			alphabet[i] = -1;
		}
		
		try {
			S = br.readLine();
			for(int i=0; i<S.length(); i++) {
				if(alphabet[S.charAt(i)-'a'] == -1)
					alphabet[S.charAt(i)-'a'] = i;
			}
			
			for(int i=0; i<alphabet.length; i++) {
				bw.write(alphabet[i] + " ");
			}
			bw.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				bw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
