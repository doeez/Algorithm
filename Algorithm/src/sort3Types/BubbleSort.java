package sort3Types;

//공통문제
//다음 숫자들을 오름차순으로 정렬하는 프로그램을 작성하라.
//1, 10, 5, 8, 7, 6, 4, 3, 2, 9

//버블정렬 : 현재 인덱스의 옆(다음)값과 비교해서 더 작은값을 앞으로 계속 보내는 방식의 알고리즘
//가장 구현하기 쉽지만 가장 비효율적인 알고리즘
public class BubbleSort {
	public int[] bubbleSort() {
		int i, j, temp;
		int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		
		for(i = 0; i < array.length; i++) {
			// 버블정렬은 1~9까지 비교한뒤, 1~2까지 비교, 1~3까지 비교하는 식으로 점점 정렬의 수를 줄여가면서 비교한다.
			for(j = 0; j < array.length-1; j++) {
				// 따라서 현재 인덱스의 값이 다음 인덱스의 값보다 클 경우
				if(array[j] > array[j+1]) {
					// 두 값의 위치를 바꿔준다.
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			for(int k = 0; k < array.length; k++) {
				System.out.printf("%d ", array[k]);
				System.out.println();
			}
		}
		return array;
	}
}