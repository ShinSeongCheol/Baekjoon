package 기본_수학2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 직각삼각형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str;
		int x=-1, y=-1, z=-1;

		try {

			while (true) {
				
				str = br.readLine();
				StringTokenizer st = new StringTokenizer(str);
				x = Integer.parseInt(st.nextToken());
				y = Integer.parseInt(st.nextToken());
				z = Integer.parseInt(st.nextToken());
				
				if(x == 0 && y == 0 && z == 0) {
					break;
				}
				
				if((int)Math.pow(z, 2) == (int)(Math.pow(y, 2) + (int)Math.pow(x, 2)) ) {
					bw.write("right\n");
				}else if((int)Math.pow(x, 2) == (int)(Math.pow(y, 2) + (int)Math.pow(z, 2)) ) {
					bw.write("right\n");
				}else if((int)Math.pow(y, 2) == (int)(Math.pow(x, 2) + (int)Math.pow(z, 2)) ) {
					bw.write("right\n");
				}
				else {
					bw.write("wrong\n");
				}
				
				bw.flush();
				
			}
			
			bw.close();
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
