package 문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 크로아티아_알파벳 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str;
		int count;

		try {
			str = br.readLine();
			count = str.length();

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'c' && i < str.length() - 1) {
					if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
						count--;
					}
				} else if ((str.charAt(i) == 'l' || str.charAt(i) == 'n') && i < str.length() - 1) {
					if (str.charAt(i + 1) == 'j') {
						count--;
					}
				} else if ((str.charAt(i) == 's' || str.charAt(i) == 'z') && i < str.length() - 1) {
					if (str.charAt(i + 1) == '=') {
						count--;
					}
				} else if (str.charAt(i) == 'd' && i < str.length() - 1) {
					if (str.charAt(i + 1) == '-') {
						count--;
					} else if (str.charAt(i + 1) == 'z' && i < str.length() - 2) {
						if (str.charAt(i + 2) == '=') {
							count--;
						}
					}
				}
			}

			bw.write(String.valueOf(count));
			bw.flush();
			bw.close();
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
