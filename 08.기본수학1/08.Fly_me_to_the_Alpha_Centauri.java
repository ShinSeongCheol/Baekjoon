package 기본수학1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Fly_me_to_the_Alpha_Centauri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str;
		int T, answer = 0;

		try {

			T = Integer.parseInt(br.readLine());

			for (int i = 0; i < T; i++) {
				
				str = br.readLine().split(" ");
				answer = minNum(str[0], str[1]);
				bw.write(answer + "\n");
				
			}

			bw.flush();
			bw.close();
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	static int minNum(String str_x, String str_y) {
		int x = Integer.parseUnsignedInt(str_x), y = Integer.parseUnsignedInt(str_y);
		int distance = y - x;
		int max,count=0;
		
		max = (int)Math.sqrt(distance);
		
		if(max == Math.sqrt(distance)) {
			
			count = max * 2 - 1;
			
		}else {
			
			if(distance <= max*max+max)
				count = max * 2;
			else
				count = max * 2 + 1;
			
		}
		
		return count;
		
	}

}
