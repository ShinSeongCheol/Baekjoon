package 기본_수학2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 골드바흐의_추측 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T, n;
		boolean[] primes;

		try {

			T = Integer.parseInt(br.readLine());
			primes = setPrimes();

			for (int i = 0; i < T; i++) {

				int[] partition = new int[2];
				n = Integer.parseInt(br.readLine());

				partition = partition(n, primes);

				bw.write(partition[0] + " " + partition[1] + "\n");
				bw.flush();

			}

			bw.close();
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static int[] partition(int n, boolean[] primes) {

		int[] partition = new int[2];

		for (int i = 2; i < n; i++) {
			
			if(primes[i] == false)
				continue;
			else {
				
				if(primes[n-i] == true && i <= n/2) {
					
					partition[0] = i;
					partition[1] = n-i;
					
				}
				
			}

		}

		return partition;

	}

	static boolean[] setPrimes() {

		boolean[] primes = new boolean[10001];

		for (int i = 0; i < primes.length; i++) {

			primes[i] = true;

		}

		primes[0] = false;
		primes[1] = false;

		for (int i = 2; i < (int) Math.sqrt(primes.length); i++) {

			if (primes[i] == false)
				continue;

			for (int j = 2 * i; j < primes.length; j += i) {

				primes[j] = false;

			}

		}

		return primes;

	}
}
