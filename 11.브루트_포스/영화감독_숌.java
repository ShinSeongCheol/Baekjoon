package ���Ʈ_����;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ��ȭ����_�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N;
		int num = 666;
		int count = 1; 
		
		try {
			
			N = Integer.parseInt(br.readLine());

			while(count != N) {
				
				num++;
				
				if(String.valueOf(num).contains("666"))
					count ++;
				
			}
			
			bw.write(String.valueOf(num));
			bw.flush();
			bw.close();
			br.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
