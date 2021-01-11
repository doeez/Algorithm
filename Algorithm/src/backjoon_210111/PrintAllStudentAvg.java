package backjoon_210111;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class PrintAllStudentAvg {
	// 백준 4344
	// 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
	// 입력값 : 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
	// 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다.
	// 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
	// 출력값 : 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int testCase = Integer.parseInt(br.readLine());
			for(int i = 0; i < testCase; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int studentNum = Integer.parseInt(st.nextToken());
				double[] avgList = new double[studentNum];
				double sum = 0;
				int cnt = 0;
				for(int j = 0; j < studentNum; j++) {
					avgList[j] = Double.parseDouble(st.nextToken());
					sum += avgList[j];
				}
				for(int k = 0; k < studentNum; k++) {
					if(avgList[k] > (sum/studentNum))
						cnt++;
				}
				bw.write(String.format("%.3f",((double)cnt/(double)studentNum * 100.0))+"%\n");
			}
			br.close();
			bw.flush();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
