package 기본_수학2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class 소인수분해 {
	
	static boolean primes[] = new boolean[10000001];
	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N;
		ArrayList<Integer> factorization;
		
		try {
			
			N = Integer.parseInt(br.readLine());
			
			setPrimes();
			
			if(isPrime(N)) {
				
				bw.write(String.valueOf(N));
				
			}else {
				
				factorization = factorization(N);
				
				for(int i=0; i<factorization.size(); i++) {
					
					bw.write(factorization.get(i) + "\n");
					
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
		
		for(int i=0; i<primes.length; i++)
			primes[i] = true;
		
		primes[0] = false;
		primes[1] = false;
		
		for(int i=2; i<(int)Math.sqrt(primes.length); i++) {
			
			if(primes[i] == false)
				continue;
			else {
				
				for(int j=2*i; j<primes.length; j+=i) {
					
					primes[j] = false;
					
				}
				
			}
			
		}
		
	}
	
	static boolean isPrime(int N) {
		
		return primes[N];
		
	}
	
	static ArrayList<Integer> factorization(int N) {
		
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int i=2;
		
		while(i<primes.length) {
			
			if(primes[i] && N%i==0) {
				answer.add(i);
				N /= i;
				continue;
			}
			
			i++;
			
		}
		
		return answer;
		
	}
	
}
