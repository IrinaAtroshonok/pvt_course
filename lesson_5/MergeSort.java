package home_work_5;

import java.util.Arrays;

public class MergeSort {
	// рекурсивная функция сортировки частей массива
	public static int[] sort(int[] anyMas) {
		if (anyMas.length < 2) {
			return anyMas;
		}
		int m = anyMas.length / 2;
		int[] arr1 = Arrays.copyOfRange(anyMas, 0, m);
		int[] arr2 = Arrays.copyOfRange(anyMas, m, anyMas.length);
		return merge(sort(arr1), sort(arr2));
	}

	// слияние двух массивов в один отсортированный
	public static int[] merge(int[] arr1, int arr2[]) {
		int n = arr1.length + arr2.length;
		int[] arr = new int[n];
		int i1 = 0;
		int i2 = 0;
		for (int i = 0; i < n; i++) {
			if (i1 == arr1.length) {
				arr[i] = arr2[i2++];
			} else if (i2 == arr2.length) {
				arr[i] = arr1[i1++];
			} else {
				if (arr1[i1] < arr2[i2]) {
					arr[i] = arr1[i1++];
				} else {
					arr[i] = arr2[i2++];
				}
			}
		}
		return arr;
	}
}