package 함수;

import java.util.Scanner;

public class 정수_N개의_합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		long ans = sum(a);
		
		System.out.println(ans);
	}
	
	private static long sum(int[] a) {
		long ans = 0;
		for(int i=0; i<a.length; i++) {
			ans += a[i];
		}
		return ans;
	}
}
