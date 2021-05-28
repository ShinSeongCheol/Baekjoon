package 입출력과사칙연산;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class 고양이 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			bw.write("\\    /\\\n");
			bw.write(" )  ( ')\n");
			bw.write("(  /  )\n");
			bw.write(" \\(__)|\n");
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
