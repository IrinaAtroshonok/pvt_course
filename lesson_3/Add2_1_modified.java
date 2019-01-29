package home_work_3;

import java.util.Random;
import java.util.Scanner;
//�� �������� ������� ��������� ������, ��������� ��� ���������� ������� ��� �������. ��� ����� �������:
//- ������� ��� �������� � ������ � �������� �������
//- ����� ����������� � ������������ ��������

public class Add2_1_modified {
	public static void main(String[] args) {
		System.out.print("������� ���������� ����� ������� ");
		Scanner row = new Scanner(System.in);
		int row_arr = row.nextInt();

		System.out.print("������� ���������� �������� ������� ");
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
		// ����� ������� � ������ �������
		System.out.println("������ � ������ �������:");
		System.out.print("");
		directOrder(arr);

		// ����� ������� � �������� �������
		System.out.println("������ � �������� �������:");
		System.out.print("");
		reverseOrder(arr);

		// ����������� ������ �������
		minElement(arr);

		// ������������ ������ �������
		maxElement(arr);
	}

//����� ��������� � ������ �������
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

//����� ��������� � �������� �������	
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

//����������� ������� �������	
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
		System.out.println("����������� ������ �������:" + min);
	}

//������������ ������� �������	
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
		System.out.println("������������ ������ �������:" + max);
	}

}
