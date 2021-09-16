package 동적_계획법_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 신나는_함수_실행 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a,b,c;
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		w(a,b,c);
	}

	public static int w(int a, int b, int c) {
		if(a <=0 && b <=0 && c <= 0) {
			return 1;
		}else if(a > 20 && b > 20 && c > 20) {
			return w(20,20,20);
		}else if(a < b && b < c) {
			return w(a,b,c-1) + w(a,b-1,c-1) - w(a,b-1,c);
		}else {
			return w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
		}
	}
}
