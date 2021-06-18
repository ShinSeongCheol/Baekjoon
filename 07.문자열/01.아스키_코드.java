package 문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 아스키_코드 {

	public static void main(String[] args) {
		String word;
		int ascii;
		word = setWord();
		ascii = wordToAscii(word);
		printWord(ascii);
	}

	static String setWord() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			return br.readLine();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	static int wordToAscii(String word) {
		int ascii = word.charAt(0);
		return ascii;
	}
	
	static void printWord(int ascii) {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			bw.write(String.valueOf(ascii));
			bw.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
