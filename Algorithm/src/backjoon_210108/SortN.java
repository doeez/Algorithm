package backjoon_210108;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SortN {
	
	// 백준 10818 
	// 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
	// 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
	// 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
	// 예제 : 입력값
	// 5
	// 20 10 35 30 7
	// 출력값
	// 7 35
	
	// 코드 1 : split을 사용한 경우
	public static void main(String[] args) {
		/*
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int i, j;
			
			int cnt = Integer.parseInt(br.readLine());
			String[] numbers = br.readLine().split(" ");
			int min = 1000000;
			int max = -1000000;
			br.close();

			for(i = 0; i < cnt; i++) {
				if(min > Integer.parseInt(numbers[i]))
					min = Integer.parseInt(numbers[i]);
				
				if(max < Integer.parseInt(numbers[i]))
					max = Integer.parseInt(numbers[i]);
			}
			bw.write(min+" "+max);
			bw.flush();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		// 코드 2 : StringTokenizer을 사용한 경우
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
			int cnt = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int min = 1000001;
			int max = -1000001;
			br.close();

			for(int i = 0; i < cnt; i++) {
				int compare = Integer.parseInt(st.nextToken());
				if(min > compare)
					min = compare;
				
				if(max < compare)
					max = compare;
			}
			bw.write(min+" "+max);
			bw.flush();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
