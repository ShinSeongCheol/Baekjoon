package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 스도쿠 {
	static int[][] map = new int[9][9];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 9; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		sudoku(0, 0);
		
		br.close();
	}

	public static void sudoku(int row, int col) {
		if (col == 9) {
			sudoku(row + 1, 0);
			return;
		}

		if (row == 9) {
			for (int[] i : map) {
				for (int j : i) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
			System.exit(0);
		}
		
		if(map[row][col] == 0) {
			for(int i = 1; i<=9; i++) {
				if(possibility(row, col, i)) {
					map[row][col] = i;
					sudoku(row, col + 1);
				}
			}
			map[row][col] = 0;
			return;
		}
		
		sudoku(row, col + 1);
	}
	
	public static boolean possibility(int row, int col, int value) {
		for(int i=0; i<9; i++) {
			if(map[row][i] == value) {
				return false;
			}
		}
		
		for(int i=0; i<9; i++) {
			if(map[i][col] == value) {
				return false;
			}
		}
		
		int setRow = (row/3)*3;
		int setCol = (col/3)*3;
		
		for(int i=setRow; i<setRow+3; i++) {
			for(int j=setCol; j<setCol+3; j++) {
				if(map[setRow][setCol] == value) {
					return false;
				}
			}
		}
		
		return true;
	}
}

