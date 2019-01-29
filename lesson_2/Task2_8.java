package second_home_work;
//найти минимальный-максимальный элементы и вывести
import java.util.Scanner;

public class Task2_8 {
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

		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < size_arr; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Минимальное значение:" + " " + min);
		System.out.println("Макcимальное значение:" + " " + max);
	}

}
