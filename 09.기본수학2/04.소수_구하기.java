package 기본_수학2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 소수_구하기 {
	
	static boolean primes[] = new boolean[1000001];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str;
		int M,N;
		
		try {
			
			str = br.readLine().split(" ");
			M = Integer.parseInt(str[0]);
			N = Integer.parseInt(str[1]);
			
			setPrimes();
			
			for(int i=M; i<=N; i++) {
				if(isPrime(i)) {
					bw.write(i + "\n");
				}
			}
			
			bw.flush();
			bw.close();
			br.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	
	static void setPrimes() {
		
		for(int i=0; i<primes.length; i++) {
			primes[i] = true;
		}
		
		primes[0] = false;
		primes[1] = false;
		
		for(int i=0; i<(int)Math.sqrt(primes.length); i++) {
			
			if(primes[i] == false)
				continue;
			
			for(int j=2*i; j<primes.length; j+=i) {
				
				primes[j] = false;
				
			}
			
		}
		
	}
	
	static boolean isPrime(int N) {
		return primes[N];
	}
}
