package sort3Types;

//공통문제
//다음 숫자들을 오름차순으로 정렬하는 프로그램을 작성하라.
//1, 10, 5, 8, 7, 6, 4, 3, 2, 9

//선택정렬 : 가장 작은것을 "선택"하여 계속 앞으로 보내는것을 반복하는 알고리즘
//가장 원시적인 방법이고 구현하기 쉬우나, 효율성이 좋지않고 비용을 많이 잡아먹는 방법
public class SelectSort {
	public int[] selectSort() {
		int i, j, min, idx, temp;
		int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		
		for(i = 0; i < array.length; i++) {
			min = 9999; // 임의의 값으로 그냥 가장 큰 수를 넣어준다고 생각하면 됨.
			idx = i;
			for(j = i; j < array.length; j++) {
				System.out.println("now min : "+ min);
				// 만약 현재 인덱스의 값이 min(최소값)보다 작으면 최소값을 현재 인덱스의 값으로 변경하고 두 값의 위치를 변경
				if(min > array[j]) {
					min = array[j];
					idx = j;
				}
			}
			// temp에 현재 i의 값을 넣어준뒤
			temp = array[i];
			// 현재 인덱스에는 j인덱스의 값을 넣어주고, j인덱스에는 현재 위치의 값을 넣어준다.
			array[i] = array[idx];
			array[idx] = temp;
			// 이렇게 하면 만약 다음 인덱스의 값이 현재 인덱스의 값이 
		}
		
		return array;
	}
}