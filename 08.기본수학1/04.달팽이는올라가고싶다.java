package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class snail {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A,B,V,rs;
		
		try {
			StringTokenizer token = new StringTokenizer(br.readLine()," ");
			
			A = Integer.parseInt(token.nextToken());
			B = Integer.parseInt(token.nextToken());
			V = Integer.parseInt(token.nextToken());
			
			rs = ((V-A)/(A-B))+1;
			
			if((V-A)%(A-B) > 0) {
				rs++;
			}
			
			System.out.println(rs);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
