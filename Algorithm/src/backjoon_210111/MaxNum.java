package backjoon_210111;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MaxNum {

	// 백준 2562
	// 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
	// 예를 들어, 서로 다른 9개의 자연수 3, 29, 38, 12, 57, 74, 40, 85, 61 이 주어지면
	// 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
	// 입력값 : 첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 자연수 = 양의정수이므로 초기화를 -1로 해줌.
		int max = -1, idx = 0;
		
		try {
			for(int i = 1; i <= 9 ; i++) {
				int compare = Integer.parseInt(br.readLine());
				if(max < compare) {
					max = compare;
					idx = i;
				}
			}
			br.close();
			bw.write(max+"\n"+idx);
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
