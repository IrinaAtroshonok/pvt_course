package second_home_work;

import java.util.Scanner;
//найти и вывести номер нулевых элементов. если нулевых элементов нет - вывести сообщение, что их нет
public class Task2_5 {
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
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				System.out.println("Номер нулевого элемента:" + i + " ");
				count++;
			}
		}
		if (count == 0)
			System.out.println("Нулевых элементов нет");
	}

}
