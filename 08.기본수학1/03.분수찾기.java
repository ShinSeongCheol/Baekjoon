package 기본수학1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 분수찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int X;
		String answer;
		
		try {
			X = Integer.parseInt(br.readLine());
			
			answer = Find(X);

			bw.write(answer);
			bw.flush();
			bw.close();
			br.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	static String Find(int X) {
		
		int count=1,column=1,oldCount=0;
		int loc,mom,son;
		String answer = "";
		
		while(X > count) {
			column++;
			oldCount = count;
			count = column + count;
		}
		
		loc = X - oldCount;
		
		if(column%2 == 0) {
			mom = column + 1 - loc;
			son = loc;
		}else {
			mom = loc;
			son = column + 1 - loc;
		}
		
		answer = son +"/" + mom; 
		return answer;
	}

}
