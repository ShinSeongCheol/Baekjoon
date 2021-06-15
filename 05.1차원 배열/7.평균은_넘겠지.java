package _1차원배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 평균은_넘겠지 {
	
	static float avg,percent=0;
	static String[] str;
	static int count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int C;
		String ratio;
		
		try {
			C = Integer.parseInt(br.readLine());
			
			for(int i=0; i<C; i++) {
				str = br.readLine().split(" ");
				calculateAvg();
				countNum();
				percent();
				ratio = String.format("%.3f", percent);
				bw.write(ratio + "%\n");
			}
			
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
	
	private static void calculateAvg() {
		
		avg = 0;
		for(int i=0; i<Integer.parseInt(str[0]); i++) {
			avg += Integer.parseInt(str[i+1]);
		}
		avg = avg / Integer.parseInt(str[0]);
		
	}
	
	private static void countNum() {
		
		count=0;
		for(int i=0; i<Integer.parseInt(str[0]); i++) {
			if(Integer.parseInt(str[i+1]) > avg) {
				count++;
			}
		}
	}
	
	private static void percent() {
		percent = count/Float.parseFloat(str[0])*100;
	}
	
}
