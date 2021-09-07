package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연산자_끼워넣기 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] num = new int[N];
		int[] oper = new int[4];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<N; i++) {
			num[i] = Integer.parseInt(st.nextToken());
			oper[i] = Integer.parseInt(st1.nextToken());
		}
		
		inputOperation(oper[0], oper[1], oper[2], oper[3]);
		
	}
	
	public static void inputOperation(int plus, int minus, int mulit, int div) {
		if(plus != 0) {
			inputOperation(plus-1, minus, mulit, div);
			return;
		}
		
		if(minus != 0) {
			inputOperation(plus, minus-1, mulit, div);
			return;
		}
		
		if(mulit != 0) {
			inputOperation(plus, minus, mulit-1, div);
			return;
		}
		
		if(div != 0) {
			inputOperation(plus, minus, mulit, div-1);
			return;
		}
		
		if(plus == 0 && minus == 0 && mulit == 0 && div == 0) {
			
		}
	}

}
