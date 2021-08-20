package 정렬;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 단어_정렬 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[] str = new String[N];
		int count=0;
		
		for(int i=0; i<N; i++)
			str[i] = br.readLine();
			
		Arrays.sort(str);
		
		while(count <= 50) {
			
			for(int i=0; i<N; i++) {
				if(str[i].length() == count) {
					if(i < N-1 && str[i].equals(str[i+1])) {
						continue;
					}else {
						bw.write(str[i] + "\n");
					}
				}
			}
			
			count++;
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
