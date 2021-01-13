package backjoon_210113;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WhatisMostUseCharacter {

	// 백준 1157
	// 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다
	// 입력값 : 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
	// 출력값 : 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
	// 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			// 총 알파벳의 수는 26개이므로 26개의 크기를 갖는 배열을 생성해준다.
			int[] arr = new int[26];
			String str = br.readLine();
			int i = 0;
			for (i = 0; i < str.length(); i++){
				if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
					arr[str.charAt(i) - 'A']++;
				}
				else {
					arr[str.charAt(i) - 'a']++;
				}
			}
			int max = 0;
			char alphabet = '?';
			for(i = 0; i < arr.length; i++) {
				if(max < arr[i]) {
					max = arr[i];
					// 대문자로 변경해줌
					alphabet = (char)(i+'A');
				}
				// 만약 최대값과 같다면 가장 많이 사용된 알파벳이 복수개이기 때문에 "?"출력
				else if (max == arr[i]){
					alphabet = '?';
				}
			}
			br.close();
			System.out.println(alphabet);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
