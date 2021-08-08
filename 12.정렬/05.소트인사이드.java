package 정렬;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 소트인사이드 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		int N = Integer.parseInt(str);
		int[] arr = new int[str.length()];
		int count = 0;

		while (N != 0) {
			arr[count++] = N%10;
			N /= 10;
		}
		
		Arrays.sort(arr);

		for(int i=arr.length-1; i>=0; i--)
			bw.write(String.valueOf(arr[i]));
		
		bw.flush();
		bw.close();
		br.close();
	}

}
