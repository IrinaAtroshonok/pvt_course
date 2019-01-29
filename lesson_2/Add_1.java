package second_home_work;

import java.util.Random;
import java.util.Scanner;
//По аналогии создать двумерный массив, заполнить его случайными числами или вручную. для этого массива:
//- вывести все элементы в прямом и обратном порядке
//- найти минимальный и максимальный элементы

public class Add_1 {
	public static void main(String[] args) {
		System.out.print("Введите количетсво строк массива");
		Scanner row = new Scanner(System.in);
		int row_arr = row.nextInt();

		System.out.print("Введите количетсво столбцов массива");
		Scanner column = new Scanner(System.in);
		int column_arr = column.nextInt();
		row.close();
		column.close();

		int[][] arr = new int[row_arr][column_arr];
		Random rand = new Random();

		for (int i = 0; i < row_arr; i++) {
			for (int j = 0; j < column_arr; j++) {
				arr[i][j] = rand.nextInt(100);
			}
		}
//Вывод элементов в прямом порядке
		for (int i = 0; i < row_arr; i++) {
			for (int j = 0; j < column_arr; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
//Вывод элементов в обратном порядке		
		for (int i = row_arr - 1; i >= 0; i--) {
			for (int j = column_arr - 1; j >= 0; j--) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
//Минимальный элемент массива			
		int min = arr[0][0];
		for (int i = 0; i < row_arr; i++) {
			for (int j = 0; j < column_arr; j++) {
				if (min > arr[i][j]) {
					min = arr[i][j];
				}
			}
		}
		System.out.println("Минимальный элмент массива:" + min);
//Максимальный элемент массива			
		int max = arr[0][0];
		for (int i = 0; i < row_arr; i++) {
			for (int j = 0; j < column_arr; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
				}
			}
		}
		System.out.println("Максимальный элмент массива:" + max);
	}

}
