package backjoon_210111;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumAvg {
	// 백준 1546
	// 세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
	// 예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
	// 세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
	// 입력값 : 첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 
	// 		    둘째 줄에 세준이의 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
	// 출력값 : 첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.
	public static void main(String[] args) {
		
		/*
		// 코드 1 : 문제를 보고 처음 작성한 코드
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int max = -1;
			float avg = 0F;
			float[] grade = new float[Integer.parseInt(br.readLine())];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < grade.length; i++) {
				grade[i] = Integer.parseInt(st.nextToken());
				if(max < grade[i]) {
					max = (int) grade[i];
				}
			}
			for(int i = 0; i < grade.length; i++) {
				avg += (float) (Math.round(((grade[i] / max) * 100 )*100)/100.0);
			}
			System.out.println(avg / (float)grade.length);
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		// 코드 2 : 인터넷으로 코드를 찾아본 뒤 개선한 코드
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			double avg = 0;
			int[] grade = new int[Integer.parseInt(br.readLine())];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < grade.length; i++) {
				grade[i] = Integer.parseInt(st.nextToken());
			}
			// Arrays.sort함수를 사용하면 크기가 작은순부터 정렬된다.
			Arrays.sort(grade);
			for (int i = 0; i < grade.length; i++) {
				// 결국 배열의 제일 마지막에 있는 값이 제일 큰 값임.
				avg += (double)grade[i] / grade[grade.length-1] * 100;
			}
			System.out.println(avg / grade.length);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
