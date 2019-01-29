package second_home_work;

import java.util.Scanner;
// пройти по массиву и поменять местами первый и последний, второй и предпоследний и т.д.
public class Task2_7 {
	public static void main(String[] args) {
		System.out.print("Введите размер массива:" + " ");
		Scanner size = new Scanner(System.in);
		int size_arr = size.nextInt();
		size.close();
		int[] arr = new int[size_arr];
		for (int i = 0; i < size_arr; i++) {
			arr[i] = (int) (Math.random() * 10);
			System.out.println(arr[i]);
		}
		System.out.println(" ");

		for (int i = 0; i < size_arr / 2; i++) {
			int temp = arr[size_arr - i - 1];
			arr[size_arr - i - 1] = arr[i];
			arr[i] = temp;
		}
		for (int x : arr) System.out.println(x + " ");
	}

}
