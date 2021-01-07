package sort3Types;

//공통문제
//다음 숫자들을 오름차순으로 정렬하는 프로그램을 작성하라.
//3, 7, 8, 1, 5, 9, 6, 10, 2, 4

//** 퀵정렬 : 한번 이해하면 쉽고 효율적인 알고리즘 **
//특정한 값을 기준으로 큰 숫자와 작은 숫자를 반으로 나누는것 (나누기 2를 하는것이아니라 예를들어 배열의 경우 특정한 값을 기준으로 2덩어리로 나눈다는 말)
//기준이 되는 값을 @@피벗(Pivot)@@이라고 한다.
public class QuickSort {

	// 보통 피벗값의 초기화는 배열의 가장 처음 값을 피벗값을 설정한다.
	// {3, 7, 8, 1, 5, 9, 6, 10, 2, 4} 의 경우 3을 피벗값으로 설정하고
	// 피벗값을 기준으로 오른쪽으로 검사하는 값은 피벗값인 3보다 큰 값 즉 7이 되고, 왼쪽으로 검사하는 값은 피벗값보다 작은 값 즉 2가 된다.
	
	/* 퀵정렬이 수행되는 로직 */
	// 피벗값을 기준으로 가장 큰 값과 가장 작은값의 위치를 바꿔준다.
	// 예의 배열로 할 경우 {3, 7, 8, 1, 5, 9, 6, 10, 2, 4} 피벗값인 3을 기준으로 오른쪽으로 검사했을때 제일 처음 마주하는 max값인 7, 왼쪽으로 검사했을때 제일 처음 마주치는 min값 2
	// 따라서 7과 2의 자리를 바꿔준다. = {3, 2, 8, 1, 5, 9, 6, 10, 7, 4}
	// 그 다음으로 피벗값인 3을 기준으로 오른쪽으로 쭉 검사했을때의 max값 8, 왼쪽에서부터 쭉 검사했을때의 min값 1
	// 따라서 8과 1의 자리를 바꿔준다. = {3, 2, 1, 8, 5, 9, 6, 10, 7, 4}
	// 다음으로 검사를 또 실행하면 max값 8, min값 1 (= 3부터 4,7,10,6,9,5,8 로 흘러가서 1을 만남)
	// *중요!!* 여기서 중요한것은 이 경우 1과 8은 엇갈렸다. 엇갈린것은 **피벗값을 기준으로한 최소값의 인덱스가 최대값의 인덱스보다 작은것**을 말한다.
	// 이럴 경우 최소값과 피벗값인 3의 위치를 바꿔준다. = {1, 2, 3, 8, 5, 9, 6, 10, 7, 4}
	// 이렇게 3보다 왼쪽에 있는 값들은 3보다 작고, 3보다 오른쪽에 있는 값들은 전부 3보다 크도록 정렬이 끝났다.
	// 여기서 왼쪽집합과 오른쪽집합으로 나누어 정렬을 진행한다.
	// [1, 2] [3] [8, 5, 9, 6, 10, 7, 4] 두덩어리로 나누어져서 1이 왼쪽덩어리의 피벗값이되고 8이 오른쪽덩어리의 피벗값이 된다.
	
	// 정리하자면 퀵 정렬은 첫번째 값을 피벗값으로 설정한 뒤(예에선 3) 두 덩어리로 나누어 질때까지 정렬을 수행한다.(문제는 오름차순 정렬이기때문에 3의 왼쪽은 3보다 작게, 3의 오른쪽은 3보다 크게)
	// 그리고 두 덩어리로 나누어지면 각 덩어리별로 정렬을 수행한다. [1,2]의 경우 1이 피벗값이 되고 왼쪽, 오른쪽으로 min,max에 따른 정렬을 수행하고 [8, 5, 9, 6, 10, 7, 4] 도 똑같이 정렬을 수행한다.
	// 이것이 반복되며 피벗값이 또 바뀌고 정렬을 수행하는게 반복된다.
	
	/*
	public int[] quickSort() {
		int[] array = {3, 7, 8, 1, 5, 9, 6, 10, 2, 4};
		
		array = quickSort(array, 0, array.length-1);
		return array;
	}*/
	
	public void quickSort(int[] arr, int start, int end) {
		
		// 원소가 1개인 경우
		if(start >= end) {
			return;
		}
		
		// 피벗값 잡아주기
		int key = start; // 피벗값은 첫번째 원소로 해준다.
		int i = start + 1; // 오른쪽으로 검사하며 max값을 검사
		int j = end; // 마지막부터 왼쪽으로 min값을 검사 (첫번째값이 피벗값이므로)
		int temp;
		
		// max값과 min값이 엇갈릴 때 까지 반복 : min값의 인덱스가 max의 인덱스보다 작을때
		while(i <= j) {
			
			/*
			 * i <= end 또는 j > start를 앞에 안넣어주면 쓸데없는 연산으로 무한루프에 빠지게되는데 그 이유는 모르겠음... 
			 */
			// 피벗값보다 큰 값을 만날때까지 반복 (피벗값을 기준으로 오른쪽으로 최대값검사)
			while(i <= end && arr[i] <= arr[key]) {
				// 오른쪽으로 가기때문에 ++;
				i++;
			}
			// 피벗값보다 작은 값을 만날때까지 반복 (피벗값을 기준으로 왼쪽으로 최소값검사)
			// 만약 최소값이 현재 인덱스라면 음수인덱스는 존재하지않기때문에 j가 start보다 작을때까지만 검사
			while(j > start && arr[j] >= arr[key]) {
				// 왼쪽으로 가기때문에 --;
				j--;
			}
			
			// 최소값과 최대값이 엇갈리게 되면 피벗값과 교체
			if(i > j) {
				temp = arr[j];
				arr[j] = arr[key];
				arr[key] = temp;
			} 
			// 엇갈리지 않았으면 최대값과 최소값의 위치를 변경 (작은숫자가 앞에 가도록)
			else {
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		
		/* 재귀적 함수 사용 */
		// 피벗값을 기준으로 왼쪽 덩어리의 정렬 수행
		quickSort(arr, start, j-1);
		// 피벗값을 기준으로 오른쪽 덩어리의 정렬 수행
		quickSort(arr, j+1, end);
	}
}