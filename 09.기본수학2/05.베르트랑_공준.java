package 기본_수학2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 베르트랑_공준 {
	
	static boolean[] primes;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n;
		int count;
		
		try {
			
			while(true) {
				
				count = 0;
				n = Integer.parseInt(br.readLine());
				primes = new boolean[2*n+1];
				
				if(n == 0) {
					break;
				}
				
				setPrimes(n);
				
				for(int i=n+1; i<2*n+1; i++) {
					if(primes[i]) {
						count++;
					}
				}
				
				bw.write(count + "\n");
				bw.flush();
			}
			
			bw.close();
			br.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	static void setPrimes(int n) {
		
		for(int i=0; i<n*2+1; i++)
			primes[i] = true;
		
		primes[0] = false;
		primes[1] = false;
		
		for(int i=2; i<=(int)Math.sqrt(n*2+1); i++) {
			
			if(primes[i] == false)
				continue;
			
			for(int j=2*i; j<n*2+1; j+=i) {
				primes[j] = false;
			}
			
		}
		
	}
	
}
