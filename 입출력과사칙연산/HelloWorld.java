package 입출력과사칙연산;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class HelloWorld {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
		bw.write("Hello World!");
		bw.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
