package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


//공부 더 필요
public class 스타트와링크 {
	static int N;
	static int[][] team;
	static boolean[] marked;
	static int MIN = Integer.MAX_VALUE;;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		team = new int[N][N];
		marked = new boolean[N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++)
				team[i][j] = Integer.parseInt(st.nextToken());
		}

		dfs(0, 0);
		
		System.out.print(MIN);
	}

	public static void dfs(int idx, int count) {
		if(count == N/2) {
			int startTeam = 0;
			int linkTeam = 0;
			
			for(int i=0; i<N-1; i++) {
				for(int j=i+1; j<N; j++) {
					if(marked[i] == true && marked[j] == true) {
						startTeam += team[i][j];
						startTeam += team[j][i];
					}
					else if(marked[i] == false && marked[j] == false) {
						linkTeam += team[i][j];
						linkTeam += team[j][i];
					}
				}
			}
			
			int val = Math.abs(startTeam - linkTeam);
			
			if(val == 0) {
				System.out.println(val);
				System.exit(0);
			}
			
			MIN = Math.min(val, MIN);
			
			return;
		}
		
		for(int i=idx; i<N; i++) {
			if(!marked[i]) {
				marked[i] = true;
				dfs(i + 1, count + 1);
				marked[i] = false;
			}
		}
	}

}
