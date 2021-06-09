package 배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 숫자의_개수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A,B,C,resultInt;
		String result;
		
		try {
			
			A = Integer.parseInt(br.readLine());
			B = Integer.parseInt(br.readLine());
			C = Integer.parseInt(br.readLine());
			resultInt = A*B*C;
			result = Integer.toString(resultInt);
			
			int[] arrayOfResult = new int[10];
			int sizeOfResult = result.length();
			
			for(int i=0; i<sizeOfResult; i++) {
				arrayOfResult[resultInt%10]++;
				resultInt = resultInt/10;
			}
			
		for(int i=0; i<10; i++)
			bw.write(arrayOfResult[i] + "\n");
			
		bw.flush();
		
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				br.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
