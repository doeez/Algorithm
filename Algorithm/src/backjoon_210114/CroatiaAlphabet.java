package backjoon_210114;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CroatiaAlphabet {

	// 백준 2941
	// 예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.
	/*
	크로아티아 알파벳	변경
	č	c=
	ć	c-
	dž	dz=
	đ	d-
	lj	lj
	nj	nj
	š	s=
	ž	z=
	*/
	// 예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
	// dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.
	// 입력값 : 첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
	// 단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.
	// 출력값 : 입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
	// EX) 입력값 : ljes=njak 출력값 : 6
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			int cnt = 0;
			int i;
			for(i = 0; i < str.length(); i++) {
				if(str.charAt(i) == 'c') {
					// c다음글자가 = or -일 경우 두글자가 하나이기때문에 i를 1증가시킴;
					if(i+1 < str.length() && str.charAt(i+1) == '=') {
						i++;
					}
					else if(i+1 < str.length() && str.charAt(i+1) == '-') {
						i++;
					}
				}
				if(str.charAt(i) == 'd') {
					if(i+1 < str.length() && str.charAt(i+1) == 'z') {
						if(i+2 < str.length() && str.charAt(i+2) == '=') {
							i += 2;
						}
					}
					else if(i+1 < str.length() && str.charAt(i+1) == '-') {
						i++;
					}
				}
				if(str.charAt(i) == 'l') {
					if(i+1 < str.length() && str.charAt(i+1) == 'j') {
						i++;
					}
				}
				if(str.charAt(i) == 'n') {
					if(i+1 < str.length() && str.charAt(i+1) == 'j') {
						i++;
					}
				}
				if(str.charAt(i) == 's') {
					if(i+1 < str.length() && str.charAt(i+1) == '=') {
						i++;
					}
				}
				if(str.charAt(i) == 'z') {
					if(i+1 < str.length() && str.charAt(i+1) == '=') {
						i++;
					}
				}
				cnt++;
			}
			br.close();
			System.out.println(cnt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
