package 문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 다이얼 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str;
		int time = 0;

		try {
			str = br.readLine();

			for (int i = 0; i < str.length(); i++) {
				time += dial(str.charAt(i));
			}
			
			bw.write(String.valueOf(time));
			bw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static int dial(char num) {
		int time=0;
		switch (num) {
		case 'A', 'B', 'C' -> time = 3;
		case 'D', 'E', 'F' -> time = 4;
		case 'G', 'H', 'I' -> time = 5;
		case 'J', 'K', 'L' -> time = 6;
		case 'M', 'N', 'O' -> time = 7;
		case 'P', 'Q', 'R', 'S' -> time = 8;
		case 'T', 'U', 'V' -> time = 9;
		case 'W', 'X', 'Y', 'Z' -> time = 10;
		}
		return time;
	}
}
