package backjoon_210113;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Arithmetic_Sequence {
	
	// 백준  1065
	// 등차수열
	// 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
	// N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
	// 예제 1) 입력값 : 110, 출력값 : 99
	// 입력값 : 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
	// 출력값 : 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
	
	// **** (풀이) ****
	// 등차수열이란 연속된 숫자가 같은 간격으로 늘어나거나 줄어드는 것을 말한다.
	// 예) 1 2 3 4 5 / 3 6 9 12 15 / 9 7 5 2 0 .... 등등.
	// 문제에서는 주어지는 N이라는 숫자보다 같거나 작은 범위내에 이러한 등차수열의 성질을 가지고 있는 숫자의 갯수가 몇개인지 출력하라는 것이다.
	// 예제의 입력값이 110일때 출력값이 99인것을 보아 1 ~ 99 까지는 한수라고 가정하고 있다는것을 알 수 있다. (이게 수학적 약속인지는 모르겠으나 문제에서는 그렇게 유추가능하다.)
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			// 1~99는 한수라고 보고 있기 때문에 100 미만은 N까지의 수가 모두 한수이다.
			if(n < 100) {
				System.out.println(n);
			}
			else {
				// 100 이상일 경우 1~99까지는 한수이기때문에 cnt 99부터 시작
				int cnt = 99;
				// 입력받은 n보다 같거나 작은 수 범위 내에서만 검색
				for(int i = 100; i <= n; i++) {
					int first = i % 10;
					int second = i / 10 % 10;
					int third = i / 100;
					if(second - first == third - second)
						cnt++;
				}
				System.out.println(cnt);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
