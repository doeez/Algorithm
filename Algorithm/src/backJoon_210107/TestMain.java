package backJoon_210107;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestMain {
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int n = Integer.parseInt(br.readLine());
			for(int i = 1; i <= n; i++) {
				bw.write(i+"\n");
			}
			bw.flush();
		} catch (IOException e) { //
			e.printStackTrace();
		}
		
		
		/*
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int n = Integer.parseInt(br.readLine());
			for(int i = 0; i < n; i++) {
				bw.write((n-i)+"\n");
			}
			bw.flush();
		} catch (IOException e) { //
			e.printStackTrace();
		}
		*/
	}
}
