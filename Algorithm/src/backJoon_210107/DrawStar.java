package backJoon_210107;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DrawStar {
	// 별찍
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int n = Integer.parseInt(br.readLine());
			br.close();
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= n - i; j++) {
					bw.write(" ");
				}
				for(int k = 1; k <= i; k++) {
					bw.write("*");
				}
				bw.write("\n");
			}
			bw.flush();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
