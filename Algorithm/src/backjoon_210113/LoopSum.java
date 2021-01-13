package backjoon_210113;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LoopSum {

	// 백준 11720
	// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
	// 입력값 : 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
	// 출력값 : 입력으로 주어진 숫자 N개의 합을 출력한다.
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 코드 1
		// (비고) 입력받는 숫자를 String으로 바꾸지않고 long으로 받아서 num % 10 을 반복하는것도 생각해봤으나
		// 입력값에 대한 제한이 없기때문에 MAX_VALUE를 벗어나서 에러날 가능성이 있음.
		try {
			int loop = Integer.parseInt(br.readLine());
			String[] nums = br.readLine().split("");
			br.close();
			int sum = 0;
			for(int i = 0; i < loop; i++) {
				sum += Integer.parseInt(nums[i]);
			}
			System.out.println(sum);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 코드 2 : 실행시간이 위의 코드 보다 적은것 찾아봄
		// **** 내가 적은 코드와의 차이점 ****
		// -  split사용하여 배열 생성하지않고  charAt으로 한글자씩 읽어들임.
		try {
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			
			int count = Integer.parseInt(br2.readLine());
			String input = new String(br2.readLine());
			int sum = 0;
			
			// 1번 방법
			// 찾은 코드 그대로 이나 charAt의 값을 받아와서 -48을 하는 부분을 바꾸고 싶어서 다른방법을 찾아봄.
			/*
			for(int i=0;i<count;i++) {
				int a = (int)(input.charAt(i));
				sum += a-48;
			}
			*/
			// 2번 방법
			for(int i=0;i<count;i++) {
				int a = Character.getNumericValue(input.charAt(i));
				sum += a;
			}
			
			System.out.println(sum);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
