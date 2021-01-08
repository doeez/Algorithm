package backjoon_210108;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

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
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int i, j;
			
			int cnt = Integer.parseInt(br.readLine());
			String[] numbers = br.readLine().split(" ");
			int min = Integer.parseInt(numbers[0]);
			int max = Integer.parseInt(numbers[0]);
			br.close();

			for(i = 0; i < numbers.length; i++) {
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
	}
}
