package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 수_정렬하기_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N;

		try {
			
			N = Integer.parseInt(br.readLine());
			
			int[] arr = new int[N];
			
			for(int i=0; i<N; i++) {
				
				arr[i] = Integer.parseInt(br.readLine());
				
			}
			
			Arrays.sort(arr);
			
			for(int i : arr) {
				sb.append(i).append("\n");
			}
			
			System.out.println(sb);
			
			br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
