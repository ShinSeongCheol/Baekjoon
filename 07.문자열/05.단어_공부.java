package 문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 단어_공부 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		usedAlphabet();
	}

	static void usedAlphabet() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String alphabet;
		int max=-1, Case=-1, alphaCount[] = new int[26];
		
		for(int i=0; i<alphaCount.length; i++)
			alphaCount[i] = 0;
		
		try {
			alphabet = br.readLine();
			
			for(int i=0; i<alphabet.length(); i++) {
				if(alphabet.charAt(i) >= 'a' && alphabet.charAt(i) <= 'z') {
					alphaCount[alphabet.charAt(i)-'a']++;
				}else if(alphabet.charAt(i) >= 'A' && alphabet.charAt(i) <= 'Z') {
					alphaCount[alphabet.charAt(i)-'A']++;
				}
			}
			
			for(int i=0; i<alphaCount.length; i++) {
				if(max < alphaCount[i]) {
					max = alphaCount[i];
					Case = i + 65;
				}else if(max == alphaCount[i]){
					Case = '?';
				}
			}
			
			bw.write(Case);
			
			bw.flush();
			bw.close();
			br.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
