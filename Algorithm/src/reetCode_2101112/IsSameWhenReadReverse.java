package reetCode_2101112;

public class IsSameWhenReadReverse {

	// 인자로 넘어온 값이 앞뒤를 바꿔서 읽었을때도 똑같은 지 검사.
	// EX) 1
	// Input: x = 121
	// Output: true
	// EX) 2
	// Input: x = -121
	// Output: false
	public static void main(String[] args) {
		System.out.println(isPalindrome(-323));
	}

	public static boolean isPalindrome(int x) {
		
		// 코드 1 : 처음에 문제 보고 작성한 코드
		// 이렇게 할 경우 String으로 변환하고 배열을 검사하고 하기 때문에 메모리+시간이 오래걸림
		/*
		 String org = Integer.toString(x);
		String[] revArr = Integer.toString(x).split("");
		String rev = "";
		for(int i = 1; i <= revArr.length; i++) {
			rev += revArr[revArr.length-i];
		}
		if(org.equals(rev))
			return true;
		else
			return false;
		 */
		
		// 코드 2 : reetCode에서 성능이 탑순위인 코드
		int sum = 0, temp = x;
		// x가 0보다 클 경우에만 while문을 타는 이유는
		// *** 음수일 경우 무조건 reverse할 경우 무조건 -가 뒤에 붙어서 같을 수 가 없음.
		// 따라서 음수는 무조건 false를 반환하게됨.
		while(x > 0){
			// 이 안의 로직은 ReverseInteger와 똑같음.
			// 일의 자리 수를 잘라내고 그 수를 10의 자리로 만든 다음 다시 일의 자리로 잘라낸 숫자를 붙이는 형식
			// 예 : 325 -> 5를 잘라 내고 sum(초기화당시 0*10)+5로 5가 만들어짐 -> x는 32가됨 -> 32에서 또 일의자리인 2를 잘라냄 -> 기존에 sum에 들어있던 5를 십의자리수로 만들고
			// 50 + 잘라낸 2 = 52 -> 반복해서 523이됨.
			int r = x % 10;
			sum = (sum * 10) + r;
			x= x / 10;
		}
		// 처음에 x를 담아뒀던 temp와 x값을 reverse한 sum과 같을경우엔 true 그 외의 경우엔 false 반환
		if(temp == sum){
			return true;
		}
		return false; 
	}
}
