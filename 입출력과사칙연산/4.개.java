package ����°���Ģ����;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class �� {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			bw.write("|\\_/|\r\n"
					+ "|q p|   /}\r\n"
					+ "( 0 )\"\"\"\\\r\n"
					+ "|\"^\"`    |\r\n"
					+ "||_/=\\\\__|");
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
