package home_work_5;

import java.util.Arrays;

public class SortByInset {

	public static void sorting(int[] anyMas) {
		for (int i = 1; i < anyMas.length; i++) {
			for (int j = i; j > 0; j--) {
				int temporary;
				if (anyMas[j - 1] > anyMas[j]) {
					temporary = anyMas[j];
					anyMas[j] = anyMas[j - 1];
					anyMas[j - 1] = temporary;
				} else {
					break;
				}
			}
		}

		System.out.println(Arrays.toString(anyMas));

	}
}