package 문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 그룹_단어_체커 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N, count = 0;
		String word;

		try {
			N = Integer.parseInt(br.readLine());
			count = N;

			for (int i = 0; i < N; i++) {

				int a[] = new int[26];
				word = br.readLine();

				for (int j = 0; j < word.length(); j++) {
					if(a[word.charAt(j)-'a'] == 0) {
						a[word.charAt(j)-'a'] = j+1;
					}else {
						if(a[word.charAt(j)-'a']-j == 0) {
							a[word.charAt(j)-'a'] = j+1;
						}else {
							count--;
							break;
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