package home_work_5;

import java.util.Arrays;

public class ShellSort {
	public static void sortingShell(int[] anyMas) {
		int step = anyMas.length / 2;
		while (step > 0) {
			for (int i = 0; i < anyMas.length - step; i++) {
				int j = i;
				while ((j >= 0) && (anyMas[j] > anyMas[j + step])) {
					int temporary = anyMas[j];
					anyMas[j] = anyMas[j + step];
					anyMas[j + step] = temporary;
					j--;
				}
			}
			step = step / 2;
		}

		System.out.println(Arrays.toString(anyMas));
	}
}
