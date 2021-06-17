package 함수;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class 셀프_넘버 {
	
	static boolean selfNum[] = new boolean[20000];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initSelfNum();
		setSelfNum();
		printSelfNum();
	}
	
	static int d(int n) {
		int result=0;
		int num = n;
		while(n>0) {
			result += n%10;
			n = n/10;
		}
		result += num;
		return result;
	}
	
	static void initSelfNum() {
		for(int i=0; i<10000; i++) {
			selfNum[i] = true;
		}
	}
	
	static void setSelfNum() {
		int i=0;
		while(i<10000) {
			selfNum[d(i)] = false;
			i++;
		}
	}
	
	static void printSelfNum() {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			for(int i=0; i<10000; i++) {
				if(selfNum[i]==true)
					bw.write(i + "\n");
			}
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
