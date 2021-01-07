package sort3Types;

public class Main {

	public static void main(String[] args) {
		/*
		SelectSort sort1 = new SelectSort();
		int[] array1 = sort1.selectSort();
		for(int i = 0; i < array1.length; i++) {
			System.out.printf("%d ", array1[i]);
		}
		
		BubbleSort sort2 = new BubbleSort();
		int[] array2 = sort2.bubbleSort();
		for(int i = 0; i < array2.length; i++) {
			System.out.printf("%d ", array2[i]);
		}
		
		InsertSort sort3 = new InsertSort();
		int[] array3 = sort3.insertSort();
		for(int i = 0; i < array3.length; i++) {
			System.out.printf("%d ", array3[i]);
		}
		*/
		
		int[] array = {3, 7, 8, 1, 5, 9, 6, 10, 2, 4};
		QuickSort sort4 = new QuickSort();
		sort4.quickSort(array, 0, array.length-1);
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%d ", array[i]);
		}
	}
}
