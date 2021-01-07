package backJoon_210107;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class PrintSumAB {
	
	public static void main(String[] args) {
		// 백준 10952
		// 입력은 여러 개의 테스트 케이스로 이루어져 있다.
		// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		// 입력의 마지막에는 0 두 개가 들어온다.
		/*
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			while(true) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				if(a == 0 && b == 0)
					break;
				bw.write(a+b+"\n");
			}
			br.close();
			bw.flush();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		// 백준 10951
		// 입력은 여러 개의 테스트 케이스로 이루어져 있다.
		// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		// 종료조건이 주어지지 않음. 즉 EOF처리를 해주어야한다.
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = "";
			while((str=br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(str);
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				System.out.println(a+b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
