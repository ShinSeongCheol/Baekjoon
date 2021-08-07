package 정렬;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 통계학 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		for (int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(br.readLine());

		Arrays.sort(arr);

		bw.write(avg(arr) + "\n" + midVal(arr) + "\n" + mode(arr) + "\n" + range(arr));
		bw.flush();
		bw.close();
		br.close();
	}

	static String avg(int[] arr) {
		int sum = 0;

		for (int i : arr) {
			sum += i;
		}

		if (sum >= 0) {
			if (sum % arr.length >= arr.length / 2 + 1) {
				return Integer.toString((sum / arr.length) + 1);
			} else {
				return Integer.toString((sum / arr.length));
			}
		} else {
			if (sum % arr.length <= -arr.length / 2 - 1) {
				return Integer.toString((sum / arr.length) - 1);
			} else {
				return Integer.toString((sum / arr.length));
			}
		}

	}

	static String midVal(int[] arr) {
		int mid = (0 + arr.length - 1) / 2;

		return Integer.toString(arr[mid]);
	}

	static String mode(int[] arr) {
		int[] num = new int[8001];

		for (int i = 0; i < arr.length; i++) {
			num[arr[i] + 4000]++;
		}

		int max = 0;
		int mode = 0;
		boolean second = false;

		for (int i : num) {
			if(i > max)
				max = i;
		}
		
		for(int i=0; i<num.length; i++) {
			if(num[i] == max) {
				mode = i-4000;
				if(second == true)
					break;
				second = true;
			}
		}

		return Integer.toString(mode);
	}

	static String range(int[] arr) {
		return Integer.toString(arr[arr.length - 1] - arr[0]);
	}
}
