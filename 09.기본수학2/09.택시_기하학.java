package 기본_수학2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 택시_기하학 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int R;
		String uclid,taxi;
		
		try {
			
			R = Integer.parseInt(br.readLine());
			
			uclid = String.format("%.6f", uclid(R));
			taxi = String.format("%.6f", taxi(R));
			
			bw.write(uclid + "\n" + taxi);
			
			bw.flush();
			bw.close();
			br.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	static Double uclid(int R) {
		return (R*R*Math.PI);
	}
	
	static Double taxi(int R) {
		return (double) (R*R*2);
	}
}
