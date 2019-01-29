package home_work_3;

import java.util.Random;
import java.util.Scanner;
//По аналогии создать двумерный массив, заполнить его случайными числами или вручную. для этого массива:
//- вывести все элементы в прямом и обратном порядке
//- найти минимальный и максимальный элементы

public class Add2_1_modified {
	public static void main(String[] args) {
		System.out.print("Введите количетсво строк массива ");
		Scanner row = new Scanner(System.in);
		int row_arr = row.nextInt();

		System.out.print("Введите количетсво столбцов массива ");
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
		// Вывод массива в прямом порядке
		System.out.println("Массив в прямом порядке:");
		System.out.print("");
		directOrder(arr);

		// Вывод массива в обратном порядке
		System.out.println("Массив в обратном порядке:");
		System.out.print("");
		reverseOrder(arr);

		// Минимальный элмент массива
		minElement(arr);

		// Максимальный элмент массива
		maxElement(arr);
	}

//Вывод элементов в прямом порядке
	public static void directOrder(int[][] anyMas) {
		int row_arr = anyMas.length;
		int column_arr = anyMas[0].length;
		for (int i = 0; i < row_arr; i++) {
			for (int j = 0; j < column_arr; j++) {
				System.out.print(anyMas[i][j] + "\t");
			}
			System.out.println(" ");
		}
	}

//Вывод элементов в обратном порядке	
	public static void reverseOrder(int[][] anyMas) {
		int row_arr = anyMas.length;
		int column_arr = anyMas[0].length;
		for (int i = row_arr - 1; i >= 0; i--) {
			for (int j = column_arr - 1; j >= 0; j--) {
				System.out.print(anyMas[i][j] + "\t");
			}
			System.out.println(" ");
		}
	}

//Минимальный элемент массива	
	public static void minElement(int[][] anyMas) {
		int row_arr = anyMas.length;
		int column_arr = anyMas[0].length;
		int min = anyMas[0][0];
		for (int i = 0; i < row_arr; i++) {
			for (int j = 0; j < column_arr; j++) {
				if (min > anyMas[i][j]) {
					min = anyMas[i][j];
				}
			}
		}
		System.out.println("Минимальный элмент массива:" + min);
	}

//Максимальный элемент массива	
	public static void maxElement(int[][] anyMas) {
		int row_arr = anyMas.length;
		int column_arr = anyMas[0].length;
		int max = anyMas[0][0];
		for (int i = 0; i < row_arr; i++) {
			for (int j = 0; j < column_arr; j++) {
				if (max < anyMas[i][j]) {
					max = anyMas[i][j];
				}
			}
		}
		System.out.println("Максимальный элмент массива:" + max);
	}

}
