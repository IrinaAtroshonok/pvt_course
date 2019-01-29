package second_home_work;

import java.util.Scanner;
//заменить все элементы массива на полусумму соседних элементов
public class Task2_11 {
	public static void main(String[] args) {
		System.out.print("¬ведите размер массива:" + " ");
		Scanner size = new Scanner(System.in);
		int size_arr = size.nextInt();
		size.close();
		int[] arr = new int[size_arr];
		for (int i = 0; i < size_arr; i++) {
			arr[i] = (int) (Math.random() * 10);
			System.out.println(arr[i]);
		}
		System.out.println(" ");

		int[] arr2 = new int[size_arr];
		arr2[0] = arr[0];
		arr2[size_arr - 1] = arr[size_arr - 1];
		for (int i = 1; i < size_arr - 1; i++) {
			int count = (arr[i - 1] + arr[i + 1]) / 2;
			arr2[i] = count;
		}
		for (int x : arr2)
			System.out.println(x + " ");
	}
}
