package backjoon_210113;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class SelfNumber {
	// 백준 4673
	/*
	 셀프 넘버는 1949년 인도 수학자 D.R. Kaprekar가 이름 붙였다. 양의 정수 n에 대해서 d(n)을 n과 n의 각 자리수를 더하는 함수라고 정의하자. 예를 들어, d(75) = 75+7+5 = 87이다.
	 양의 정수 n이 주어졌을 때, 이 수를 시작해서 n, d(n), d(d(n)), d(d(d(n))), ...과 같은 무한 수열을 만들 수 있다. 
	 예를 들어, 33으로 시작한다면 다음 수는 33 + 3 + 3 = 39이고, 그 다음 수는 39 + 3 + 9 = 51, 다음 수는 51 + 5 + 1 = 57이다. 
	 이런식으로 다음과 같은 수열을 만들 수 있다.33, 39, 51, 57, 69, 84, 96, 111, 114, 120, 123, 129, 141, ... n을 d(n)의 생성자라고 한다.
	 위의 수열에서 33은 39의 생성자이고, 39는 51의 생성자, 51은 57의 생성자이다. 생성자가 한 개보다 많은 경우도 있다. 예를 들어, 101은 생성자가 2개(91과 100) 있다. 
	 생성자가 없는 숫자를 셀프 넘버라고 한다. 100보다 작은 셀프 넘버는 총 13개가 있다. 1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97
	 10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
	 
	 (풀이) 즉, 각 숫자들을 위와 같은 식으로 (33 + 3 + 3 = 39) 만들었을때 나오는 숫자는 셀프넘버가 아니다. 3으로 예를 들어보면 3보다 작은 수인
	 1 + 1 = 2, 2 + 2 = 4 이기 때문에 3은 셀프넘버가 된다.
	 */
	// 입력값 : 없음
	// 출력값 : 10,000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 증가하는 순서로 출력한다.
	public static void main(String[] args) {
		
		// 코드 1 : 문제를 보고 처음 작성한 코드
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int[] numbers = new int[10001];
			int one, temp, n;
			for(int i = 1; i <= 10000; i++) {
				n = i;
				temp = 0;
				while(n != 0) {
					one = n % 10;
					n /= 10;
					temp = temp + one;
				}
				temp += i;
				if(temp <= 10000)
					numbers[temp] = temp;
			}
			for(int i = 1; i <= 10000; i++) {
				if(numbers[i] == 0)
					bw.write(i+"\n");
			}
			bw.flush();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 코드 2 : 실행 시간이 코드1보다 0.3초 짧음
		boolean[] arr = new boolean[10001];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 10001; i++) {
            int n = b(i);
            if(n < 10001) {
                arr[b(i)] = true; // 생성자가 있는 숫자를 true로 반환
            }
        }

        for (int i = 1; i < 10001; i++) {
            if(!arr[i]){
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
	}
	
	public static int b(int number){
        int sum = number;
        while(number!=0) {
            int one = number % 10;
            sum += one;
            number /= 10;
        }
        return sum;
    }

}
