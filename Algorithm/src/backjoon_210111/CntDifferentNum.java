package backjoon_210111;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class CntDifferentNum {

	// 백준 3052
	// 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
	// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
	// 입력값 : 첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
	// 출력값 : 첫째 줄에 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
	public static void main(String[] args) {
		
		// 코드 1 : 처음 문제를 보고 작성한 코드 
		/*
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int[] arr = new int[10];
			for(int i = 0; i < 10; i++) {
				arr[i] = Integer.parseInt(br.readLine()) % 42;
			}
			// ArrayList를 사용한 중복제거
			ArrayList<Integer> rm = new ArrayList<>();
			for(int num:arr) {
				if(!rm.contains(num))
					rm.add(num);
			}
			br.close();
			bw.write(String.valueOf(rm.size()));
			bw.flush();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		// 코드 2 : 다른 코드를 보고 개선한 코드
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			// *** hashSet은 중복된 데이터는 담지 않음. ***
			HashSet<Integer> nums = new HashSet<>();
			for(int i = 0; i < 10; i++) {
				nums.add(Integer.parseInt(br.readLine()) % 42);
			}
			br.close();
			System.out.println(nums.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
