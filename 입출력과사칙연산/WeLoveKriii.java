package ����°���Ģ����;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class WeLoveKriii {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			for(int i=0;i<2;i++) {
			bw.write("����ģ�� ��������\n");
			bw.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
