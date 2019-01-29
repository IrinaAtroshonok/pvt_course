package second_home_work;

import java.util.Scanner;

//найти произведения всех элементов массива, вывести

public class Task2_2 {
	public static void main(String[] args) {

		System.out.print("Введите размер массива:" + " ");
		Scanner size = new Scanner(System.in);
		int size_arr = size.nextInt();
		size.close();

		double[] arr = new double[size_arr];
		for (int i = 0; i < size_arr; i++) {
			arr[i] = (int) (Math.random() * 10);
			System.out.println(arr[i]);
		}

		int i = 0;
		double result = 1;
		while (i < size_arr) {
			result = result * arr[i];
			i++;
		}
		System.out.println("Произведение =" + " " + result);
	}
}
