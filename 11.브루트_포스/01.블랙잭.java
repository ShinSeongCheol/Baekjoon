package ���Ʈ_����;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str;
		int N, M, answer;
		int[] num;
		
		try {
			
			str = br.readLine().split(" ");
			N = Integer.parseInt(str[0]);
			M = Integer.parseInt(str[1]);
			
			str = br.readLine().split(" ");
			num = new int[N];
			
			for(int i=0; i<N; i++) {
				num[i] = Integer.parseInt(str[i]);
			}
			
			answer = blackJack(N, M, num);
			
			bw.write(String.valueOf(answer));
			bw.flush();
			bw.close();
			br.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	static int blackJack(int N, int M, int[] num) {
		
		int answer=0,count=0;
		int [] percNum = new int[(N * (N -1) * (N-2) / (3 * 2 * 1))];

		for(int i=0; i<N-2; i++)
			for(int j=i+1; j<N-1; j++)
				for(int k=j+1; k<N; k++) {
					
					percNum[count++] = num[i] + num[j] + num[k];
					
				}
		
		Arrays.sort(percNum);
		
		for(int i : percNum)
			if(i <= M)
				answer = i;
		
		return answer;
	}
}
