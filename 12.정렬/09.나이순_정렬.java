package 정렬;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 나이순_정렬 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] age = new int[N];
		String[] name = new String[N];
		int count=1;
		
		for(int i=0; i<N; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			age[i] = Integer.parseInt(st.nextToken());
			name[i] = st.nextToken();
			
		}
		
		while(1 <= count && count <= 200) {
			
			for(int i=0; i<N; i++) {
				
				if(age[i] == count) {
					bw.write(age[i] + " " + name[i] + "\n");
				}
				
			}
			
			count++;
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
