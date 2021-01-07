package backJoon_210107;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class FasterThenSysout {

	// System.out.println보다 빠르게 출력하기.
	public static void main(String[] args) {
		// 백준 15552 : 빠른 A+B 출력
		/*
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int cnt = Integer.parseInt(br.readLine());

			for(int i = 0; i < cnt; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());// StringTokenizer을 사용해서 " "(공백) 자르기
				int a = Integer.parseInt(st.nextToken()); //첫번째 호출
				int b = Integer.parseInt(st.nextToken()); //두번째 호출
				bw.write((a+b)+"\n");
			}

			bw.flush();
			bw.close();
		} catch (IOException e) { //
			e.printStackTrace();
		}
		*/
		
		// 백준 2741 : 1 부터 n까지 출력
		/*
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int n = Integer.parseInt(br.readLine());
			for(int i = 1; i <= n; i++) {
				bw.write(i+"\n");
			}
			bw.flush();
			bw.close();
		} catch (IOException e) { //
			e.printStackTrace();
		}
		 */
		
		// 백준 11021
		/*
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int cnt = Integer.parseInt(br.readLine());

			for(int i = 0; i < cnt; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());// StringTokenizer을 사용해서 " "(공백) 자르기
				int a = Integer.parseInt(st.nextToken()); //첫번째 호출
				int b = Integer.parseInt(st.nextToken()); //두번째 호출
				bw.write("Case #"+(i+1)+": "+(a+b)+"\n");
			}

			bw.flush();
			bw.close();
		} catch (IOException e) { //
			e.printStackTrace();
		}
		*/
		
		// 백준 11022 
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int cnt = Integer.parseInt(br.readLine());

			for(int i = 0; i < cnt; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());// StringTokenizer을 사용해서 " "(공백) 자르기
				int a = Integer.parseInt(st.nextToken()); //첫번째 호출
				int b = Integer.parseInt(st.nextToken()); //두번째 호출
				bw.write("Case #"+(i+1)+": "+a+" + "+b+" = "+(a+b)+"\n");
			}

			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
