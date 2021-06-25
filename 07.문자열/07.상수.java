package 문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 상수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		answerOfSansu();
	}

	static void answerOfSansu() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String number,tempNumber="";
		String rNumber[] = new String[2];
		
		try {
			number = br.readLine();
			
			for(int i=number.length()-1; i>=0; i--) {
				tempNumber += number.charAt(i);
			}
			
			rNumber = tempNumber.split(" ");
			
			if(Integer.parseInt(rNumber[0]) > Integer.parseInt(rNumber[1])) 
				bw.write(rNumber[0]);
			else
				bw.write(rNumber[1]);
			
			bw.flush();
			bw.close();
			br.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
