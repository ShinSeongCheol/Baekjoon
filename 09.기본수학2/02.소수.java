package 기본수학2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 소수 {
	
	static boolean primes[] = new boolean[10001];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int M,N,sum=0,minNum=0;
		
		try {
			
			M = Integer.parseInt(br.readLine());
			N = Integer.parseInt(br.readLine());
			
			setPrimes();
			
			sum = sumOfPrimes(M,N);
			minNum = minOfPrimes(M,N);
			
			if(minNum ==0 && sum == 0) 
				bw.write("-1");
			else
				bw.write(sum + "\n" + minNum);
			
			bw.flush();
			bw.close();
			br.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	static void setPrimes() {
		
		for(int i=0; i<primes.length; i++) {
			if(i == 0 || i == 1) {
				primes[i] = false;
			}else {
				primes[i]	 = true;
			}
		}
		
		for(int i=2; i<(int)Math.sqrt(primes.length); i++) {
			
			if(primes[i] == false) 
				continue;
			
			for(int j=2*i; j<10001; j+=i) {
				primes[j] = false;
			}
			
		}
		
	}
	
	static int sumOfPrimes(int M, int N) {
		
		int sum=0;
		
		for(int i=M; i<=N; i++) {
			if(primes[i] == true) {
				sum += i;
			}
		}
		
		return sum;
		
	}
	
	static int minOfPrimes(int M, int N) {
		
		int minNum=0;
		
		for(int i=M; i<=N; i++) {
			
			if(primes[i] == true) {
				minNum = i;
				break;
			}
			
		}
		
		return minNum;
		
	}
}
