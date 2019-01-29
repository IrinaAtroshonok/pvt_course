package second_home_work;

import java.util.Scanner;
//пройти по массиву и помен€ть местами каждые 2 соседних элемента
public class Task2_6 {
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

		for (int i = 0; i < size_arr - 1; i += 2) {
			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}
		for (int x : arr)
			System.out.println(x + " ");
	}

}
