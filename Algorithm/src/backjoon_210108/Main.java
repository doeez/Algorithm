package backjoon_210108;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
		// 백준 1110
		// 0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다.
		// 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.
		// 26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
		// 위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
		// N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
		
		// 코드 1 : 메모리 16580KB, 시간 : 172ms
		/*
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			br.close();
			
			int sum = 0, cycle = 0, left, right;
			while(true) {
				if(cycle == 0) {
					sum = n;
				}
				left = sum / 10;
				right = sum % 10;
				sum = left+right;
				if(sum >= 10) {
					sum = sum % 10;
				}
				sum = Integer.parseInt(right+""+sum);
				cycle++;
				if(sum == n)
					break;
			}
			// 왠지 모르겠으나 while문에 조건문을 true가 아니라 조건식을 걸어놨을 경우에는 bw.write가 안먹음..
			System.out.println(cycle);
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		// 위의 코드에서 개선
		// 코드 2 : 메모리 14848KB, 시간 136ms
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int n = Integer.parseInt(br.readLine());
			br.close();
			
			int cycle = 1;
			// 어처피 조건문이 true이기 때문에 어떤 값이 들어오던 while문을 타므로 변수 선언과 초기화를 같이해준다.
			// 그렇게 하면 0일때는 while문을 안타고 바로 값이 나가기때문에 아마 사용하는 메모리가 줄어들듯?
			int left = n / 10;
			int right = n % 10;
			// 오른쪽 자리를 10의 자리 수로 바꿔주고, 십의자리와 일의자리를 더한 값을 1의 자리로 바꿔준다.
			int sum = right * 10 + ((left + right) % 10);
			
			while(sum != n) {
				left = sum / 10;
				right = sum % 10;
				sum = (right * 10) + ((left + right) % 10);
				cycle++;
			}
			// 왠지 모르겠으나 while문에 조건문을 true가 아니라 조건식을 걸어놨을 경우에는 bw.write가 안먹음..
			bw.write(String.valueOf(cycle));
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
