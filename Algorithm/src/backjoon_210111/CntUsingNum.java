package backjoon_210111;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CntUsingNum {
	// 백준 2577
	// 세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
	// 예를 들어 A = 150, B = 266, C = 427 이라면  A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
	// 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
	public static void main(String[] args) {
		
		// 코드 1 : 내가 초반에 문제를 보고 푼 코드.
		/*
		int[] cntArr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int[] arr = new int[10];
			int mul = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
			br.close();
			
			String[] numArr = Integer.toString(mul).split("");
			for(int i = 0; i < numArr.length; i++) {
				switch (Integer.parseInt(numArr[i])) {
					case 0: cntArr[0] = cntArr[0]+1;
						break;
					case 1: cntArr[1] = cntArr[1]+1;
						break;
					case 2: cntArr[2] = cntArr[2]+1;
						break;
					case 3: cntArr[3] = cntArr[3]+1;
						break;
					case 4: cntArr[4] = cntArr[4]+1;
						break;
					case 5: cntArr[5] = cntArr[5]+1;
						break;
					case 6: cntArr[6] = cntArr[6]+1;
						break;
					case 7: cntArr[7] = cntArr[7]+1;
						break;
					case 8: cntArr[8] = cntArr[8]+1;
						break;
					case 9: cntArr[9] = cntArr[9]+1;
						break;
				}
			}
			for(int i = 0; i < cntArr.length; i++) {
				bw.write(String.valueOf(cntArr[i]));
				if(i < cntArr.length-1)
					bw.write("\n");
			}
			bw.flush();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		// 코드 2 : 인터넷을 통해 찾은 코드
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int[] arr = new int[10];
			int mul = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
			br.close();
			
			while(mul!=0) {
				// 입력받은 값을 전부 곱한 수를 10으로 나눈 나머지 값을 인덱스로 사용하여 카운트를 늘려감
				// ex) 17037300 % 10 = 0 이므로 arr의 0번째 인덱스가  1번 카운트된다.
				// 그 다음 10으로 나눠진 수인 1703730 % 10을 하면 또 0이기 때문에 0번째 인덱스가 1카운트 =>
				// 170373 % 10 = 3이므로 3번째 인덱스가 1번 카운트 됨.
				// **** 10으로 나눈 나머지 값이 일의 자리수이기 때문에 일의 자리수를 카운트 하는 원리! ****
				arr[mul%10]++;
				mul/=10;
			}
			for(int out:arr) {
				System.out.println(out);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
