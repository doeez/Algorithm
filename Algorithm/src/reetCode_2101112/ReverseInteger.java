package reetCode_2101112;

public class ReverseInteger {

	// 입력받은 int x를 역순서로 만들어서 반환하라.
	// 입력값 : 123, -321
	// 출력값 : 321, -123
	// 참고: 정수 범위 내에서만 정수를 저장할 수있는 환경을 다루고 있다고 가정합니다 . 이 문제의 경우 역 정수가 오버플 로 될 때 함수가
	// 반환된다고 가정합니다 .
	public static void main(String[] args) {
		System.out.println(reverse(1463847412));
	}
	
	public static int reverse(int x) {
		int rev = 0;
		// rev에 x의 값을 일의자리수 순으로 계속 잘라서 집어넣는다.
		// 따라서, 인자로 들어오는 x가 0이 될때까지 while문을 돌린다.
		while (x != 0) {
			// 일의 자리 수를 담을 변수를 하나 선언
			int cut = x % 10;
			// x를 10으로 나눈값을 int x에 대입해주면 뒤의 소수점 자리는 잘리기 때문에
			// 일의자리수를 자른 값을 x에 넣을 수 있다.
			x = x / 10;
			// int 범위 내에서만 다뤄야 하기 때문에.
			// MAX_VALUE와 MIN_VALUE를 10으로 나누는 이유는
			// 이 다음의 계산에서 rev값에 10을 곱하고 cut에서 잘린 일의자리수를 넣어주는데, 그 계산에서 이미 MAX_VALUE나 MIN_VALUE를 넘었을 경우에는
			// 잘못된 값이 나오기때문에 계산 전에 MAX_VALUE/10 또는 MIN_VALUE/10을 사용하여 비교해준다.
			// && 뒤의 조건식은 rev가 MAX_VALUE/10 OR MIN_VALUE/10의 값과 같을 경우에는 break가 걸리지 않고 에러가 나기 때문에
			// rev의 값이 MAX_VALUE/10의 값과 같고 일의자리에 들어갈 cut의 값이 최대값 2147483647의 일의자리인 7보다 클 경우에는 MAX_VALUE를 넘기때문에 break
			// 마찬가지로 rev의 값이 MIN_VALUE/10의 값과 같고 일의자리에 들어갈 cut의 값이 최소값 -2147483648의 일의자리인 8보다 작을 경우에는  MIN_VALUE의 범위에서 벗어나기때문에 break;
			if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && cut > 7)) {
				return 0;
			} 
			if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && cut < -8)) { 
				return 0;
			}

			// rev에 들어있던 값을 10씩 곱해주면서 일의자리 수에 위에서 잘린 일의자리수가 들어갈 수 있도록 해준다.
			rev = rev * 10 + cut;
		}
		return rev;
	}
}
