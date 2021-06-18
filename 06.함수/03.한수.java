package 함수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 한수 {

	static int num,count=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setNum();
		countHansu();
		printCount();
	}
	
	static void setNum() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			num = Integer.parseInt(br.readLine());
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	static void countHansu() {
		if(num<100) {
			for(int i=1; i<=num; i++) {
				count++;
			}
		}else if(num<=1000){
			count=99;
			for(int i=100; i<=num; i++) {
				int firstD=(i%100/10)-(i/100), secondD=(i%10-i%100/10);
				if(firstD == secondD) {
					count++;
				}
			}
		}
	}
	
	static void printCount() {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			bw.write(count + "\n");
			bw.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
