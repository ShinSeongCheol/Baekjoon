package 기본_수학1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 벌집 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N,acrossedRoom=1,numOfRoom=1;
		
		try {
			
			N = Integer.parseInt(br.readLine());
			
			while(numOfRoom<N) {
				numOfRoom +=  6 * acrossedRoom++;
			}
			
			bw.write(String.valueOf(acrossedRoom));
			bw.flush();
			bw.close();
			br.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		}

}
