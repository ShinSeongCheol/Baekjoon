package 정렬;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;

public class 좌표_압축 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] temp;
		int count = 0;
		String[] str = br.readLine().split(" ");
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(N);

		for (int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(str[i]);

		temp = arr.clone();

		Arrays.sort(temp);

		for (int i = 0; i < temp.length; i++) {
			
			if(!map.containsKey(temp[i])) {
				map.put(temp[i], count++);
			}
			
		}
		
		for(int i=0; i<arr.length; i++)
			bw.write(map.get(arr[i]) + " ");

		bw.flush();
		bw.close();
		br.close();
	}

}
