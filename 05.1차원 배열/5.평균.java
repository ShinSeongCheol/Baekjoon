package ¹è¿­;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Æò±Õ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N,M;
		float newScoreSum = 0,newScoreAvg;
		
		try {
			N = Integer.parseInt(br.readLine());
			int[] score = new int[N];
			String[] scoreStr = new String[N];
			scoreStr = br.readLine().split(" ");
			
			for(int i=0; i<N; i++) {
				score[i] = Integer.parseInt(scoreStr[i]);
			}
			
			M = score[0];
			
			for(int i=0; i<N; i++) {
				if(M < score[i])
					M = score[i];
			}
			
			for(int i=0; i<N; i++) {
				newScoreSum += score[i]/M*100;
			}
			
			newScoreAvg = newScoreSum/N;
			
			bw.write(Float.toString(newScoreAvg));
			bw.flush();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
