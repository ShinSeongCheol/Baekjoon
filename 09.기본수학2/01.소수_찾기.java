package 기본수학2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 소수_찾기 {

	static boolean[] primes = new boolean[1001];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N,answer;
		
		try {
			
			N = Integer.parseInt(br.readLine());
			String str[] = new String[N];
			
			str = br.readLine().split(" ");
			setPrimes();
			answer = findPrimes(str);
			
			for(int i=0; i<1001; i++)
			System.out.println(i + " " + primes[i]);
			
			bw.write(String.valueOf(answer));
			bw.flush();
			bw.close();
			br.close();
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	static void setPrimes() {
		
		for(int i=0; i<=1000; i++) 
			primes[i] = true;
		
		for(int i=0; i<2; i++) 
			primes[i] = false;
		
		
		for(int i=2; i<1001; i++) {
			for(int j=2,count=j*i; j<1001; j++, count=j*i) {
				
			 if(count < 1001)
					primes[count] = false;
				
			}
			
		}
		
	}
	
	static int findPrimes(String[] str) {
		
		int count=0,num;
		
		for(int i=0; i<str.length; i++) {
			
			num = Integer.parseInt(str[i]);
			
			if(primes[num] == true) 
				count++;
			
		}
		
		return count;
	}
	
}
