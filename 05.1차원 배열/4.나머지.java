package 배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 나머지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int A, B = 42;
		int count = 0;
		boolean num[] = new boolean[42];

		try {

			for (int i = 0; i < 42; i++)
				num[i] = false;

			for (int i = 0; i < 10; i++) {
				A = Integer.parseInt(br.readLine());
				num[A % B] = true;
			}
			
			for(int i=0; i<42; i++) {
				if(num[i] != false)
					count++;
			}
			
			bw.write(String.valueOf(count));
			bw.flush();

		} catch (IOException e) {
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
