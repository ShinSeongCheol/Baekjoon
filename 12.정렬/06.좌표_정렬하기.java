package 정렬;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 좌표_정렬하기 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[][] loc = new int[N][2];
		int[] temp = new int[2];
		
		for(int i=0; i<N; i++) {
			
			String str[] = new String[2];
			str = br.readLine().split(" ");
			
			loc[i][0] = Integer.parseInt(str[0]);
			loc[i][1] = Integer.parseInt(str[1]);
			
		}
		
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				if(loc[i][0] > loc[j][0]) {
					
					temp[0] = loc[i][0];
					temp[1] = loc[i][1];
					
					loc[i][0] = loc[j][0];
					loc[i][1] = loc[j][1];
					
					loc[j][0] = temp[0];
					loc[j][1] = temp[1];
					
				}else if(loc[i][0] == loc[j][0]) {
					
					if(loc[i][1] > loc[j][1]) {
						
						temp[0] = loc[i][0];
						temp[1] = loc[i][1];
						
						loc[i][0] = loc[j][0];
						loc[i][1] = loc[j][1];
						
						loc[j][0] = temp[0];
						loc[j][1] = temp[1];
						
					}
					
				}
			}
		}
		
		for(int i=0; i<N; i++)
		bw.write(String.valueOf(loc[i][0]) + " " + String.valueOf(loc[i][1]) + "\n");
		bw.flush();
		
		bw.close();
		br.close();
	}

}
