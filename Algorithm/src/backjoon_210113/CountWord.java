package backjoon_210113;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountWord {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringTokenizer st = new StringTokenizer(br.readLine().trim());
			br.close();
			int cnt = 0;
			while(st.hasMoreTokens()) {
				if(st.nextToken() != "")
					cnt++;
			}
			System.out.println(cnt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
