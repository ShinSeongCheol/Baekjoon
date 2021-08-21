package 정렬;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;

public class 좌표_압축 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[] str = new String[N];
		int count = 0;
		
		str = br.readLine().split(" ");
		
		Arrays.sort(str);
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0; i<N; i++) {
			
			if(!map.containsKey(Integer.parseInt(str[i]))) {
				map.put(Integer.parseInt(str[i]), count);
				count++;
			}
			
		}
		
		for(int i=0; i<N; i++)
			bw.write(map.get(map) + " ");
		
		bw.flush();
		bw.close();
		br.close();
			
	}

}
